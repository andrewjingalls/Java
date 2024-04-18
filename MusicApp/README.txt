Andrew Ingalls
2368574
aingalls@chapman.edu
CPSC 231-03
MP4 - Music App

Source files:

Accounts.java
Album.java
ArtistAccount.java
Content.java
ContentCollection.java
Driver.java
ListenerAccount.java
MissingArgumentException.java
Playlist.java
Podcast.java
Song.java



Instructions:
The driver class is the only class that is needed to be used. 
After running it, a menu is displayed and instructions are given for each function.
Follow the instructions given to execute the class and its functions. 



- A high level overview of each class and their relationships
Classes:
Starting with the Account classes, we have the main Accounts class which 
creates an account object and also includes a toString method for displaying the 
account. Next we have the Artist account which extends from the parent Accounts class. 
There is no additional information needed for the class so it just has a default and overloaded 
constructor. Next we have the Listener account which also extends from the parent class
Accounts. When the listener account is created it also has a method for favoriting content.

After the accounts, we have the content classes. Starting with the basic Content class, this
class creates a piece of content and assigns it with a title, artist, and the number of times 
the piece of content is played. It also contains a method for playing the content that displays
the title, artist, and the number of times played along with accessors and a toString method to 
display the name of the content. Next is the different types of content. We have playlists and songs.
In the Song class, there are constructors that create a song object with title, artist, and the album 
as well as a play method that increments the number of times played by 1 and displays the title and artist.
Next is the Podcast class, which creates a podcast object with the title, artist, and the episode number.
It also has a play method which plays the podcast. After the direct pieces of content we have the content collection 
class which creates a list of pieces of content. It contains accessors for getting titles and content from the list.
Also has an add method for adding content to the list. It also contains a shuffle method for shuffling through 
the list. Branching from the content collection class is the Album and playlist classes. The album class contains
constructors for creating album objects and has a method play to play the content in the album. The playlist 
class is similar to the album, but has a different play method because we shuffle the content in the 
playlist and just play the songs in an album. 

After the accounts is the Driver class which runs the program. The driver first prints the menu with a number accociated 
with each option. Depending on which number is chosen, different actions are carried out. There is already an album 
initiated with a few songs added to it. Additionally, there are two playlists created: Andrew's Playlist which is populated 
with songs and podcasts, and Cool Songs which is an empty playlist in which the user can add songs or podcasts to.
At the end of the class, there are a few catch exceptions that will handle any errors that could occur.


- Why you’ve chosen that particular architecture instead of an alternative approach
I chose this style of creating classes because I could conceptualize it the best. My idea was to 
first make the content class and then make the two child classes, song and podcast branch out from there.
Next I made the accounts class and branched listener and artist account from there. After that I made the ContentCollection
class and branched album and playlist from that parent class. In the midst of creating these classes, I wrote the 
base few methods for the Driver class such as displaying the menu and giving options. I continued to work through the driver class 
writing each item on the menu at a time. This was the best way my brain thought of tackling the solution and I'm sure there 
are better ways to go about making the music app as well as optimizing the code, but this was to the best of my ability.


- Any challenges you faced while developing this project
I faced quite a few challenges through the development of this project. For starters, I had problems adding the songs
to albums and then adding the album to the list of albums in the library and same with playlists. The different objects kept on 
getting confusing and manipulating those objects such as a playlist that contains songs and podcast objects was a difficult
task to manage, but I did the best I could. Also working with scanner can sometimes be annoying and confusing but I did 
what I could and managed to make a working music app.


- Places you could see future developers expanding upon your project and adding additional features
There are countless places to expand on my music app. For starters, adding the ability to create songs/podcasts or having
a larger list of songs or podcasts at your disposal would be beneficial. Adding on to that, a larger collection of albums
would be a point to expand. Also the ability to create playlists within the app would be a great step. Lastly, I think just 
making the menu more manageable and intuitive would improve user experience in this app.