import java.util.ArrayList;
import java.util.List;

class Employee {
   private String name;
   private int age;
   private double salary;

   public Employee(String name, int age, double salary) {
      this.name = name;
      this.age = age;
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public double getSalary() {
      return salary;
   }
}


class Company {
   private List<Employee> employees;

   public Company() {
      this.employees = new ArrayList<>();
   }

   public void addEmployee(Employee employee) {
      employees.add(employee);
   }

   public double getAverageSalary() {
      if (employees.isEmpty()) {
         return 0;
      }

      double sumSalarys = 0;
      for (Employee employee : employees) {
         sumSalarys += employee.getSalary();
      }

      return sumSalarys / employees.size();
   }
}

public class Main {
   public static void main(String[] args) {
      Employee employee1 = new Employee("John", 20, 2000);
      Employee employee2 = new Employee("Mary", 25, 2500);
      Company company = new Company();
      company.addEmployee(employee1);
      company.addEmployee(employee2);

      System.out.println("Average salary: " + company.getAverageSalary());
   }
}