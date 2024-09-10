package bots;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnthropicChatModel model = AnthropicChatModel.withApiKey(System.getenv("ANTHROPIC_API_KEY"));
        String answer = model.generate("Say 'Hello World'");
        System.out.println(answer);
    }
}
