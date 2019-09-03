package itschool;

import itschool.Classes.Employee;
import itschool.Classes.Person;
import itschool.Classes.Student;
import lombok.Data;


public class Main {

    public static void main(String[] args) {
        Person person = new Person("Georg 2", 100);
        //System.out.println(person.getName() + ", " + person.getAge() + " years old");
        System.out.println(person);

        Student student = new Student("Student", 18, 5000);
        System.out.println(student);

        Employee employee = new Employee();
        employee.setSalary(123);
        System.out.println(employee.toString());
    }
}
