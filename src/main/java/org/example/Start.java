package org.example;

import org.example.repository.ExamRepository;
import org.example.repository.QuestionRepository;
import org.example.repository.TeacherRepository;
import org.example.service.ExamService;
import org.example.service.QuestionService;
import org.example.service.TeacherService;
import org.example.service.UIService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Start {
    public static void start(Connection connection , UIService uiService) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
         uiService.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    uiService.addTeacher();
                    break;
                case 2:
                    uiService.addExam();
                    break;
                case 3:
                    uiService.addQuestion();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
            }
        }
    }
}
