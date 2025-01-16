public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are:");

        for (int number = 1; number <= 1000; number++) {
            if (isArmstrong(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        int n = 0;

        originalNumber = number;

        // Find the number of digits in the number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate the sum of the nth powers of its digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the number is equal to the sum of the nth powers of its digits
        return result == number;
    }
}
