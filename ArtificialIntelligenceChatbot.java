import java.util.Scanner;

public class ArtificialIntelligenceChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userinput;
        System.out.println("Hello!I am your chatbot.");
        System.out.println("Type 'bye' to exit.");
        while (true) {
            System.out.println("you:");
            userinput = sc.nextLine().toLowerCase();
            if (userinput.contains("hello")) {
                System.out.println("Bot:Hello!How can I help you?");
            } else if (userinput.contains("how are you")) {
                System.out.println("Bot:I am doing great! How about you?");
            } else if (userinput.contains("your name")) {
                System.out.println("Bot: I am a simple java chatbot.");
            } else if (userinput.contains("help")) {
                System.out.println("Bot:I can answer simple questions.");
            } else if (userinput.contains("bye")) {
                System.out.println("Bot:GoodBye!Have a nice day");
                break;
            } else {
                System.out.println("Bot:Sorry,I didn't understand that.");
            }
        }
    }

}
