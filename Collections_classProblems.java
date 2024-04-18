import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class Collections_classProblems {
    public static void main(String[] args) {

    //4. Create a HashMap with String as both the key 
    //and value type paramter. Then, add a few words 
    //as keys and a relevant emoji as values.

    //Write a program that takes the string of a text message 
    //(you can hardocde this) and returns that message with an 
    //emoji in front of each word that exists in the dictionary.
    HashMap<String,String> message = new HashMap<String,String>();
    message.put("code", "👩‍💻");
    message.put("psychopath", "🗡️");
    String sentence = "Whoever writes code is a psychopath";
    String newMessage = "";
    for (String word : sentence.split("\\s+")) {
        //look at every word in original string
        //if word is a key value in HashMap, then add emoji and word
        //if word is not key, just add word
        if (message.containsKey(word)){
            //word is in fact a key
            newMessage += message.get(word) + word + " ";
        } else {
            newMessage += word + " ";
        }

    }

    System.out.println(newMessage);



    }
}