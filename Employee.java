public class Employee {
   int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public double getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return id + " " + name + " " + salary;
    }

    public void setId(int id) {
        this.id = id;
    }
     
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
}