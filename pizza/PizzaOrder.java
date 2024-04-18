/**
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP2: Pizza
 * 
 * This class takes the pizzas that are created and adds them to the order.
 * It also calculates the total of the order. 
 */
public class PizzaOrder{
    /** Private member variables */
    private Pizza[] m_order;
    private int m_numPizzas;

    /**Default Constructor sets the pizza order to a default 
     * medium cheese pizza*/
    public PizzaOrder(){
        String pizzaSize = "Medium";
        int numCheese = 1;
        int numPep = 0;
        int numVeg = 0;
    }

    /**Overloaded Constructor which takes in an integer
     * parameter and sets the order array to that size
     * @param m_numPizzas, the number of pizzas in the order
     */
    public PizzaOrder(int m_numPizzas){
        m_order = new Pizza[m_numPizzas];
    }

    /**addPizza method adds the pizza into the order array. 
     * If there is space in the order, it returns a 1.
     * If the order is full, it returns a -1
     * @param pizza, the pizzas being added to the order
     * @return a 1 or -1 depending on whether the pizza was 
     * successfully added or not
     */
    public int addPizza(Pizza pizza) {
        int added = 1;
        int full = -1;
        for (int i = 0; i < m_order.length; i++){
            if (m_order[i] == null){
                m_order[i] = pizza;
                return added;
                }
            }
            return full;
        }


    /** calcTotal class takes all the pizzas in the order
     * and runs the calcCost method from Pizza class and adds 
     * the totals, giving us the total of the order.
     * @return the total cost of the order
     */
    public double calcTotal() {
        double total = 0.0;
        for (Pizza pizzas : m_order){
            total += pizzas.calcCost();
        }
        return total;
    }

    /**toString method takes all the pizzas and displays them out in a 
     * string and also takes in the calcTotal method to display the total
     * cost of the order. 
     * @return a string of the order and the total cost. 
     */
    public String toString(){
        String order = " ";
        for (int i = 0; i< m_order.length; i++){
            order += m_order[i];
        }
        return "You have " + m_order.length + " pizzas in your order which are a" + order + "The total will be " + calcTotal() + " dollars.";
    }

}