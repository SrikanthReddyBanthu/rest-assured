package com.cjss.restassured;

import com.cjss.restassured.model.Student;

import java.util.*;

public class CollectionsExamples2 {

    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("101", "N1", "CSE");
        Student student2 = new Student("102", "N 2", "CSE");
        Student student3 = new Student("103", "N 3", "IT");
        Student student4 = new Student("104", "N 3", "ECE");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student student: students) {
            System.out.println(student.getRno() + " : " + student.getName() + " : " + student.getBranch());
        }

    }


}
