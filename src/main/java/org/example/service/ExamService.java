package org.example.service;

import org.example.entity.Exam;
import org.example.entity.Question;
import org.example.repository.ExamRepository;

import java.util.Date;
import java.util.List;

public class ExamService {
    private ExamRepository examRepository = ExamRepository.getInstance();
    private static ExamService examService;
    public static ExamService getInstance(){
        if(examService == null){
            examService = new ExamService();
        }
        return examService;
    }

    public void addExam(String title, Date date, int durationInMinutes, List<Question> questions) {
        Exam exam = new Exam(title, date, durationInMinutes, questions);
        examRepository.addExam(exam);
    }
}
