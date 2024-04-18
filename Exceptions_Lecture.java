public class Exceptions_Lecture{
    /* 
    Exception Handling
    - two types of exceptions we can handle: unchecked and checked
    - checked exceptions we are required to handle
    - unchecked exceptions are common operations that might cause an error, 
    we can handle them if we want
    */

    //defining a method that may or may not throw an ArithmeticException
    // public static double divide(int a, int b) throws ArithmeticException{
    //     if (b == 0){
    //         //make responsibility of handling exception 
    //         //whoever called this method
    //         //instead of handling exception within method
    //         throw new ArithmeticException("You cannot divide by zero");
    //     } else{
    //         //if b is not 0, not need to throw exception
    //         return (double) a / b;
    //     }
    // }

    public static void main(String[] args){
        // int a = 10;
        // int b = 0;

        // try {
        //     System.out.println(divide(a,b));
        // } catch (ArithmeticException e){
        //     System.out.println(e.getMessage());
        // }
    //___________________________________________________________________________

        String[] games = {"Scarlet", "Violet"};
        try {
            if (args.length < 1){
                throw new MissingArgumentsException("No arguments were provided");
            }
            int gamePosition = Integer.parseInt(args[0]);
            String gameVersion = games[gamePosition];
            System.out.println("You are playing the " + gameVersion + " pokemon game.");
        } catch (MissingArgumentsException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You either did not provide enough arguments, or you provided an incorrect game version");
        } catch(NumberFormatException e){
            System.out.println("Your argument was not a valid number");
        }




        
    }
}