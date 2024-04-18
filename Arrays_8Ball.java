import java.util.Random;
import java.util.Scanner;

public class Arrays_8Ball{
    public static void main(String[] args) {
    /* Write a magic 8 ball program 
    that defines a String array of possible responses. 
    Allow the user to enter a question and randomly
     select a response from the String array to print 
     out to the screen. The user should be able to ask 
     3 questions before the program quits. */
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        String[] responses = {
            "Yes",
            "No",
            "Maybe",
            "Ask again in 76 seconds",
            "I know the answer, but I wont tell you"
        };

       
        for (int i = 0; i < 3; ++i) {
            //get a question from user then print random response
            System.out.print("Ask me a question: ");
            String question = in.nextLine();
            System.out.println(responses[rand.nextInt(responses.length)]);

        }

    }
}