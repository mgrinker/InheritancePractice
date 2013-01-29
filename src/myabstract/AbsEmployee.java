/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

/**
 *
 * @author Michael
 */
public abstract class AbsEmployee {
    private String firstName;
    private String lastName;
    private String badgeID;

    public AbsEmployee(String firstName, String lastName, String badgeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.badgeID = badgeID;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the badgeID
     */
    public String getBadgeID() {
        return badgeID;
    }

    /**
     * @param badgeID the badgeID to set
     */
    public void setBadgeID(String badgeID) {
        this.badgeID = badgeID;
    }
    
    public String toString(){
        String str;
        
        str = "Name: " + firstName + " " + lastName
                + "\nID Number: " + badgeID;
        return str;
    }
    
    public abstract int hoursWorked();
}
