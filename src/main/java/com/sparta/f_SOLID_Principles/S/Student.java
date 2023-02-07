package com.sparta.f_SOLID_Principles.S;

public class Student {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

//    public void printDetails() {
//        System.out.println(this.toString() + "there are the details");
//    }
//
//    public void calculateGradePercentage() {
//        // some maths that access points and returns their grade
//    }

}
