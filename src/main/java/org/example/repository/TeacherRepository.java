package org.example.repository;

import org.example.entity.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherRepository {
    private Connection connection;
    private static TeacherRepository teacherRepository;
    public static TeacherRepository getInstance() {
        if ( teacherRepository == null) {
            teacherRepository = new TeacherRepository();
        }
        return teacherRepository;
    }

    public void addTeacher(Teacher teacher) {
        try {
            String sql = "INSERT INTO teacher (name, teacher_id, lesson) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, teacher.name());
            preparedStatement.setInt(2, teacher.teacherId());
            preparedStatement.setString(3, teacher.lesson());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
