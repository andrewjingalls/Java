/*
Andrew Ingalls
ID: 2368574
Email: aingalls@chapman.edu
CPSC 231-03
MP1 Drawing with 2D Arrays

This file takes in the parameters specified in the 
main method and creates a 2D char array of a canvas 
and allows you to print whatever characters you want
inside the canvas
*/


public class Drawing {
    public static void printCanvas(char[][] canvas) {
        int[] collumn = new int[canvas[1].length];
        for (int row = 0; row < canvas.length; row++) {                 
            for (int col = 0; col < canvas[row].length; col++) {    //first for loop for iterating through rows, second for loop for iterating through collumns   

                if (col ==0) {                                  //printing the numbers on y axis depending on how many rows there are
                    System.out.print(canvas.length - row-1);        
                }
                
                if (row ==0) {                                  //finding when at the first row
                    collumn[col] = col;
                }
                    System.out.print(canvas[row][col] + " ");   //printing the array with a space in between
             }
            System.out.println();
            if (row == canvas.length-1) {
                int i;
                System.out.print(" ");
                    for(i=0; i < canvas[row].length-1; i++) {   //this group of code prints out a string of numbers on the x axis for however many collumns there are

                        System.out.print(i+ " "); 
                    }
                    System.out.println();
                }
        }
    }

    public static void createCanvas(char[][] defaultCanvas) {
        int count = 0;
        for (int row = 0; row < defaultCanvas.length; row++) {
            for (int col = 0; col < defaultCanvas[row].length; col++) {     //iterating through rows and collumns, 
                while (count <= defaultCanvas[row].length-2){               //count is just to count how many collumns there are
                    count++;
                }
            }
        }
        defaultCanvas[0][0] = '+';
        defaultCanvas[defaultCanvas.length-1][0] = '+';
        defaultCanvas[0][count] = '+';
        defaultCanvas[defaultCanvas.length-1][count] = '+';        // this group of code adds the + signs on each corner of the array
        int i;
        int j;
        for (i = 1; i < defaultCanvas.length-1; i++){             //next few lines adds the sides (the formatting was screwed up on the right side, could not figure it out)
            defaultCanvas[i][count] = '|';
            defaultCanvas[i][0] = '|';
        }
        for (j = 1; j< count-1; j++) {
            defaultCanvas[0][j] = '=';
            defaultCanvas[defaultCanvas.length-1][j] = '=';      //this group adds = signs for however many collumns there are 
        }
    }


    public static void addCharacter(char[][] finalCanvas, char addCharacter, int x, int y) {    //takes in a 2D array and ads whatever character you want to the specified coordinates
        finalCanvas[x][y] = addCharacter;
    }


    public static void main(String[] args) {
        char canvas[][] = new char[5][10];
        Drawing.createCanvas(canvas);
        Drawing.addCharacter(canvas, ':', 2, 2);
        Drawing.addCharacter(canvas, ')', 2, 3);
        Drawing.printCanvas(canvas);
    }
}