import java.util.Scanner;

public class RecursiveProduct {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 5 numbers you would like to find the product of:");
        System.out.println("The product of the 5 numbers is " + recursiveProduct(5));
    }

    private static int recursiveProduct(int recursions) {
        if (recursions <= 0) {
            return 1;
        }
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        return number * recursiveProduct(recursions - 1);
    }
}
