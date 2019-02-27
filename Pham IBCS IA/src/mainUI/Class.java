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
public class Class {
    String className, teacherName;
    ArrayList<ClassCategory> categories = new ArrayList<>();

    public Class(String className, String teacherName) {
        this.className = className;
        this.teacherName = teacherName;
    }

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
    
    
}
