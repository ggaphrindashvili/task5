public class FindLargest {
    public static int findLargest(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        System.out.println(findLargest(4, 9, 21));
    }
}