package Gabriella;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        //Create Employee objects
        ArrayList<Employee> allEmployee= new ArrayList<>();

        allEmployee.add(new Employee("Oliver", "Hukapuk", 1980, 6000));
        allEmployee.add(new Employee("Beatrix", "Kiss", 1986, 5000));
        allEmployee.add(new Employee("Peter", "Pan", 1988, 3000));
        allEmployee.add(new Employee("Kathrin", "Meyer", 1978, 3900));
        allEmployee.add(new Employee("Michaela", "Lang", 1972, 4100));

        Iterator itr= allEmployee.iterator();
        System.out.println(itr);

        System.out.println("***********Print out one Employee****");
        allEmployee.get(0).printOutEmployee();

        allEmployee.get(0).setSurName("Schnarch");
        allEmployee.get(0).printOutEmployee();

        System.out.println("\n***********Print out all Employee****");
        while(itr.hasNext()) {
            Employee ee =(Employee) itr.next();
            //System.out.println("ee: "+ee);
            ee.printOutEmployee();
        }


    }



}
