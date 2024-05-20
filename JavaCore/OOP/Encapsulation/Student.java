package OOP.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int student_id;
    private String student_name;
    private List<Double> grades;

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public List<Double> getGrades() {
        // Return a copy of the grades list to prevent modification
        return new ArrayList<>(grades);
    }

    public void addGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        grades.add(grade);
    }

    // Constructor (optional)
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }
}