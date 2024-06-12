package com.Abstract;
public class AccountDepartMent extends Employee {

    // public class AccountDepartMent extends Employee
    int calculatesalary(String salary) {

        if (salary.equals("java"))
            return 15000;

        else if (salary.equals("python"))

            return 12000;

        else
            return 10000;

    }
}
