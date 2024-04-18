public interface Rentable {
    /* 
    Rentable interface defines methods requried to build Objects 
    in a library, where objects can be checked in or out
    */

    public boolean checkIn();
    public boolean checkOut();
}