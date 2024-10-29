import java.util.Scanner;

public class HarshadNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
        
        scanner.close();
    }

    public static boolean isHarshad(int number) {
        int sumOfDigits = 0;
        int temp = number;

        // Calculate sum of digits
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        return number % sumOfDigits == 0;
    }
}
