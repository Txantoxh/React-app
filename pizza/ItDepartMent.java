//public class ItDepartMent {

public class ItDepartMent extends Employee

{

    @Override
    int calculatesalary(String salary) {

        if (salary.equals("java"))
            return 8000;

        else if (salary.equals("python"))
            return 6000;

        else
            return 5000;
    }

}
