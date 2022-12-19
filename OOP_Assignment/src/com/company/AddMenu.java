package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMenu {
    private int choiceAdd;

    public void setChoiceAdd(int choiceAdd) {
        this.choiceAdd = choiceAdd;
    }

    public void addMenu() {
        do {
            System.out.println("1. Add Department");
            System.out.println("2. Add Course");
            System.out.println("3. Add Student");
            System.out.println("4. Add Grade");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            Scanner input = new Scanner(System.in);
            choiceAdd = input.nextInt();
            switch (choiceAdd) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    Department department = new Department();
                    System.out.println("Enter number of departments");
                    int sizeDep = input.nextInt();
                    department.setSize(sizeDep);
                    department.addDepartment();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    Course course = new Course();
                    course.addCourse();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    Student student = new Student();
                    student.addStudent();
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    Grade grade = new Grade();
                    grade.addGrade();
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        } while (choiceAdd > 4);


    }

}
