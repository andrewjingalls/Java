import java.util.ArrayList;
import java.util.Collections;
public class BandDriver {
  public static void main(String[] args) {

    Drums standard = new Drums();
    Drums trap = new Drums(2);
    Drums giant = new Drums(12);

    ArrayList<Drums> percussion = new ArrayList<Drums>();
    percussion.add(standard);
    percussion.add(trap);
    percussion.add(giant);

    System.out.println(percussion);
    Collections.sort(percussion);
    System.out.println(percussion);

    System.out.println(standard.checkOut());
    System.out.println(standard.checkOut());
    System.out.println(standard.checkIn());
    System.out.println(standard.checkOut());
















    // // CANNOT create an instance of an abstract class
    // // Instrument i = new Instrument();
    // // System.out.println(i);

    // // We CAN instantiate objects of children of abstract classes
    // Guitar g = new Guitar();
    // System.out.println(g);
    // Drums d = new Drums();
    // System.out.println(d);

    // d.play();
    // g.play();

    // /* We cannot create a single object of an abstract class, but we can use the abstract class to group together child objects in collections */
    // ArrayList<Instrument> band = new ArrayList<Instrument>();
    // band.add(g);
    // band.add(d);

    // System.out.println(band);

    // for (Instrument i : band) {
    //   // calls the play method of child objects
    //   // (not the Instruemtn object)
    //   // (example of polymorphism)
    //   i.play();
    // }
  }
}