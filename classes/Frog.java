/** A representation of a Frog with variables for 
* color, number or legs, length of tongue, and if its toxic or not  
*
*
* @author Andrew Ingalls
* @version 1.0
*/


public class Frog {
    //member variables
    private String color;
    private int numLegs;
    private double tongueLength; //inches
    private boolean isToxic;

    /**Default constructor which sets frog to color to null
    * numlegs and tongue to 0 and false to toxic */
    public Frog() {
        color = null;
        numLegs = 0;
        tongueLength = 0.0;
        isToxic = false;
    }

    /**Overloaded constructor which accepts values for variables
    * @param color, string representation of color of the frog
    * @param numLegs, integer representation of number of legs
    * @param tongueLength, double representation of length of tongue
    * @param isToxic, boolean representation if frog is toxic or not 
    */
    public Frog(String color, int numLegs, double tongueLength, boolean isToxic) {
        this.color = color;
        this.numLegs = numLegs;
        this.tongueLength = tongueLength;
        this.isToxic = isToxic;
    }

    /**Copy constructor, makes a copy of Frog object */
    public Frog(Frog other){
        this.color = other.color;
        this.numLegs = other.numLegs;
        this.tongueLength = other.tongueLength;
        this.isToxic = other.isToxic;
    }


    //accessors & mutators
    public String Color() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int NumLegs(){
        return numLegs;
    }
    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }

    public double TongueLength() {
        return tongueLength;
    }
    public void setTongueLength(double tongueLength){
        this.tongueLength = tongueLength;
    }

    public boolean IsToxic(){
        return isToxic;
    }
    public void setIsToxic(boolean isToxic){
        this.isToxic = isToxic;
    }

    public string toString(){
        return "Frog is " + color + " with " + numLegs + " legs";
    }


    equals method
    public boolean equals(Frog o){
        if (!(o instanceOf Frog)){
            return false;
        }
    }

    public static void main(String[] args) {
        Frog myFrog = new Frog("green", 4, 5.3, false);
        Frog dave = new Frog(myFrog);
        System.out.println(myFrog);
    }

}