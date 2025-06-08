//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", 18, 7000);
        System.out.println(employee.getName + ", " + employee.getAge + " лет, зарплата: " + employee.getSalary);
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setName(int age){
        this.age = age;
    }
}
class Employee extends Person{
    private int salary;
    public String getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
