package org.example.repository;

import org.example.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepository {
    private final Connection connection;

    public StudentRepository(Connection connection) {
        this.connection = connection;
    }

    public void addStudent(Student student) {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO Student (name) VALUES (?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, student.name());

            preparedStatement.executeUpdate();

            System.out.println("Öğrenci başarıyla eklendi!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Öğrenci eklenirken bir hata oluştu: " + e.getMessage());
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