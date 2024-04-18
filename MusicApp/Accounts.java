/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an Account object
 */
public class Accounts {
    private String accountName;

    //Default Constructor for making an Account
    public Accounts(){
        accountName = "Bob";
    }

    //Overloaded constructor for making an Account
    public Accounts(String accountName){
        this.accountName = accountName;
    }

    //toString method for writing the name of the account
    public String toString(){
        return "Account name: " + accountName;
    }


}