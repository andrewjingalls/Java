/*
* Hash maps
* Associative Data Structure
* (vs a sequential data structure like a list)
* - stores key/value pairs
* - designed for a key to map to a value
* (not other way around)
* - no duplicate keys
*/
import java.util.HashMap;
public class Maps_practice{
    public static void main(String[] args){

    //create a hashmap
    HashMap<String, String> capitals = new HashMap<String,String>();
    System.out.println(capitals);

    //add to HashMap
    //put TX as key and Austin as a value into Hashmap
    capitals.put("TX","Austin");
    capitals.put("NY","Albany");
    System.out.println(capitals);

    //will overrise if key already exists
    capitals.put("NY", "Manhattan");
    System.out.println(capitals);

    //retreive value by key
    String capital_of_tx = capitals.get("TX");
    System.out.println(capital_of_tx);

    //check if hashmap contains key or value
    System.out.println(capitals.containsKey("MI"));
    System.out.println(capitals.containsValue("Manhattan"));

    //looping through keys in hashmap
    //use .values() to loop through values
    for (String state : capitals.keySet()) {
        System.out.println("Key: " + state);
        System.out.println("The capital of " + state + " is " + capitals.get(state));
    }


    }
}