public class FibanociEx {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int k = 0;
        int count = 8;
        int m;
        System.out.println(i + " " + j); // we are printing the number 1 and 0.
        for (m = 2; m < count; m++) {
            k = i + j; // 0 +1 =1
            System.out.print(" " + k);
            i = j;
            j = k;

        }

    }
}
