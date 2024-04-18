/* 
  Guitar is a child class of Instrument
  It inherits all properties and methods of Instrument,
  just like normal inheritance.
*/
public class Guitar extends Instrument {
  private int n_strings;

  public Guitar() {
    super("string");
    this.n_strings = 6;
  }

  public Guitar(int n_strings) {
    super("string");
    this.n_strings = n_strings;
  }

  /* Our implementation of the abstract method play
     fulfills our agreement with the parent class
  */
  public void play() {
    System.out.println("strum strum strum...");
  }

}