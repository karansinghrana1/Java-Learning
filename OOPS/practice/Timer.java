// Create a class Employee with the following attributes:

// name (string)
// age (int)
// salary (double)
// Write getters, setters, and a parameterized constructor in the above-mentioned attribute sequence as required.

// Create a class Solution with the main method.

// Implement two static methods - calculateYearlySalary and calculateTax in the Solution class.

// calculateYearlySalary method:
// -----------------------------------------
// This method will take an Employee object as input.
// The method will calculate the yearly salary of the employee (assuming that the employee works for 12 months in a year) and 
// return it as a double.

// calculateTax method:
// -----------------------------------------
// This method will take an Employee object as input.
// The method will calculate the tax to be paid by the employee based on the following rules:

// If the yearly salary is less than or equal to 50000, the tax is 10% of the yearly salary.
// If the yearly salary is greater than 50000 but less than or equal to 100000, the tax is 20% of the amount over 50000 plus 10% 
// of the first 50000.
// If the yearly salary is greater than 100000, the tax is 30% of the amount over 100000 plus 20% of the amount between 50000 and 
// 100000 plus 10% of the first 50000.
// The method will return the tax amount as a double.
// These above-mentioned static methods should be called from the main method.

// For calculateYearlySalary method - The main method should print the yearly salary returned by the method.

// For calculateTax method - The main method should print the tax amount returned by the method.

// Before calling these static methods in main, use a Scanner object to read the values of an Employee object's attributes.

// Example Input:
// ----------------
// John
// 30
// 55000.0

// Example Output:
// ----------------
// Yearly salary of John: 660000.0
// Tax to be paid by John: 183000.0

package practice;
import java.util.*;;

class Employee{
    private String name;
    private int age;
    private double salary;

    Employee(String n, int a, double s){
        this.name=n;
        this.age=a;
        this.salary=s;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }

    public void setName(String n){
        this.name=n;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setSalary(double s){
        this.salary=s;
    }
}
public class Timer {

    public static double calculateYearlySalary(Employee emp){
        double yearlySalary = (double)(emp.getSalary() * 12);
        return yearlySalary;
    }
    public static double calculateTax(Employee emp){
// If the yearly salary is greater than 50000 but less than or equal to 100000, the tax is 20% of the amount over 50000 plus 10% 
// of the first 50000.
// If the yearly salary is greater than 100000, the tax is 30% of the amount over 100000 plus 20% of the amount between 50000 and 
// 100000 plus 10% of the first 50000.
        double tax=0;
        double yearlySalary = calculateYearlySalary(emp);
        if(yearlySalary <= 50000){
            tax = yearlySalary * 0.1;
        }
        else if(yearlySalary > 50000 && yearlySalary<=100000){
            tax = (50000 * 0.1)+((yearlySalary - 50000)*0.2);
        }
        else if(yearlySalary>100000){
            tax = (50000 * 0.1)+(50000 * 0.2)+((yearlySalary-100000)*0.3);
        }
        return tax;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();sc.nextLine();
        double salary = sc.nextDouble();sc.nextLine();
        Employee  emp = new Employee(name, age, salary);
        System.out.println("Yearly salary of "+emp.getName()+": "+calculateYearlySalary(emp));
        System.err.print("Tax to be paid by "+emp.getName()+": "+calculateTax(emp));
    }

}
