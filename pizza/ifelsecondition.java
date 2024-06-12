import java.util.Scanner;

public class ifelsecondition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the marks obtained");
        float marks = sc.nextFloat();

        if (marks >= 90) {
            System.out.println("A+ Grade");
        } else if (marks < 90 && marks >= 80) {
            System.out.println("A Grade");

        } else if (marks < 80 && marks >= 70) {
            System.out.println(" B grade");
        } else {
            System.out.println("try next time");
        }

    }
}