/** 
 * Andrew Ingalls
 * ID: 2368574
 * Email: aingalls@chapman.edu
 * CPSC 231-03
 * MP4: Music App
 * 
 * This class is the driver class for the Music App, it has many methods and many different functions
 * But overall it displays the menu of options and executes the functions to the terminal.
 */
import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;
public class Driver{

    //Member variables for the playlists, albums, the list of content, all the songs available
    //all the podcasts available and the favorites 
    private static LinkedList<Playlist> playlists = new LinkedList<Playlist>();
    private static LinkedList<Album> albums = new LinkedList<Album>();
    private static LinkedList<Content> contentList = new LinkedList<Content>();
    private static LinkedList<Song> allSongs = new LinkedList<Song>();
    private static LinkedList<Podcast> allPods = new LinkedList<Podcast>();
    private static LinkedList<String> favorites = new LinkedList<String>();

    //Menu method just prints the main menu
    public static void menu(){
            System.out.println("1. Create a listener account");
            System.out.println("2. List all Playlist and Albums and their contents");
            System.out.println("3. Add songs to an existing playlist");
            System.out.println("4. Shuffle an existing Playlist or listen to an Album");
            System.out.println("5. Add a song or podcast to favorites");
            System.out.println("6. Export all favorites");
            System.out.println("7. Exit");
        }

    public static void main(String[] args){
        //initializing the number for chosing which item in menu used
        int num = 0;
        Scanner scnr = new Scanner(System.in);


        //Created an Drake album and gave it a title
        Album nothingWasSame = new Album("Nothing Was the Same");
        //Created a song object for each song in the album
        Song startedFromTheBottom = new Song("Started From The Bottom", "Drake", "Nothing Was the Same");
        Song holdOnWeGoingHome = new Song("Hold On We're Going Home", "Drake", "Nothing Was the Same");
        Song tooMuch = new Song("Too Much", "Drake", "Nothing Was the Same");
        Song poundCakeParadise = new Song("Pound Cake / Paris Morton Music 2", "Drake", "Nothing Was the Same");
        //Added each song to the album
        nothingWasSame.add(startedFromTheBottom);
        nothingWasSame.add(holdOnWeGoingHome);
        nothingWasSame.add(tooMuch);
        nothingWasSame.add(poundCakeParadise);
        //Added the album to the list of albums
        albums.add(nothingWasSame);

        //Created 2 playlist objects, one to populate and one to leave empty
        Playlist myPlaylist = new Playlist("Andrew's Playlist");
        Playlist coolSongs = new Playlist("Cool Songs");
        //Added the playlists to the list of playlists
        playlists.add(coolSongs);
        playlists.add(myPlaylist);
        //Created a few podcasts and another song 
        Podcast jre = new Podcast("Joe Rogan Experience", "Joe Rogan", 1);
        Podcast dollop = new Podcast("Dollop", "All Things Comedy", 5);
        Song rackCity = new Song("Rack City", "Tyga", "Careless World");
        //Added a drake song and the new podcasts/song to my playlist
        //Initializing the playlist to simulate already having a playlist in my library
        myPlaylist.add(startedFromTheBottom);
        myPlaylist.add(jre);
        myPlaylist.add(dollop);
        myPlaylist.add(rackCity);

        //Added all the songs in the library to the list of songs
        allSongs.add(startedFromTheBottom);
        allSongs.add(holdOnWeGoingHome);
        allSongs.add(tooMuch);
        allSongs.add(poundCakeParadise);
        allSongs.add(rackCity);
        //Added all the podcasts in the library to the list of podcasts
        allPods.add(jre);
        allPods.add(dollop);

        //Created a new writer object to be used later in the class
        PrintWriter writer = null;

        try{
            //Printing the menu class for the user
            menu();
            //While loop to continue giving the user a chance to
            //do something different in the class but once they enter 7
            //the loop exits
            while (num != 7){
                num = scnr.nextInt();
                //Checking if the number is within the scope of the list, if not message is displayed
                if(num < 0 || num > 7) {
                    System.out.println("\nPICK A VALID NUMBER FROM THE LIST\n");
                }

                //This block creates a new listener account with the provided username
                if(num == 1){
                    System.out.print("Enter username(one word): ");
                    String userName = scnr.next();
                    System.out.println(new ListenerAccount(userName));
                    System.out.println();
                }
                //This block displays each album, playlist, song, and podcast
                if(num == 2){
                    for (Album album : albums) {
                            System.out.println(album.getTitle());
                        }
                    System.out.println(startedFromTheBottom.toString());
                    System.out.println(holdOnWeGoingHome.toString());
                    System.out.println(tooMuch.toString());
                    System.out.println(poundCakeParadise.toString());

                    for (Playlist playlist : playlists){
                        System.out.println(playlist.getTitle());
                    }
                    System.out.println(startedFromTheBottom.toString());
                    System.out.println(rackCity.toString());
                    System.out.println(jre.toString());
                    System.out.println(dollop.toString());
                }
                //This block is for adding songs to playlists
                if(num == 3){
                    //Displaying all the current playlists
                    System.out.print("All playlists: ");
                    for (Playlist playlist : playlists){
                        System.out.print(playlist.getTitle() + ", ");
                    }
                    System.out.println();
                    //Asking which playlist they want to chose
                    System.out.print("Which playlist do you want to add to? 1) Cool Songs or 2) Andrew's Playlist ");
                    int num3Question = scnr.nextInt();
                    //Block for chosing option 1
                    if (num3Question == 1){
                        //Asking which song they want to add and displays all the songs available
                        System.out.println("Which song do you want to add? ENTER THE FIRST WORD ONLY: ");
                        for (Song song : allSongs){
                            System.out.println(song.toString());
                        }
                        //Next few blocks, depending on which song they pick, it is added to the playlist
                        //and displayed giving confirmation
                        //Repeats for each song available
                        String num3Question2 = scnr.next();
                        if (num3Question2.equals("Started")){
                            coolSongs.add(startedFromTheBottom);
                            System.out.println("Added 'Started From The Bottom' to Cool Songs");
                        }
                        else if (num3Question2.equals("Hold")){
                            coolSongs.add(holdOnWeGoingHome);
                            System.out.println("Added 'Hold On We're Going Home' to Cool Songs");
                        }
                        else if (num3Question2.equals("Too")){
                            coolSongs.add(tooMuch);
                            System.out.println("Added 'Too Much' to Cool Songs");
                        }
                        else if (num3Question2.equals("Pound")){
                            coolSongs.add(poundCakeParadise);
                            System.out.println("Added 'Pound Cake/Paris Morton Music 2' to Cool Songs");
                        }
                        else if (num3Question2.equals("Rack")){
                            coolSongs.add(rackCity);
                            System.out.println("Added 'Rack City' to Cool Songs");
                        }
                        //If the answer provided is not within the scope of the program, error message appears
                        else{
                            System.out.println("Invalid Entry");
                        }
                    }
                    //Block for if they chose the 2nd playlist option
                    //Same as the previous block but adds songs to the appropriate playlist
                    else if (num3Question == 2){
                        System.out.println("Which song do you want to add? ENTER THE FIRST WORD ONLY: ");
                        for (Song song : allSongs){
                            System.out.println(song.toString());
                        }
                        System.out.println();
                        String num3Question2 = scnr.next();
                        if (num3Question2.equals("Started")){
                            System.out.println("'Started From The Bottom' is already in Andrew's Playlist");
                        }
                        else if (num3Question2.equals("Hold")){
                            myPlaylist.add(holdOnWeGoingHome);
                            System.out.println("Added 'Hold On We're Going Home' to Andrew's Playlist");
                        }
                        else if (num3Question2.equals("Too")){
                            myPlaylist.add(tooMuch);
                            System.out.println("Added 'Too Much' to Andrew's Playlist");
                        }
                        else if (num3Question2.equals("Pound")){
                            myPlaylist.add(poundCakeParadise);
                            System.out.println("'Pound Cake/Paris Morton Music 2' to Andrew's Playlsit");
                        }
                        else if (num3Question2.equals("Rack")){
                            System.out.println("'Rack City' is already in Andrew's Playlist");
                        }
                        else{
                            System.out.println("Invalid Entry");
                        }
                    }
                    //If number provided not within scope, error message appears
                    else {
                        System.out.println("Invalid Number");
                    }
                    System.out.println();
                }
                //Block for Shuffling a playlist or album
                if(num == 4){
                    //Asking user if they want to shuffle playlist or play album
                    System.out.println("Do you want to:");
                    System.out.println("1) shuffle a playlist or ");
                    System.out.println("2) play an album ");
                    int answer = scnr.nextInt();
                    //If chose to shuffle playlist, next block executes
                    if(answer == 1){
                        //Asking user which playlist they want to add to
                        System.out.println("Which playlist do you want to shuffle? 1) Cool Songs or 2) Andrew's Playlist? ");
                        int number = 0;
                        number = scnr.nextInt();
                        //Shuffles the playlist chosen
                        if (number == 1){
                            coolSongs.shuffle();
                        }
                        if (number == 2){
                            myPlaylist.shuffle();
                        }
                    }
                }
                //Block for asking which song or podcast they want to add to favorites
                if(num == 5){
                    //Displays every song and podcast in the library
                    System.out.println("Which song or podcast do you want to add to favorites? ENTER FIRST WORD ONLY");
                    for (Song song : allSongs){
                        System.out.println(song.toString());
                    }
                    for (Podcast podcast : allPods){
                        System.out.println(podcast.toString());
                    }
                    //Depending on the answer given, it adds the appropriate song in the form of a string to 
                    //a list of favorite pieces of content
                    String num5Answer = scnr.next();
                    if (num5Answer.equals("Started")){
                        favorites.add(startedFromTheBottom.toString());
                        System.out.println("Added " + startedFromTheBottom.toString() + " to Favorites");
                    }
                    else if (num5Answer.equals("Hold")){
                        favorites.add(holdOnWeGoingHome.toString());
                    }
                    else if (num5Answer.equals("Too")){
                        favorites.add(tooMuch.toString());
                    }
                    else if (num5Answer.equals("Pound")){
                        favorites.add(poundCakeParadise.toString());
                    }
                    else if (num5Answer.equals("Rack")){
                        favorites.add(rackCity.toString());
                    }
                    else if (num5Answer.equals("Joe")){
                        favorites.add(jre.toString());
                    }
                    else if (num5Answer.equals("Dollop")){
                        favorites.add(dollop.toString());
                    }
                    else {
                        System.out.println("Invalid Entry");
                    }
                }
                //Block for exporting each song/podcast in favorites list to a file of favorites
                if(num == 6){
                    //Creating new file named favorites
                    writer = new PrintWriter(new FileWriter("./favorites.txt", false));
                    writer.println("Favorites: ");
                    //for each item in the favorites list, write it to the file
                    for (int j = 0; j < favorites.size(); ++j){
                        writer.println(favorites.get(j));
                    }
                    System.out.println("Exported Successfully!");
                }
                menu();
            }
        //Catch statements for catching different errors
        } catch(NumberFormatException e){
            System.out.println("Your selection was not a valid number");
        } catch (MissingArgumentException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println("Something went wrong when writing favorites file");
        } finally {
            //close file when done
            if (writer != null){
                writer.close();
            }
        }
    }
}