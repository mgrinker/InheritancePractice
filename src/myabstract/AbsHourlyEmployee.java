/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author Michael
 */
public class AbsHourlyEmployee extends AbsEmployee{
    private double hourlyRate;
    private double grossPay;
    private int hoursWorked;

    public AbsHourlyEmployee(double hourlyRate, String firstName, String lastName, String badgeID) {
        super(firstName, lastName, badgeID);
        this.hourlyRate = hourlyRate;
    }

    

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public void pay() {
        grossPay = hourlyRate * hoursWorked;
    }
    
    @Override
    public String toString() {
        String str;
        
        str = super.toString()
                + "\nHourly Rate: " + hourlyRate
                + "\nGross Pay: " + grossPay;
        
        return str;
    }
    
    /**
     * @param hoursWorked the hourlyRate to set
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public int getHoursWorked() {
        
        return hoursWorked;
    }
    
    
}
