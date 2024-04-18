public class Methods_Practice {
    public static void main(String[] args) {
        int[] arrayList = {5, 40, 69, 59238, 420};
        Methods_Practice.printArray(arrayList);
    }

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("]");
    }
}