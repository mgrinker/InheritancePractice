/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Michael
 */
public class HourlyEmployee extends Employee{
    private double hourlyRate;

    public HourlyEmployee(double hourlyRate, String firstName, String lastName, int hoursWorked, String badgeID) {
        super(firstName, lastName, hoursWorked, badgeID);
        this.hourlyRate = hourlyRate;
    }
    
    
    
}
