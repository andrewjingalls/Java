/* 
  Drums is a child class of Instrument
  It inherits all properties and methods of Instrument,
  just like normal inheritance.

  We implement comparable interface to establish 
*/
public class Drums extends Instrument implements Comparable<Drums> {
  private int n_pieces;

  public Drums() {
    super("percussion");
    this.n_pieces = 5;
  }

  public Drums(int n_pieces) {
    super("percussion");
    this.n_pieces = n_pieces;
  }

  public String toString() {
    return this.n_pieces + " piece kit";
  }

  /* Our implementation of the abstract method play
     fulfills our agreement with the parent class
  */
  public void play() {
    System.out.println("badum pschhhh");
  }

  /* 
    We are fulfulling contract with Comparable interface by providing compareTo method

    compareTo always returns an integer 
    - 0 if both drum objects are equal
    - Negative if this Drum is less than other Drum
    - Positive if this Drum is greater than other Drum
  */

  public int compareTo(Drums other) {
    return this.n_pieces - other.n_pieces;

  }
}