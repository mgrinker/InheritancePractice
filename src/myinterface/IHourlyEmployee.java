/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Michael
 */
public class IHourlyEmployee implements IEmployee{
    private double hourlyRate;
    private double grossPay;
    
    @Override
    public String firstName() {
        String firstName = "";
        return firstName;
        
    }
    
    @Override
    public String lastName() {
        String lastName = "";
        return lastName;
        
    }
    
    @Override
    public String badgeID() {
        String badgeID = "";
        return badgeID;
        
    }
    
    @Override
    public int hoursWorked() {
        int hoursWorked = 0;
        return hoursWorked;
        
    }
    
}
