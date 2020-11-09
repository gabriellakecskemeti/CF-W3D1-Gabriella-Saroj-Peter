package Gabriella.A1;

public class Employee {
    private String name;
    private String surName;
    private int yearOfBirth;
    private double salary;           // salary in EUR


    public Employee(String name, String surName, int yearOfBirth, double salary) {
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public String[] getEmployee(){
        String[] employee = {name, surName, String.valueOf(yearOfBirth),String.valueOf(salary)  };

        return employee;
    }

    public void setEmployee(String name, String surName, int yearOfBirth, int salary){
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;

    }



    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printOutEmployee(){
        System.out.println(name+"  "+surName+"         Year of Birth: "+yearOfBirth+"    Salary: "+salary);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", salary=" + salary +
                '}';
    }
}
