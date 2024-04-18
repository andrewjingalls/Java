import java.io.*;

public class WritingFiles{
    public static void main(String[] args){
        PrintWriter writer = null;

        HogwartsStudent cedric = new HogwartsStudent("Cedric Diggory", 18, "Gryffindor");


        try {
            //first param to FileWriter is path to file
            //second param is optional -- boolean of whether or not to append
            writer = new PrintWriter(new FileWriter("./students.txt", true));
            writer.println("HOGWARTS STUDENT ROSTER");
            writer.println(cedric);
            writer.println("Hello World");
        } catch (IOException e) {
            System.out.println("Something went wrong when writing students");
        } finally {
            if (writer != null){
                writer.close();
            }
        }
    }
}