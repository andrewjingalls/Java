/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP2: Pizza
 * 
 * This class creates the pizza objects and calculates the individual
 * costs of the pizzas
 */
public class Pizza {

    /** Private member variables */
    private String pizzaSize = " ";
    private int numCheese = 0;
    private int numPep = 0;
    private int numVeg = 0;

    /**Default Constructor sets a pizza to a medium cheese pizza
     */
    public Pizza(){
        pizzaSize = "Medium";
        numCheese = 1;
        numPep = 0;
        numVeg = 0;
    }

    /**Overloaded Constructor accepts values for the pizza size
     * number of cheese, pepperoni, and veggie ingredients
     * @param pizzaSize, the size of the pizza
     * @param numCheese, the number of cheese ingredients
     * @param numPep, number of pepperoni ingredients
     * @param numVeg, number of veggie ingredients
     */
    public Pizza(String pizzaSize, int numCheese, int numPep, int numVeg){
        this.pizzaSize = pizzaSize;
        this.numCheese = numCheese;
        this.numPep = numPep;
        this.numVeg = numVeg;
    }

    /** Copy constructor
     * @param other, a different pizza 
     */
    public Pizza(Pizza other) {
        this.pizzaSize = other.getSize();
        this.numCheese = other.getCheese();
        this.numPep = other.getPep();
        this.numVeg = other.getVeg();
    }

    /**Accessor for size of the pizza
     * @return string of pizza size
     */
    public String getSize() {
        return this.pizzaSize;
    }
    /**Mutator for pizza size 
     * @param newSize, the new string of size of pizza
     */
    public void setSize(String newSize) {
        this.pizzaSize = newSize;
    }

    /**Accessor for cheese topping
     * @return number of cheese
     */
    public int getCheese() {
        return this.numCheese;
    }
    /**Mutator for cheese topping
     * @param newCheese, new number of cheese
     */
    public void setCheese(int newCheese) {
        this.numCheese = newCheese;
    }

    /**Accessor for pepperoni topping
     * @return number of pepperoni 
     */
    public int getPep() {
        return this.numPep;
    }
    /**Mutator for number of pepperoni topping
     * @param newPep, new number of pepperoni
     */
    public void setPep(int newPep) {
        this.numPep = newPep;
    }

    /**Accessor for veggie topping
     * @return number of veggie topping
     */
    public int getVeg() {
        return this.numVeg;
    }
    /**Mutator for new veggie topping 
     * @param newVeg, new number of veggie topping
    */
    public void setVeg(int newVeg) {
        this.numVeg = newVeg;
    }

    /**calcCost method takes the parameters of the pizza
     * and calculates the cost of that pizza based off 
     * the set prices.
     * @return cost of the individual pizza
     */
    public double calcCost() {
        double cost = 0.0;
        int i;
        if (pizzaSize.equals("Small")){
            cost += 10.0;
        }
        if (pizzaSize.equals("Medium")){
            cost += 12.0;
        }
        if (pizzaSize.equals("Large")){
            cost += 14.0;
        }

        if (numCheese > 0){
            for (i = 0; i < numCheese; ++i){
                cost += 2.0;
            }
        }
        if (numPep > 0){
            for (i = 0; i < numPep; ++i){
                cost += 2.0;
            }
        }
        if (numVeg > 0){
            for (i = 0; i < numVeg; ++i){
                cost += 2.0;
            }
        }
        return cost;
    }

    /**toString method takes the parameters of the 
     * pizza and displays them in a string with the
     * cost of that pizza
     * @return string of description of pizza
     */
    public String toString() {
        return pizzaSize + " pizza with " + numCheese + " cheese, " + numPep + " pepperoni, and " + numVeg + " veggies will cost " + calcCost() + " dollars. ";
    }
    
    /**equals method checkes to see if two pizzas
     * are equal or identical 
     * @return boolean if pizzas are the same
     */
    public boolean equals(Object o){
        if (!(o instanceof Pizza)){
            return false;
        } else {
            Pizza other = (Pizza) o;
            return other.getSize().equals(this.pizzaSize)
                && other.getCheese()==(this.numCheese)
                && other.getPep()==(this.numPep)
                && other.getVeg()==(this.numVeg);
        }
    }
}