/**
 * @Author Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP2: Pizza
 * 
 * This class is the driver class for the pizza project. 
 * In this class you create new pizza objects and add them 
 * to the order. Then it displays the order and the order total.
 */

public class PizzaDriver {

    public static void main(String[] args){

        Pizza pizza1 = new Pizza("Medium", 1, 3, 7);
        Pizza pizza2 = new Pizza("Medium", 18, 34, 0);

        // Pizza pizza3 = new Pizza(pizza2);
        // Pizza pizza4 = new Pizza(pizza1);

        PizzaOrder order = new PizzaOrder(2);

        System.out.println(order.addPizza(pizza1));
        System.out.println(order.addPizza(pizza2)); 
        // System.out.println(order.addPizza(pizza3));
        // System.out.println(order.addPizza(pizza4));

        // System.out.println(pizza1.equals(pizza3));

        System.out.println(order); 

    }
}