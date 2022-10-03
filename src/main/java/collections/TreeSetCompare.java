package collections;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Sorted Sets examples with Comparable and Comparator interfaces
 */
public class TreeSetCompare {

    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(22, "Scot"));
        personSet.add(new Person(20, "Mike"));
        personSet.add(new Person(21, "Nick"));
        for (Person person : personSet) {
            System.out.println(person.toString());
        }

        CompareEmployee compareEmployee = new CompareEmployee();
        Set<Employee> employeeSet = new TreeSet<>(compareEmployee);
        employeeSet.add(new Employee(32, "Scot"));
        employeeSet.add(new Employee(29, "Mike"));
        employeeSet.add(new Employee(30, "Nick"));
        System.out.println(employeeSet.add(new Employee(30, "Nick2"))); // will not be added,  return false
        for (Employee employee : employeeSet) {
            System.out.println(employee.toString());
        }

    }


}

@Data
@AllArgsConstructor
class Person implements Comparable<Person> {
    int age;
    String name;

    @Override
    public int compareTo(Person p) {
        return this.age - p.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

@Data
@AllArgsConstructor
class Employee {
    int age;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class CompareEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.age - o2.getAge();
    }
}