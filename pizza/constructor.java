public class constructor { // non-static variables/ instances variables
    int eno;
    String ename;
    String edded;

    public constructor(int eno, String ename, String edded) { // constructor sub
        this.eno = eno;
        this.ename = ename;
        this.edded = edded;
        System.out.println("This is an example of constructor");

    }

    void displayinfo() { // creating a non-static method
        System.out.println(eno + "\t" + ename + "\t" + edded);
    }

    public static void main(String[] args) {

        constructor eno = new constructor(5, " santos", "ravi");// assigning the value
        constructor ename = new constructor(5, " santos", "ravi");// assigning the value
        eno.displayinfo();
        ename.displayinfo();
    }

}
