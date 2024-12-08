package Classes;

public class Question2 {

    /*Write an Employee class, that stores an employee’s first name,
    last name, ID (you can make up a random number), and annual
    salary. Implement functions getFirstName(), getLastName(),
    getFullName(), getID(), getSalary(), and raiseSalary(int percent),
    which raises the salary by whatever percent is inputted.
    Demonstrate the instantiation of two Employees in a
    different class that uses all the functions.*/

}

//Answer:

class Employee { //Create Employee class to store all the traits and methods of every employee.
    String firstName; //The employee's first name.
    String lastName; //The employee's last name.
    int id; //The employee's ID.
    double salary; //The employee's salary.

    public Employee(String firstName, String lastName, int id, int salary) { //Employee constructor to make sure that every employee has to come with their own first name, last name, ID and salary.
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public String getFirstName() { //Returns the employee's first name.
        return firstName;
    }

    public String getLastName() { //Returns the employee's last name.
        return lastName;
    }

    public String getFullName() { //Returns the employee's full name.
        return firstName + " " + lastName;
    }

    public int getId() { //Returns the employee's ID.
        return id;
    }

    public double getSalary() { //Returns the employee's salary.
        return salary;
    }

    public void raiseSalary(double percent) { //Raises the employee's salary by the percent inputted.
        salary +=  salary * (percent / 100);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee Brayden = new Employee("Brayden", "Russell", 808563, 100000); //Creating a new Employee object, with the first name "Brayden", last name "Russell", ID "808563" and salary of 100 000 dollars.

        System.out.println("First name: " + Brayden.getFirstName()); //Outputting every single trait of employee Brayden, and then raising salary by 20 percent.
        System.out.println("Last name: " + Brayden.getLastName());
        System.out.println("Full name: " + Brayden.getFullName());

        System.out.println("ID: " + Brayden.getId());
        System.out.println("Salary: " + Brayden.getSalary());

        Brayden.raiseSalary(20);
        System.out.println("New salary: " + Brayden.getSalary());
    }
}
