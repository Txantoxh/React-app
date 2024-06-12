public class pattern8 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; ++j) {
                if (ch <= 'z')
                    System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
