public class addstudents {
    // public class Student {

    int sno;
    String sname;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public addstudents(int sno, String sname) {
        super();
        this.sno = sno;
        this.sname = sname;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        addstudents stu = new addstudents(2000, "rani");
        System.out.println(stu.getSno() + "\t" + stu.getSname());
        stu.setSno(20000);
        // stu.setSname("shiva");
        // Setter method or constructor which one is better
        // constructor is best Why?

        int no = stu.getSno();
        String name = stu.getSname();
        System.out.println(no + "\t" + name);

    }

}
