import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the age ");
        int age = sc.nextInt();
        System.out.println(" Enter the weight");
        int weight = sc.nextInt();
        if (age <= 18 && weight <= 40) {
            System.out.println("you are minor and unhealthy");
        } else if (age >= 90 && weight >= 200) {
            System.out.println(" you are unhealthy, blood donation she");
        } else {
            System.out.println(" you are in a great shape for blood donation");
            // }
        }
    }
}