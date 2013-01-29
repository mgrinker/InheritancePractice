/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myconcrete;

/**
 *
 * @author Michael
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double annualBonus;

    public SalaryPlusBonusEmployee(double annualBonus, double annualSalary, String firstName, String lastName, int hoursWorked, String badgeID) {
        super(annualSalary, firstName, lastName, hoursWorked, badgeID);
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
    
    
    
    
}
