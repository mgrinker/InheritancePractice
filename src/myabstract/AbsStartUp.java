/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class AbsStartUp {
    
    public static void main(String[] args) {
        String fName,
                lName;
        String empID;
        int hours;
        double hrRate,
                salary,
                bonus;
        
        //Create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Create HourlyEmployee object
        //Get info & display
        
        System.out.println("You are going to enter the info for an hourly employee");
        System.out.print("What is the first name of the employee? ");
        fName = keyboard.nextLine();
        System.out.print("What is the last name of the employee? ");
        lName = keyboard.nextLine();
        System.out.print("What is the employee ID? ");
        empID = keyboard.nextLine();
        System.out.print("How many hours did the employee work? ");
        hours = keyboard.nextInt();
        System.out.print("What is the hourly rate for this employee? ");
        hrRate = keyboard.nextDouble();
        System.out.println();
        
        AbsHourlyEmployee emp1 = new AbsHourlyEmployee(hrRate, fName, lName, empID);
        emp1.setHoursWorked(hours);
        emp1.pay();
        System.out.println(emp1);
        
        //Create SalariedEmployee object
        //Get info and display
        
        System.out.println();
        keyboard.nextLine();
        System.out.println("You are going to enter the info for a salaried employee");
        System.out.print("What is the first name of the employee? ");
        fName = keyboard.nextLine();
        System.out.print("What is the last name of the employee? ");
        lName = keyboard.nextLine();
        System.out.print("What is the employee ID? ");
        empID = keyboard.nextLine();
        System.out.print("How many hours did the employee work? ");
        hours = keyboard.nextInt();
        System.out.print("What is the annual salary for this employee? ");
        salary = keyboard.nextDouble();
        System.out.println();
        AbsSalariedEmployee sal_1 = new AbsSalariedEmployee(salary, fName, lName, empID);
        sal_1.setHoursWorked(hours);
        System.out.println(sal_1);
        System.out.println("Annual salary: " + sal_1.getAnnualSalary());
        System.out.println();
        
        
    }
}
