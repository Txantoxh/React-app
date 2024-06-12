
public class AccountDepartMent extends Employee {

    // public class AccountDepartMent extends Employee {

    @Override
    int calculatesalary(String salary) {

        if (salary.equals("java"))
            return 15000;

        else if (salary.equals("python"))

            return 12000;

        else
            return 10000;

    }
}

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