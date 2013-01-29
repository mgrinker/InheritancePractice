/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author Michael
 */
public class AbsSalariedEmployee extends AbsEmployee {
    private double annualSalary;
    private int hoursWorked;

    public AbsSalariedEmployee(double annualSalary, int hoursWorked, String firstName, String lastName, String badgeID) {
        super(firstName, lastName, badgeID);
        this.annualSalary = annualSalary;
        this.hoursWorked = hoursWorked;
    }

    /**
     * @return the annualSalary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the hoursWorked
     */
    @Override
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
}
