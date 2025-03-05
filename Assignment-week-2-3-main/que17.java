class Employee {
   
    
    int id;
    String name;
    double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class que17 {
    public static void main(String[] args) {
        // Creating an array of Employee objects
        Employee[] employees = new Employee[3];

      
        
        employees[0] = new Employee(11, "Vaishnavi", 100000);
        employees[1] = new Employee(12, "Ram", 200000);
        employees[2] = new Employee(13, "Vijay", 70000);

        // Displaying Employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
