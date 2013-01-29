/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author Michael
 */
public class AbsSalaryPlusBonusEmployee extends AbsSalariedEmployee {
    private double annualBonus;
    private int hoursWorked;

    public AbsSalaryPlusBonusEmployee(double annualBonus, double annualSalary, String firstName, String lastName, String badgeID) {
        super(annualSalary, firstName, lastName, badgeID);
        this.annualBonus = annualBonus;
    }

    

    /**
     * @return the annualBonus
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * @param annualBonus the annualBonus to set
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
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
