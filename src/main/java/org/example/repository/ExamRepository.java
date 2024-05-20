package org.example.repository;

import org.example.entity.Exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExamRepository {
    private Connection connection;
    private static ExamRepository examRepository;
    public static ExamRepository getInstance(){
       if(examRepository == null){
           examRepository = new ExamRepository();
       }
       return examRepository;
    }
    public void addExam(Exam exam) {
        PreparedStatement preparedStatement = null;

        try {
            String sql = "INSERT INTO Exam (title, date, duration_in_minutes) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, exam.title());
            preparedStatement.setDate(2, new java.sql.Date(exam.date().getTime()));
            preparedStatement.setInt(3, exam.durationInMinutes());

            preparedStatement.executeUpdate();

            System.out.println("Sınav başarıyla eklendi!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Sınav eklenirken bir hata oluştu: " + e.getMessage());
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
