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
            var restult = visitor.Visit(context);
            
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }

    }
}