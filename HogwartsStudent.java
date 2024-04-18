import java.util.Random;
public class HogwartsStudent{

    private String house;
    public static Random randy = new Random();
    public static String[] houses = {"Gryffindor", "Slytherin", "Ravenclaw", "Hufflepuff"};

    public HogwartsStudent(){
        super();
        int randomIndex = randy.nextInt(HogwartsStudent.houses.length);
        this.house = houses[randomIndex];
    }

    public HogwartsStudent(String name, int age, String house){
        super(name, age);
        this.house = house;
    }

    // public HogwartsStudent(String name, int age){
    //     super (name, age);
    //     int
    // }

    public String toString(){
        return super.toString() + "\nHouse: " + house;
    }

    public void expelliarmus(){
        System.out.println("... nothing happens");
    }
    
}