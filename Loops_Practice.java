import java.util.Scanner;

public class Loops_Practice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int countGrades = 0;
        int sumGrades = 0;
        int nextGrade = 0;

        System.out.print("Enter grade (-1 to quit)): ");
        
        nextGrade = in.nextInt();

        while (nextGrade != -1) {
            sumGrades += nextGrade;
            countGrades++;
            System.out.print("Enter grade (-1 to quit)): ");
        
            nextGrade = in.nextInt();
        }

        float avg = sumGrades / countGrades;
        System.out.println("The class average was " + avg);

       
        
    }
}