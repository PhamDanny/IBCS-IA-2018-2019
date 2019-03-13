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
public class Class implements Serializable {
    String className, teacherName;
    ArrayList<ClassCategory> categories = new ArrayList<>();

    public Class(String className, String teacherName) {
        this.className = className;
        this.teacherName = teacherName;
    }

    // getters and setters
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public ArrayList<ClassCategory> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<ClassCategory> categories) {
        this.categories = categories;
    }
    
    // methods
    public double getOverallGrade() {
        double overallGrade = 0;
        for (ClassCategory category : categories) {
            overallGrade += category.getWeightedGrade();
        }
        return overallGrade;
    }
    
    public boolean havePendingAssignments() {
        // returns if there are currently pending assignments
        boolean havePending = false;
        for (ClassCategory category : categories) {
            for (Assignment assignment : category.assignments) {
                if(assignment.isPending()) {
                    havePending = true;
                }
            }
        }
        return havePending;
    }
    
    public ClassCategory getPendingCategoryIndex() {
        // returns the category with the pending assignment
        if(havePendingAssignments()) {
            for (ClassCategory category: categories) {
                for (Assignment assignment : category.assignments) {
                    if(assignment.isPending()) {
                        return category;
                    }
                }
            }
        }
        return null;
    }
    public void addPendingAssignment(int categoryIndex, String name, double maxScore, double score) {
        //
        if(havePendingAssignments()) {
            categories.get(categoryIndex).assignments.add(new Assignment(name, maxScore, score, true));
        }
        else {
            // TO DO: tell user they cannot have multiple pending assignments
        }
    }
    public void addCompleteAssignment(int categoryIndex, String name, double maxScore, double score) {
        categories.get(categoryIndex).assignments.add(new Assignment(name, maxScore, score, false));
    }
}
