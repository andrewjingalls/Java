public class Arrays_Practice {
    public static void main(String[] args) {
    
        //#2 PRACTICE PROBLEM
        // if (args.length <=0) {
        //     System.out.println("You did not enter a length...");
        // } else {
        //     int size = Integer.parseInt(args[0]);
        //     String[] strings = new String[size];
        //     System.out.println(strings.length);
        // }






        // #3 PRACTICE PROBLEM

        int size = 5;
        char[][] checkerboard = new char[size][size];

        for (int row = 0; row < checkerboard.length; ++row) {
            for (int col = 0; col < checkerboard[0].length; ++col) {
                char icon_mid = 'X';
        
                checkerboard[row][col] = icon_mid;
                System.out.print(checkerboard[row][col] + " ");
             }
            System.out.println();
        }


    }
}

     
