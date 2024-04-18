import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;
public class ComparingLists_inClass{
    public static void main(String[] args){

    // create the Integer LinkedLists and ArrayLists
    // as well as your Random object
    ArrayList<Integer> al = new ArrayList<Integer>();
    LinkedList<Integer> ll = new LinkedList<Integer>();
    Random rand = new Random();
    Integer[] normy = new Integer[100000];
    
    long start = System.currentTimeMillis();
    // populate each list with 100,000 random integers
    for (int i = 0; i < 100000; ++i) {
      int r = rand.nextInt(); // get random index
      al.add(r);
    }
    long stop = System.currentTimeMillis();
    System.out.println("ArrayList time required for population: " + (stop - start));

    start = System.currentTimeMillis();

    for (int i = 0; i < 100000; ++i) {
      int r = rand.nextInt(); // get random index
      ll.add(r);
    }
    stop = System.currentTimeMillis();
    System.out.println("LinkedList time required for population: " + (stop - start));

    
    start = System.currentTimeMillis();
    for (int i = 0; i < 100000; ++i) {
      int r = rand.nextInt(); // get random index
      normy[i] = r;
    }
    stop = System.currentTimeMillis();
    System.out.println("Simple array time required for population: " + (stop - start));


    // Calculate the sum of 20,000 random integers
    // in the ArrayList
    // Print out how many milliseconds it took to calc
    start = System.currentTimeMillis();
    int sum = 0;
    for (int i = 0; i < 20000; ++i) {
      int index = rand.nextInt(100000); // get random index
      sum += al.get(index);
    }
    stop = System.currentTimeMillis();
    System.out.println("ArrayList time required for access: " + (stop - start));

    start = System.currentTimeMillis();
    sum = 0;
    for (int i = 0; i < 20000; ++i) {
      int index = rand.nextInt(100000); // get random index
      sum += ll.get(index);
    }
    stop = System.currentTimeMillis();
    System.out.println("LinkedList time required for access: " + (stop - start));

    
    start = System.currentTimeMillis();
    sum = 0;
    for (int i = 0; i < 20000; ++i) {
      int index = rand.nextInt(100000); // get random index
      sum += normy[index];
    }
    stop = System.currentTimeMillis();
    System.out.println("Simple array time required for access: " + (stop - start));
  }



        // ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        // LinkedList<Integer> numbersLinked = new LinkedList<Integer>();

        // Random randnum = new Random();

        // numbersArray.add(randnum.nextInt(100000));
        // numbersLinked.add(randnum.nextInt(100000));

        // sumArray = numbersArray.randnum(20000);
        // sumLinked = numbersLinked.randnum(20000);
        // System.out.println()

        // long start = System.currentTimeMillis();
        // long stop = System.currentTimeMillis();
        // System.out.println("Elapsed: " + (stop - start));
}



//create arraylist of integers
//crewte linked list of integers
//populate both with 100,000 random ints
// print time it takes for each list
// to choose 20000 ints and sum them togehter
