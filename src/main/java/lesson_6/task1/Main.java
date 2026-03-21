package lesson_6.task1;

import java.util.*;

import static lesson_6.task1.Student.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Маша", "Группа 11б", 1,
                Map.of("Логика", 2, "Экономика", 4)));
        students.add(new Student("Саша", "Группа 11э", 1,
                Map.of("Экономика", 3, "Логика", 5)));
        students.add(new Student("Паша", "Группа 11м", 1,
                Map.of("Экономика", 2, "Маркетинг", 3)));
        deleteStudents(students);
        transferStudents(students);
        printStudents(students, 2);
    }
}