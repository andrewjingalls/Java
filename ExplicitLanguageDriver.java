import java.util.Scanner;
public class ExplicitLanguageDriver{

    public static void main(String[] args){

        System.out.println("Ask me a question");
        String[] curses = {"fuck", "bitch", "shit"};

        Scanner scnr = new Scanner(System.in);
        String question = scnr.nextLine();
        try {
            if (question.contains(curses)){
                throw new ExplicitLanguageException("Dont use that language");
            }
        } catch (MissingArgumentsException e){
            System.out.println(e.getMessage());
        }
    
    }
}