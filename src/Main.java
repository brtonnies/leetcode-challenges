public class Main {
    public static void main(String[] args) {

        int[] arr1 = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int[] arr2 = { 2, 0, 2 };
        int[] arr3 = { 4, 2, 3 };

        int[] answers = { 6, 2, 1 };

        System.out.println("First test passed: " + (TrappingRainWater.trap(arr1) == answers[0]));
        System.out.println("Second test passed: " + (TrappingRainWater.trap(arr2) == answers[1]));
        System.out.println("Third test passed: " + (TrappingRainWater.trap(arr3) == answers[2]));

    }

    public static void print(String out) {

    }
}
