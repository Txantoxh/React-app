package Abstract;

public class ItDepartMent extends Employee {

    int calculatesalary(String salary) {

        if (salary.equals("java"))
            return 8000;

        else if (salary.equals("python"))
            return 6000;

        else
            return 5000;
    }
}
