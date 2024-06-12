public class statiDemo {
    static int sno = 100;

    static void display() {
        System.out.println("static methods");
    }

    public static void main(String[] args) {
        System.out.println("Display " + sno);
        display();
        System.out.println("Using Classname" + statiDemo.sno);
        statiDemo.display();

        statiDemo demo1 = new statiDemo();
        System.out.println("using objectRefreee" + demo1.sno);
        statiDemo.display();
    }
}
