//THIS FILE WORKS ON IF ELSE, SWITCHES, AND RANDOMNUM
import java.util.Random;


public class Conditionals {
    public static void main(String[] args) {
        // String FAVORITE_DOG = "Golden Retriever";
        // String guess = "Golden Retriever";

       /*  if (guess.equals(FAVORITE_DOG)) {
            System.out.println("You guessed it!");
        } else if (guess.equals("Australian Shepherd")) {
            System.out.println("No but close");
        } else {
            System.out.println("No you are wrong");
        }*/


        // switch (guess) {
        //     case "Golden Retriever":
        //         System.out.println("You guessed it!");
        //         break;
        //     case "Australian Shepherd":
        //         System.out.println("No but close");
        //         break;
        //     default:
        //         System.out.println("No you're wrong");
        // }

        Random rand = new Random();
        int randomNumber = rand.nextInt(10) +1;
        if (randomNumber <= 5) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        
        }

    }
}