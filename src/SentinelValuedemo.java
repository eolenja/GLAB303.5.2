import java.util.Scanner;
public class SentinelValuedemo {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Read an initial data
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int data = input.nextInt();
        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;
            // Read the next data
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}

