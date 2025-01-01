using Antlr4.Runtime.Misc;
using Microsoft.VisualBasic;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace CustomCompiler;
public class ProgramData
{
    public enum ReturnType
    {
        Int,
        Float,
        Double,
        String,
        Void,
    }
    public bool ConvertableType(ReturnType t1, ReturnType t2)
    {
        if ((t1 == ReturnType.Int || t1 == ReturnType.Float || t1 == ReturnType.Double) && t2 == ReturnType.String)
            return false;
        if ((t2 == ReturnType.Int || t2 == ReturnType.Float || t2 == ReturnType.Double) && t1 == ReturnType.String)
            return false;

        return true;
    }
    public enum FuncType
    {
        Normal,
        Main,
    }
    public enum IterationType
    {
        Recursive,
        Iterative,
    }
    public bool HasMain = false;

    StreamWriter _writer = new StreamWriter("../../../lexicalunits.txt");
    public void WriteLexic(string s)
    {
        _writer.WriteLine(s);
        _writer.Flush();
    }

    public class Variable
    {
        public ReturnType VariableType { get; set; }
        public string Name { get; set; }
        public dynamic? Value { get; set; }

        public override string ToString()
        {
            return $"<type>({VariableType.ToString()}) <name>({Name}) <value>({Value})";
        }
    }
    public List<Variable> GlobalVariables { get; set; } = new List<Variable>();

    public bool CheckGlobalReoccurence(string name)
    {
        foreach (var variable in GlobalVariables)
        {
            if (variable.Name == name)
                return true;
        }
        return false;
    }

    public interface IScope
    {
        public List<Variable> Variables { get; set; }
    }

    //public class ElseIf : IScope
    //{
    //    public List<Variable> Variables { get; set; } = new List<Variable>();
    //}
    //public class Else : IScope
    //{
    //    public List<Variable> Variables { get; set; } = new List<Variable>();
    //}
    //public class If : IScope
    //{
    //    public List<ElseIf> ElifStatemenmts { get; set; } = new List<ElseIf> { };
    //    public Else? ElseStatement { get; set; }
    //    public List<Variable> Variables { get; set; } = new List<Variable>();

    //}

    //public class Loop : IScope
    //{
    //    public List<Variable> Variables { get; set; } = new List<Variable>();
    //}

    public class Function : IScope
    {
        public ReturnType? ReturnType { get; set; }

        public FuncType? FunctionType { get; set; }

        public IterationType? IterationType { get; set; }

        public string? Name { get; set; }

        public List<Variable> Variables { get; set; } = new List<Variable>();

        public List<Variable> Parameters { get; set; } = new List<Variable>();

        public List<Pair<string, int>> ControlStructures { get; set; } = new List<Pair<string, int>>();

        public override string ToString()
        {
            return $"<return>({ReturnType.ToString()}) <name>({Name}) : <type>({FunctionType.ToString()}) <iteration>({IterationType.ToString()}))";
        }
        public bool CheckReoccurance(string name)
        {
            foreach (Variable v in Parameters)
            {
                if (v.Name == name)
                    return true ;
            }
            foreach (Variable v in Variables)
            {
                if (v.Name == name)
                    return true;
            }

            return false;
        }

    }

    public List<Function> FunctionList { get; set; } = new List<Function>();

    public bool CheckFunctionReoccurance(Function function)
    {
        for (int i = 0; i < FunctionList.Count() - 1; i++)
        {
            Function f = FunctionList[i];

            if (f.Name != function.Name)
                continue;
            if (f.Parameters.Count != function.Parameters.Count)
                continue;

            bool ok = true;

            for (int j = 0; j < f.Parameters.Count() && ok; j++)
            {
                if (f.Parameters[j].VariableType != function.Parameters[j].VariableType)
                    ok = false;
            }

            if (ok)
                return true;
        }

        return false;
    }

    public bool CheckFunctionReoccurance(Function f1, Function f2)
    {
        if(f1.Name != f2.Name)
            return false;
        if(f1.Parameters.Count != f2.Parameters.Count)
            return false;

        HashSet<string> names = new HashSet<string>();
        foreach (Variable v in f1.Parameters)
        {
            names.Add(v.ToString());
        }

        bool ok = true;

        foreach (Variable v in f2.Parameters)
        {
            if (!names.Contains(v.ToString()))
                ok = false;
        }

        return ok;
    }
}

