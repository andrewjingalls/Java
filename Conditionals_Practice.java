import java.util.Scanner;

public class Conditionals_Practice {
    public static void main(String[] args) {
        
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num1 = userInput.nextInt();
    System.out.print("Enter another number: ");
    int num2 = userInput.nextInt();
    userInput.nextLine();
    
    System.out.print("Do you want to add or multiply these number: ");
    String operation = userInput.nextLine();
    int answerAdd = (num1 + num2);
    int answerMult = (num1 * num2);

    // String operation = in.next();

    // switch (operation) {
    //     case "add":
    //         System.out.println(num1+num2);
    //         break;
    //     case "multiply":
    //         System.out.println(num1*num2);
    //         break;
    //     default:
    //         System.out.println("I don't know what you mean");
    //         break;
    // }


    if (operation.equals("add")) {
    
       System.out.println("The answer is: " + answerAdd);

    }else {
        System.out.println("The answer is: " + answerMult);
    }
    }
    }



    // Scanner num2 = new Scanner(System.in);
    // System.out.print("Enter another number: ");

