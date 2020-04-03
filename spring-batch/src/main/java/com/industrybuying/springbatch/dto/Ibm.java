package com.industrybuying.springbatch.dto;

public class Ibm {
    int spam;
    int not_spam;
    double avg_spam_score;
    double avg_not_spam_score;

    public int getSpam() {
        return spam;
    }

    public void setSpam(int spam) {
        this.spam = spam;
    }

    public int getNot_spam() {
        return not_spam;
    }

    public void setNot_spam(int not_spam) {
        this.not_spam = not_spam;
    }

    public double getAvg_spam_score() {
        return avg_spam_score;
    }

    public void setAvg_spam_score(double avg_spam_score) {
        this.avg_spam_score = avg_spam_score;
    }

    public double getAvg_not_spam_score() {
        return avg_not_spam_score;
    }

    public void setAvg_not_spam_score(double avg_not_spam_score) {
        this.avg_not_spam_score = avg_not_spam_score;
    }
}
