//import java.util.PrimitiveIterator.OfDouble;

public class nonstatic {
    int fno = 8;
    int sno = 9;
    // int temp = 230;

    // creating a non static method
    void add() {
        int sum = fno + sno;
        System.out.println(" the sum  is " + sum);
    }

    void sub() {
        int substraction = fno - sno;
        System.out.println(" the substraction is " + substraction);
    }

    void mul() {
        int multi = fno * sno;
        System.out.println(" the multiply is " + multi);
    }

    public static void main(String[] args) {
        nonstatic cal = new nonstatic();
        cal.add();
        cal.sub();
        cal.mul();

    }
}