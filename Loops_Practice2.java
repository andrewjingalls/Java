import java.util.Scanner;
import java.util.Random;

public class Loops_Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randomGenerator = new Random();

        
        System.out.print("Ask me a yes or no question. (Type 'exit' to exit): ");
        String question = in.nextLine();

        
        while (!question.equals("exit")) {
            int randomNumber = randomGenerator.nextInt(10);
            if (randomNumber >=7) {
                System.out.println("Yes");
            }
            else if (randomNumber < 7) {
                System.out.println("No");
            }
            System.out.print("Ask me another question (Type 'exit' to exit): ");
            question = in.nextLine();
        }
        
    }
}
