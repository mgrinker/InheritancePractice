/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Michael
 */
public class SalariedEmployee extends Employee{
    private double annualSalary;

    public SalariedEmployee(double annualSalary, String firstName, String lastName, int hoursWorked, String badgeID) {
        super(firstName, lastName, hoursWorked, badgeID);
        this.annualSalary = annualSalary;
    }
    
    
}
