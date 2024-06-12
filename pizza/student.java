public class student { // example of method overridding.
    void display(int sno, String sname) {
        System.out.println(sno + "\t" + sname);
    }

    void display(String address, double sfee) {
        System.out.println(address + "\t" + sfee);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        student stu = new student();
        stu.display(100, "rani"); // if the number of aarguments match then the print statement will be printed. }
        // in the above clas the int and string has been declared hence, the arguments
        // match with the first method hence, the second line is printed.
    }
}