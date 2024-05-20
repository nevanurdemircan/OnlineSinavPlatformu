package org.example.service;

import org.example.entity.Teacher;
import org.example.repository.TeacherRepository;

public class TeacherService {
    private TeacherRepository teacherRepository = TeacherRepository.getInstance();
    private static TeacherService teacherService;

    public static TeacherService getInstance(){
        if( teacherService== null){
            teacherService = new TeacherService();
        }
        return teacherService;
    }
    public void addTeacher(String name, int teacherId, String lesson){
        Teacher teacher = new Teacher(name,teacherId,lesson);
        teacherRepository.addTeacher(teacher);
    }
}
