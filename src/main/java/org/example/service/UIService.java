package org.example.service;

import java.util.Scanner;
import java.util.logging.Logger;

public class UIService {
    private Logger log = Logger.getLogger(getClass().getSimpleName());
    private Scanner scanner = new Scanner(System.in);
    private TeacherService teacherService = TeacherService.getInstance();
    private ExamService examService = ExamService.getInstance();
    private QuestionService questionService = QuestionService.getInstance();

    public void displayMenu() {
        System.out.println("1. Öğretmen ekle");
        System.out.println("2. Sınav oluştur");
        System.out.println("3. Soru ekle");
    }

    public int getUserChoice() {
        System.out.print("Seçiminizi yapın: ");
        return scanner.nextInt();
    }

    public void addTeacher() {
        System.out.print("Öğretmen adı: ");
        String name = scanner.nextLine();
        System.out.print("Öğretmen ID: ");
        int teacherId = scanner.nextInt();
        System.out.print("Ders: ");
        String lesson = scanner.nextLine();

        teacherService.addTeacher(name, teacherId, lesson);
        System.out.println("Öğretmen başarıyla eklendi.");
    }

    public void addExam() {
        scanner.nextLine();
        System.out.print("Sınav başlığı: ");
        String title = scanner.nextLine();
        System.out.print("Sınav tarihi (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Sınav süresi (dakika cinsinden): ");
        int durationInMinutes = scanner.nextInt();

        System.out.println("Sınav başarıyla oluşturuldu.");
    }
    public void addQuestion() {
        System.out.print("Soru metni: ");
        String text = scanner.nextLine();
        System.out.print("Doğru seçeneğin indeksi (0'dan başlayarak): ");
        int correctOptionIndex = scanner.nextInt();

        questionService.addQuestion(text,correctOptionIndex);
        System.out.println("Soru başarıyla eklendi.");
    }
}
