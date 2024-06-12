import java.util.Scanner;

public class ProductClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 to add a product\n2 to view all\n3 to view a product\n4 to exit");

        int input = scanner.nextInt();

        scanner.nextLine();

        productClient dao = new productClient();

        while (input != 4) {

            switch (input) {

                case 1:

                    System.out.println("What is the size of the array?");

                    int arraySize = scanner.nextInt();

                    scanner.nextLine();

                    dao.createStudentArray(arraySize);

                    for (int i = 0; i < arraySize; i++) {

                        System.out.println("What is pid");

                        int pid = scanner.nextInt();

                        scanner.nextLine();

                        System.out.println("What is pname");

                        String pname = scanner.nextLine();

                        System.out.println("What is quantity");

                        int qty = scanner.nextInt();

                        scanner.nextLine();

                        System.out.println("What is price");

                        int price = scanner.nextInt();

                        scanner.nextLine();

                        System.out.println("Enter the order");

                        int order = scanner.nextInt();

                        scanner.nextLine();

                        Product product = new Product();

                        product.setPid(pid);

                        product.setPname(pname);

                        product.setQty(qty);

                        product.setPrice(price);

                        dao.addProducts(product, order);

                    }

                    System.out.println("1 to add a product\n2 to view all\n3 to view a product\n4 to exit");

                    input = scanner.nextInt();

                    scanner.nextLine();

                    break;

                case 2:

                    dao.displayProducts();

                    System.out.println("1 to add a product\n2 to view all\n3 to view a product\n4 to exit");

                    input = scanner.nextInt();

                    scanner.nextLine();

                    break;

                case 3:

                    System.out.println("Enter the pid");

                    int pid = scanner.nextInt();

                    scanner.nextLine();

                    dao.viewProduct(pid);

                    System.out.println("1 to add a product\n2 to view all\n3 to view a product\n4 to exit");

                    input = scanner.nextInt();

                    scanner.nextLine();

                    break;

                default:

                    System.out.println("Enter a valid input");

                    System.out.println("1 to add a product\n2 to view all\n3 to view a product\n4 to exit");

                    input = scanner.nextInt();

                    scanner.nextLine();

            }

        }

    }

}