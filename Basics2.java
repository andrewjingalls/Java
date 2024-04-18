import java.util.Scanner;
public class Basics2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What was your total screen time yesterday?");
        int totalMins = userInput.nextInt();
        //System.out.println("You will spend " + totalMins*7 + " minutes a week on you screen.");
        //System.out.println(totalMins*7*30 + " Minutes a month.");
        int totalMinsLife = totalMins*7*30*12*64-11212800;
        System.out.println("You will spend " +(totalMinsLife) + " minutes of your life on your phone.");
        System.out.println("That is " + (totalMinsLife/60)+ " total hours on your phone.");
        System.out.println("And " + (totalMinsLife/60/24)+" total days.");
        System.out.println((totalMinsLife/60/24/365) + " years...");
    }

}