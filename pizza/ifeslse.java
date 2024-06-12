import java.util.Scanner;

public class ifeslse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the marks obtained");
        float marks = sc.nextFloat();
        if (marks > 5) {
            System.out.println("Strongly Agree");
        } else if (marks >= 4) {
            System.out.println("Agree");
        } else if (marks >= 3) {
            System.out.println(" Neutral");
        } else if (marks >= 2) {
            System.out.println("unstsify");
        } else {
            System.out.println("hello");
        }

    }
}
