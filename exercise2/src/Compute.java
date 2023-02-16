public class Compute {
    /*public static double product(double input1, double input2, double input3) {
        return input1 * input2 * input3;
    }*/

    public static int sum(int input1, int input2, int input3) {
        return Math.addExact(Math.addExact(input1, input2), input3);
    }

    public static int average(int input1, int input2, int input3) {
        return Math.addExact(Math.addExact(input1, input2), input3) / 3;
    }

    public static int largestNumber(int input1, int input2, int input3) {
        return Math.max(Math.max(input1, input2), input3);
    }

    public static int smallestNumber(int input1, int input2, int input3) {
        return Math.min(Math.min(input1, input2), input3);
    }
}
