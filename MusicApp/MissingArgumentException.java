/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Missing argument exception used in the Driver class
 */
public class MissingArgumentException extends RuntimeException {

    public MissingArgumentException(String message){
        super(message);
    }
}