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
public class Assignment {
    double maxScore, score;
    // if assignment is pending or not
    boolean pending;

    public Assignment(double maxScore, double score, boolean pending) {
        this.maxScore = maxScore;
        this.score = score;
        this.pending = pending;
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
