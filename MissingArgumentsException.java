public class MissingArgumentsException extends RuntimeException {
    //we extend RuntimeException because we want this to be an unchecked Exception
    //We just provide a constructor that accepts an error messge
    public MissingArgumentsException(String message){
        super(message);
    }
}