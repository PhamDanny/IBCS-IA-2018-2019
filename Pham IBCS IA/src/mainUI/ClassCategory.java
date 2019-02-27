/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;

import java.util.ArrayList;

/**
 *
 * @author htvph
 */
public class ClassCategory {
    double weight;
    ArrayList<Assignment> assignments = new ArrayList<>();

    public ClassCategory(double weight) {
        this.weight = weight;
    }

    public double getPercentage() {
        double totalScore = 0, maxScore = 0;
        for(Assignment addedAssignment : assignments) {
            if(!addedAssignment.isPending()) {
            // only add non-pending assignments
            totalScore += addedAssignment.getScore();
            maxScore += addedAssignment.getMaxScore();
            }
        }
        
        return (totalScore / maxScore) * weight;
    }
    public double getCategoryPercentage() {
        return getPercentage() / weight;
    }
    public double getGradeNeeded(double neededIncrease) {
        // calculates the grade needed from pending assignments based on how much of a score increase in the category is needed
        double totalScore = 0, maxScore = 0, pendingPoints = 0;
        for(Assignment addedAssignment : assignments) {
            if(!addedAssignment.isPending()) {
                // only add non-pending assignments
                totalScore += addedAssignment.getScore();
                maxScore += addedAssignment.getMaxScore();
            }
            else {
                pendingPoints += addedAssignment.getMaxScore();
            }
        }            
        return (getCategoryPercentage() + neededIncrease) * (maxScore + pendingPoints) - totalScore;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
    
    
}
