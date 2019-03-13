/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author htvph
 */
public class ClassCategory implements Serializable{
    private String name;
    private double weight;
    public ArrayList<Assignment> assignments = new ArrayList<>();

    public ClassCategory(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeightedGrade() {
        if(assignments.isEmpty()) {
            // returns full score if no assignments in category yet
            return weight;
        }
        else {
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
    }
    public double getCategoryGrade() {
        return getWeightedGrade() / weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
