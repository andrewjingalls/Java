import java.util.Random;
import java.util.Scanner;

public class Loops_Lecture {
    public static void main(String[] args) {

        // //creating Scanner and Random objects
        // Random randomGenerator = new Random();
        // Scanner userInput = new Scanner(System.in);
        // int randomNumber = randomGenerator.nextInt(100) + 1;
        // System.out.println("Computer Generated ~{(" + randomNumber + ")}~");

        // int guess = userInput.nextInt();

        // //while loops
        // while (guess != randomNumber) {
        //     System.out.println("Wrong!");
        //     System.out.print("Guess a number: ");
        //     guess = userInput.nextInt();

        //for loops
        // int flirtLevel = 5;
        // String message = "hey";
        // for (int i = 0; i < flirtLevel; ++i) {
        //     message += "y";
        // }
        // System.out.println("New Message: " + message);


        //Useful string methods
        String data = "movies,movies,books,movies,books,books,tv";
        String searchTerm = "tv";
        //Is term in larger string?
        System.out.println(data.contains(searchTerm));
        
        //where is first occurance of books?
        System.out.println(data.indexOf("books"));

        System.out.println(data.toUpperCase());
        System.out.println(data);

        System.out.println(data.replace("movies","tv"));
        System.out.println(data); //does not modify directly

        System.out.println(data.split(","));


        //for each loop
        //shorthand for loop used to iterate through every item in collection
        for (String word : data.split(",")) {
            System.out.print(word + " ");
        }
    }
}