/*
  ABSTRACT CLASSES
  - you cannot instantiate an object of an abstract class
  - just used to share properties between the children of an abstract class
  - use keyword abstract in class definition
*/
public abstract class Instrument implements Rentable{
  private String category;
  private boolean isAvailable;

  public Instrument() {
    category = "brass";
    isAvailable = true;
  }

  public Instrument(String category) {
    this.category = category;
    isAvailable = true;
  }

  public String toString() {
    return category + " Instrument";
  }

  /* ABSTRACT METHODS
     - allow you to define methods that all child classes should implement
     - abstract methods do not have a method body, just a signature
     - enforce developers of the child class to provide that implementation
  */
  public abstract void play();

    /*  Complete agreement */
  public boolean checkIn() {
    this.isAvailable = true;
    return true;
  }
  public boolean checkOut(){
    if (this.isAvailable){
        this.isAvailable = false;
        return true;
    } else {
        return false;
    }
  }


}