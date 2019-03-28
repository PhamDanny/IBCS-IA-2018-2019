/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;
import java.io.Serializable;
/**
 *
 * @author Danny Pham
 */
public class Assignment implements Serializable {
    private String name;
    private double maxScore, score;
    // if assignment is pending or not
    private boolean pending;

    public Assignment(String name, double maxScore, double score, boolean pending) {
        this.name = name;
        this.maxScore = maxScore;
        this.score = score;
        this.pending = pending;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }
    
}
