import java.io.*;
import java.util.HashMap;

public class ReadingFiles{
    public static void main(String[] args){
        /* 
            Read in poem from the files and count 
            occurrences of each word in file
        */
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        //create a BufferedReader object
        //similar to an input stream but it has some efficiency benefits
        BufferedReader reader = null;

        //whenever we open files for input/output, need to wrap in 
        //try catch block since IOExceptions are checked exceptions
        try {
            //create a BufferedReader object around a FileReader object
            //pass path to file into the filereader constructor
            reader = new BufferedReader(new FileReader("./Poem.txt"));

            //create a variable to represent current line in file
            //loop through file until there is no more content
            //i.e.(until the next line is null)
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                String[] words = currentLine.split("\\s+");
                //loop through each word in line
                for (String word : words){
                    //see if weve seen this word before,
                    if (wordCount.containsKey(word)){
                        //we have already seen this word
                        //if so, increment count

                        wordCount.put(word, wordCount.get(word)+1);
                    } else {
                        wordCount.put(word, 1);
                    }
                    //if not, add word to hashmap with count of one

                }

            }
            System.out.println(wordCount);
        } 
        catch (FileNotFoundException e) {
            System.out.println("We cannot find that file :(");
        } 
        catch (IOException e){
            System.out.println("Something else went wrong during reading this file.");
            System.out.println(e.getMessage());
        } 
        finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}