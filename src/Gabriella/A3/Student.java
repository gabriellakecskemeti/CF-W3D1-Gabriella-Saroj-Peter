package Gabriella.A3;

import java.util.*;

public class Student {
    private String name;
    private String surName;
    private int yearOfBirth;
    private String schoolClass;

    public Student(String name, String surName, int yearOfBirth, String schoolClass) {
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.schoolClass = schoolClass;
    }

    public int getCurrentYear(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year;
    }

    public int getAge(){
        int studentAge=getCurrentYear()-yearOfBirth;
        return studentAge;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public void printOutStudent(){
        System.out.println(name+"  "+surName+"         Year of Birth: "+yearOfBirth+"   Age: "+getAge()+"    Class: "+schoolClass);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", schoolClass='" + schoolClass + '\'' +
                '}';
    }
}
