public class Point {
    //member variables
    /**x, position on x axis */
    private int x;
    /**Y, position on y axis */
    private int y;

    private char character;

    //constructor
    /**Default Constructor, sets coordinates to (0,0) 
    and character to a space */
    public Point(){
        //x = 0;
        // y = 0;
        // character = ' ';
        //can use this to call constructor
        this(0,0,' ');
    }

    /**Overloaded constructor takes all properties */
    public Point(int x, int y, char character) {
        this.x = x;
        this.y = y;
        this.character = character;
    }

    //accessors & mutators
    //for x, y, and character
    public int X() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int Y() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public char getCharacter() {
        return character;
    }

    public void setCharacter(char c) {
        this.character = c;
    }

    public String toString() {
        return character + " (" + x + "," + y + ")";
    }


    public static void main(String[] args) {
        //main method where actually create
        //instances of the class as objects

        Point p1 = new Point();
        p1.setCharacter('@');
        System.out.println(p1);

        Point p2 = new Point(3,3,'&');
        System.out.println(p2);
    }
}