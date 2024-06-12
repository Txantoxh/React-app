package Abstract;

public abstract class Employee {
    private int eno;
    private String ename;
    private String dname;

    public Employee(int eno, String ename, String dname) {
        this.eno = eno;
        this.ename = ename;
        this.dname = dname;
    }

    public abstract int calculateSalary(String dname);

    public int geteno() {
        return eno;
    }

    public String getename() {
        return ename;
    }

    public String getdname() {
        return dname;
    }

    public void seteno(int eno) {
        this.eno = eno;
    }

    public void dname(String dname) {
        this.dname = dname;
    }

    public void setename(String ename) {
        this.ename = ename;
    }

    public static void main(String[] args) {

    }
}
