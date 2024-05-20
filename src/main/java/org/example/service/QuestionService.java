package org.example.service;

import org.example.entity.Question;
import org.example.repository.QuestionRepository;

public class QuestionService {
    private QuestionRepository questionRepository = QuestionRepository.getInstance();
    private static QuestionService questionService;
    public static QuestionService getInstance(){
        if(questionService == null){
            questionService = new QuestionService();
        }
        return questionService;
    }
    public void addQuestion(String text, int correctOptionIndex) {
        Question question = new Question(text, correctOptionIndex);
        questionRepository.addQuestion(question);
    }

}
