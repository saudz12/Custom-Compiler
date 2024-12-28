using Antlr4.Runtime;
//using BasicLanguage;

public class Program
{
    public static void Main()
    {   
        string x = "0000123.1001231400";
        Console.WriteLine(Convert.ToDouble(x));
        Console.WriteLine(5 / 2);
        int a = 3, b = 5;
        a = b += 9;

        try
        {
            //string code = "int nameThisIntWhateverYouWant = 18;";
            string code = "int nameThisStringWhateverYouWant = 45;";
            //string code = "float nameThisFloatWhateverYouWant = 3.14;";

            AntlrInputStream inputStream = new AntlrInputStream(code);
            CustomLanguageLexer ifConditionLexer = new CustomLanguageLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(ifConditionLexer);
            CustomLanguageParser parser = new CustomLanguageParser(commonTokenStream);

            //CustomLanguageParser.DeclarationContext context = parser.declaration();
            //LanguageVisitor languageVisitor = new LanguageVisitor();
            //var result = languageVisitor.Visit(context);

            //Console.WriteLine($"The type of the variable is {result.Variables[0].VariableType.ToString()} and its value is {result.Variables[0].Value}");
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }

    }
}