/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class creates an ArtistAccount object
 */
//Artist Account extends accounts because it's a type of account
public class ArtistAccount extends Accounts {
    
    //Default constructor for making an Artist Account
    public ArtistAccount(){
        super("Kanye West");
    }

    //Overloaded constructor for naming an Artist account
    public ArtistAccount(String accountName){
        super(accountName);
    }

}