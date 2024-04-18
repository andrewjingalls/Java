import java.util.Random;

public class BabyNameGenerator {
    public static void main(String[] args){
        Random randy = new Random();

        BufferedReader reader = null;

        try {
            //NEED command line argument 
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] words = currentLine.split("\n");
                for (String word : words){
                    if (word.contains("F")){
                        System.out.println(word.randy(3));
                    }
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Cannot find that file!");
        } catch (MissingArgumentsException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println("Something else went wrong");
            System.out.println(e.getMessage());
        }   
        
    }
}