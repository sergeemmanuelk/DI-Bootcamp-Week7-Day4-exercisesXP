import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get three input values
        System.out.print("Enter first value: ");
        int input1 = input.nextInt();

        System.out.print("Enter second value: ");
        int input2 = input.nextInt();

        System.out.print("Enter third value: ");
        int input3 = input.nextInt();

        // Calculate average, sum, largest and smallest values
        int sum = Compute.sum(input1, input2, input3);
        System.out.println("Sum of three input values is : " + sum);

        int average = Compute.average(input1, input2, input3);
        System.out.println("Average of three input values is : " + average);

        int largest = Compute.largestNumber(input1, input2, input3);
        System.out.println("Largest number of three input values is : " + largest);

        int smallest = Compute.smallestNumber(input1, input2, input3);
        System.out.println("Smallest number of three input values is : " + smallest);
    }
}