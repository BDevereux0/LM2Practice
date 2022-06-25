package collectionsPractice;

import java.util.Comparator;

public class Student implements Comparable {

    private String name;
    private int grade;
    private double gpa;

    public Student (String name, int grade, double gpa){
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public double getGPA(){
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                '}';
    }

    //can use this to compare equality, but not less than or greater.
    public boolean equals (Student other){
        return this.getGrade() == other.getGrade();
    }

    @Override
    public int compareTo(Object temp) {  //this works with primitive data types
        Student other = (Student) temp;
        if (getGrade() > other.getGrade()){
            return 1;
        }else if (getGrade() < other.getGrade()){
            return -1;
        }
        else
            return 0;
    }

    public int compareTo1(Student other){
        if (getName().compareTo(other.getName()) > 0){
            return 1;
        }else if (getName().compareTo(other.getName()) < 0){
            return -1;
        }else
            return 0;
    }
}
