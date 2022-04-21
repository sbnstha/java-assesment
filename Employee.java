/*
 *Sabin Shrestha
 *Student ID:s4604465
 *Assignment 3 task 2
 */
//Tas2. Implement a class called Employee. An employee has a name (a string) 
//and a salary (double). Write a default constructor, a constructor with two 
//parameters (name and salary), a method raiseSalary(double byPercent) that raises the employee’s
//salary by a certain percentage and methods to return the name and salary. Write a client/driver 
//program to test the Employee class. In the client program, create an Employee object called Stev
//Hacker with a salary of $65,000 and give him a raise of 25%, display the object by invoking its toString()
//cmethod before and after the raise. Draw a UML class diagram.

package Task2;

/**
   An employee with a name and salary.
*/
public class Employee
{ 
   private String employeeName;
   double currentSalary;
   double percent;

   /**
      Constructs an employee.
      @param employeeName the employee name
      @param currentSalary the employee salary
   */
   public Employee(String employeeName, double currentSalary , double percent)
   {
    this.employeeName=employeeName;
    this.currentSalary= currentSalary;
    this.percent=percent;
   }

    Employee(Employee Name, Double Salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /**
      Gets the employee name.
      @return the name
   */
   public String getName()
   {  
     return employeeName;
   }

   /**
      Gets the employee salary.
      @return the salary/home/cay/books/bigj3/solutions/Ch03/ExP3_4/
   */
   public double getSalary()
   {  
    return currentSalary;
   
   }

    public double getPercent() {
        return percent;
    }

   
   /**
      Raises the salary by a given percentage.
      @param percent the percentage of the raise
   */
   public void raiseSalary(double percent)
   {  
    this.currentSalary *= (1+percent/100);
   }
}