package pckg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var diana = new Student("Диана", "24-ИСТ", 1, new int[]{5, 4, 5, 3, 5});
        var alex = new Student("Александр", "24-ИСТ", 1, new int[]{4, 3, 5, 3, 4});
        var vlad = new Student("Владислав", "23-ИВТ", 2, new int[]{2, 3, 2, 3, 2});
        var mary = new Student("Мария", "23-ИВТ", 2, new int[]{5, 5, 5, 5, 5});
        var daniil = new Student("Даниил", "22-МОА", 3, new int[]{2, 3, 2, 3, 3});
        var michael = new Student("Михаил", "22-МОА", 3, new int[]{4, 3, 4, 3, 4});

        List<Student> students = new ArrayList<>(Arrays.asList(diana, alex, vlad, mary, daniil, michael));

        System.out.println(students.size());

        Student.deleteStudents(students);

        System.out.println(students.size());

    }
}
