package pckg;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public static void deleteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student nextStudent = iterator.next();
            int avgGrade = 0;

            for (int grade : nextStudent.grades)
                avgGrade += grade;

            if (avgGrade / nextStudent.grades.length < 3)
                iterator.remove();
        }
    }

}
