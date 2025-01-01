using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
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
    }

    public List<Function> FunctionList { get; set; } = new List<Function>();

}

