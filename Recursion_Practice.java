public class Recursion_Practice {
    public static void main(String[] args) {
        //#1
        System.out.println(Recursion_Practice.factorial(4));

        //#2
        Recursion_Practice.hooray(3);

        //#3
        System.out.println(isPalindrome("RACECAR"));
    }


// #1
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + factorial(n-1);
        }
    }
    

// #2 hip hip hooray
        public static void hooray(int nHips){
            // System.out.println("N Hips is: "+ nHips);
            if (nHips ==0) {
                System.out.println("Hooray!");
            }else {
                System.out.print("Hip ");
                // System.out.println("Making recursive call...");
                hooray(nHips-1);
                // System.out.println("After recursive call returned...");
            }
        }


//# 3 PALINDROME
    public static boolean isPalindrome(String word){
        System.out.println("Recieved word: "+ word);
        if (word.length() < 2) {
            return true;
        } 
        if (word.charAt(0) != word.charAt(word.length()-1)) {
            return false;
        }
        return isPalindrome(word.substring(1, word.length()-1));
    }


}