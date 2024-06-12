import java.util.Scanner;

public class ifdoop {
    public static void main(String[] args) {
        // finding the number the prime numbers
        // prime numbers are the number that is divisible only itself (1,2,3,5,7,11)
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the numbers");
        int num = sc.nextInt();
        int num1 = 0;
        int count = 0;
        if (num == 0 || num1 == 1) {
            System.out.println(num + " is not a prime number");
            System.out.println(num1 + " is a odd number");
        }
        for (int i = 1; i < num; i++) {
            // if (num + i == 0) // once the module number is zero.

            count++;
        }

        if (count == 0) {
            System.out.println(" the number is  odd number");
        } else {
            System.out.println(" the number is even  number");
        }
    }
}
