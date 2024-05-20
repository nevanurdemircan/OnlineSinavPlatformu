package org.example.entity;

import java.util.List;

public class Question {
    private String text;
    private List<String> options;
    private int correctOptionIndex;

    public Question(String text, int correctOptionIndex) {
        this.text = text;
        this.correctOptionIndex = correctOptionIndex;
    }

    public List<String> options() {
        return options;
    }

    public String text() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int correctOptionIndex() {
        return correctOptionIndex;
    }

    public void setCorrectOptionIndex(int correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }
}
