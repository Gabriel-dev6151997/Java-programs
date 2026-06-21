//Alpha Ai
import java.util.Scanner;
public class Alpha {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("________ALPHA-AI CHATBOT________");
        System.out.println("Alpha Ai always responds, text anything and get absolute answers on instant fully offline.");
        System.out.println("Remember Ai answers are not 100% accurate.");
        System.out.println("");
        System.out.print("You: ");
        String chat = input.nextLine();
        System.out.println("Alpha AI: Hello, My Name is Alpha Ai, How can i help you");
        System.out.println();
        System.out.print("You: ");
        String chat1 = input.nextLine();
        System.out.println("Alpha AI: My founder is Gabriel Patrick CEO of Oracle");
        System.out.println();
        System.out.print("You: ");
        String chat2 = input.nextLine();
        System.out.println("Alpha AI: Ask as many questions as you like;");
        String[] services = new String[5];
        services[0] = "Weather";
        services[1] = "Politics";
        services[2] = "Philosophy";
        services[3] = "Tech";
        services[4] = "Science";
        for(int i=0; i<services.length; i++){
            System.out.println(services[i]);
        }
        System.out.println();
        while(true){
            System.out.print("You: ");
            String chat3 = input.nextLine();
            System.out.println("Alpha AI: Program under development, ask another question please...");
            System.out.println();
        }
    }
    
}