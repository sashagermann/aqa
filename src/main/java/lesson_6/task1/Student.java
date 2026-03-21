package lesson_6.task1;
import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> marks;

    public Student(String name, String group, int course, Map<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageMark() {
        int sum = 0;
        for (int mark : marks.values()) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public static void deleteStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageMark() < 3.0);
    }

    public static void transferStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageMark() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.getName() + ". Курс: " + student.getCourse());
            }
        }
    }
}