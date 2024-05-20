package org.example.entity;

import java.util.Date;
import java.util.List;

public class Exam {
    private String title;
    private Date date;

    private int durationInMinutes;
    private List<Question> questions;

    public Exam(String title, Date date, int durationInMinutes, List<Question> questions) {
        this.title = title;
        this.date = date;
        this.durationInMinutes = durationInMinutes;
        this.questions = questions;
    }

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date date() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int durationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public List<Question> questions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
