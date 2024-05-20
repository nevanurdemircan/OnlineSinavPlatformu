package org.example.entity;

public class Teacher {
    private String name;
    private int teacherId;
    private String lesson;

    public Teacher(String name, int teacherId, String lesson) {
        this.name = name;
        this.teacherId = teacherId;
        this.lesson = lesson;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int teacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String lesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
