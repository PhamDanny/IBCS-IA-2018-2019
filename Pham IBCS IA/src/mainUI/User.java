/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;

/**
 *
 * @author htvph
 */
public class User {
    // Stores all user information
    String username, password, firstName, lastName;
    int gradeLevel, hiddenID;

    public User(String username, String password, String firstName, String lastName, int gradeLevel, int hiddenID) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.hiddenID = hiddenID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public int getHiddenID() {
        return hiddenID;
    }

    public void setHiddenID(int hiddenID) {
        // hidden ID should never have to change
        //this.hiddenID = hiddenID;
    }
    
    
}