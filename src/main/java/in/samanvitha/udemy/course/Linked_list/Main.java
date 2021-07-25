package in.samanvitha.udemy.course.linked_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("sam", "yenduri", 546));
        employeeList.add(new Employee("ram", "ava", 123));
        employeeList.add(new Employee("shyam", "rivera", 456));
        employeeList.add(new Employee("sita", "patel", 789));


        //        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

//        employeeList.set(1, new Employee("harshita","meduri", 121));
//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.size());

//        employeeList.add(3,new Employee("lasya","sanagapalli",564));
//        System.out.println(employeeList.get(3));

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for(Employee employee: employeeArray) {
//            System.out.println(employee);
//        }
//
//        System.out.println(employeeList.contains(new Employee("sradda","meduri",534)));
//        System.out.println(employeeList.indexOf(new Employee("aswin","meduri",123)));

//        employeeList.remove(2);
//        employeeList.forEach(employee -> System.out.println(employee));
    }
}
