
public class Arrays_Lecture {
    public static void main(String[] args) {
        if (args.length > 0) {
            String program_version = args[0];

            if (program_version.equals("special")) {
                System.out.println("Running special program...");
            } else{
                System.out.println("Running normal program...");
            }  
        }
        // String[] movies = new String[5];
        // //update value of position 0
        // System.out.println(movies[0]);
        // movies[0] = "Whiplash";
        // System.out.println(movies[0]);

        String[] movies = {"Whiplash", "Birdman", "I Tonya" };

        //loop through every item of array
        for (String movie : movies) {
            if (movie == null) {
                System.out.println("TO BE ANNOUNCED");
            } else {
                System.out.println(movie);
            }
        }
            int size = 5;
            char[][] checkerboard = new char[size][size];

            for (int row = 0; row < checkerboard.length; ++row) {
                for (int col = 0; col < checkerboard[0].length; ++col) {
                    char icon = 'O';
                    checkerboard[row][col] = icon;
                    System.out.print(checkerboard[row][col] + " ");
                }
                System.out.println();
            }


        }
    }

     
