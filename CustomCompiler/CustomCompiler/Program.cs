using Antlr4.Runtime;
using CustomCompiler;
//using BasicLanguage;

public class Program
{
    public static void Main()
    {   
        try
        {
            //string code = "int nameThisIntWhateverYouWant = 18;";
            
            //string code = "float nameThisFloatWhateverYouWant = 3.14;";
            string input = File.ReadAllText("../../../input.txt");

            //Console.WriteLine(input);

            AntlrInputStream inputStream = new AntlrInputStream(input);
            CustomLanguageLexer ifConditionLexer = new CustomLanguageLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(ifConditionLexer);
            CustomLanguageParser parser = new CustomLanguageParser(commonTokenStream);


            CustomLanguageParser.Base_structureContext context = parser.base_structure();
            CustomCompilerVisitor visitor = new CustomCompilerVisitor();
            var result = visitor.Visit(context);

            if(!result.HasMain)
                throw new Exception($"Error: Main does not exist..");

            if (result.FunctionList.Last().Name != "main")
                throw new Exception($"Error: Main should be declared last..");

            Console.WriteLine("Valid program!");

            StreamWriter writeGlobals = new StreamWriter("../../../globals.txt");

            foreach (var global in result.GlobalVariables)
            {
                writeGlobals.WriteLine(global.ToString());
                writeGlobals.Flush();
            }

            writeGlobals.Close();

            StreamWriter writeFunc = new StreamWriter("../../../functions.txt");
            
            foreach (var func in result.FunctionList)
            {
                writeFunc.WriteLine(func.ToString());
                writeFunc.Flush();
                writeFunc.WriteLine("Parameters: ");
                foreach (var param in func.Parameters)
                {
                    writeFunc.WriteLine("--> " + param.ToString());
                    writeFunc.Flush();
                }
                writeFunc.WriteLine("Variables: ");
                foreach (var variable in func.Variables)
                {
                    writeFunc.WriteLine("--> " + variable.ToString());
                    writeFunc.Flush();
                }

                writeFunc.WriteLine("Control Structures: ");
                foreach(var control in func.ControlStructures)
                {
                    writeFunc.WriteLine(control.ToString());
                    writeFunc.Flush();
                }

                writeFunc.WriteLine();
            }

            writeFunc.Close();
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }

    }
}