import java.util.ArrayList;
import java.util.LinkedList;
public class Collections_practice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);


        System.out.println("Does 4 exist in list?");
        System.out.println(numbers.contains(4));
        System.out.println(numbers.size());
        numbers.remove(0);
        // numbers.remove(new Integer(9));
        System.out.println(numbers);


        LinkedList<Integer> numbersLL = new LinkedList<Integer>();
        numbersLL.add(10);
        numbersLL.add(30);
        System.out.println(numbersLL);
    }
}
