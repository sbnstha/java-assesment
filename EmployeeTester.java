/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 *
 * @author sabinshrestha
 */
public class EmployeeTester
{  
   public static void main(String[] args)
   {  
       NumberFormat format2 = NumberFormat.getCurrencyInstance();
       Scanner input = new Scanner(System.in);  
      System.out.print("Enter Name of Employee:" );
       String Name = input.next();
      System.out.print("Enter the current Salary:" );
       Double Salary=input.nextDouble();
       System.out.print("Enter the Increment:" );
       Double percent =input.nextDouble();
    Employee employeName = new Employee(Name,Salary,percent);
    employeName.raiseSalary(percent); 
    System.out.println("------------------------------------------------------------");
    System.out.println("Employee Name:"+Name);
    System.out.println("Employee Current Salary:$"+Salary);
    System.out.println("Employee Raise in Percentage:"+percent);
    System.out.println("------------------------------------------------------------");
    System.out.println("The raise in Stev Salary Makes a total of:"+format2.format(employeName.currentSalary));
  }
}