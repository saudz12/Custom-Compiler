using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCompiler;
public class ProgramData
{
    public enum Type
    {
        Int,
        Float,
        Double,
        String
    }

    StreamWriter _writer = new StreamWriter("../../../lexicalunits.txt");
    public void WriteLexic(string s)
    {
        _writer.WriteLine(s);
        _writer.Flush();
    }

    public class Variable
    {
        public Type VariableType { get; set; }
        public dynamic? Value { get; set; }
    }
    public List<Variable> Variables { get; set; } = new List<Variable>();

    public class Function
    {
        public Type ReturnType { get; set; }
        public string Name { get; set; }
        public List<Variable> ParamList { get; set; } = new List<Variable>();
    }


    public class If
    {
        
    }
}

