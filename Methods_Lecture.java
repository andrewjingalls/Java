public class Methods_Lecture {
    /*
        public = access modifier, no access restrictions
        static = don't need a calling object 
        void = return type, in this case nothing
        main = name of method
        whatevers in parentheses = parameters
        **in this case, one parameter of type string array named "args"
    */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //with static methods, reference the class before method name
        Methods_Lecture.yell("I love zybooks");

        System.out.println(Methods_Lecture.sum(10,5));
        int[] numbers = {10, 5, 2, 100};
        System.out.println(Methods_Lecture.sum(numbers));

        Methods_Lecture.yell();

        Methods_Lecture.zero(numbers); 
        System.out.println(Methods_Lecture.sum(numbers));
    }
    /*
    VOID METHOD
    does not return a value, just performs action
    */
    private static void yell(String message) {
        System.out.println(message.toUpperCase() + "!!!");
    }

    /*
    METHODS THAT RETURN VALUE
    */
    private static int sum(int a, int b) {
        return a + b;
    }



    /*
    OVERLOADED METHODS
    - Allow you to define multiple methods with same name
    - either differ in parameter types or number of params
    - binding is process of connecting method call to body
    - all private/static methods use "early binding"
    - binding happens at compile time
    */
    private static int sum(int[] nums) {
        int total = 0;
        for (int item: nums) {
            total += item;
        }
        return total;
    }

    /*
    PARAMETER DEFAULTS
    - java does not allow parameter 
    */
    private static void yell() {
        System.out.println("AHHHHHH!");
    }

    /*
    PASSING BY VALUE/COPY VS PASSING BY REFERENCE
    - primative types are passed as parameters by value/copy
    - objects and other reference types (like arrays) ....
    */
    private static int[] zero(int[] nums) {
        for (int i = 0; i < nums.length; ++i ){
            nums[i] = 0;
        }
        return nums;
    }
}