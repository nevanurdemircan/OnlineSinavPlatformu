package org.example.repository;

import org.example.entity.Question;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestionRepository {
    private  Connection connection;
    private static QuestionRepository questionRepository;
    public static QuestionRepository getInstance(){
        if(questionRepository == null){
            questionRepository= new QuestionRepository();
        }
        return questionRepository;
    }
    public void addQuestion(Question question) {
        try {
            String sql = "INSERT INTO question (text, correct_option_index, option) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, question.text());
            preparedStatement.setInt(2, question.correctOptionIndex());

            for (String option : question.options()) {
                preparedStatement.setString(3, option);
                preparedStatement.executeUpdate();
            }

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
