import java.util.Scanner;

public class dowhileloop {

    public static void main(String[] args) {
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("enter a number");
        int number2 = input.nextInt();
        do {
            sum = number1 + number2;
        } while (True);

        System.out.println("The sum is " + " " + sum);

    }
}
