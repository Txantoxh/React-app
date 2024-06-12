public class pattern {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 2 || j == 5)
                    System.out.print("A");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }
}