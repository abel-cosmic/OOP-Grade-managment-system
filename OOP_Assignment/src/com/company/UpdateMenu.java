package com.company;

import java.util.Scanner;

public class UpdateMenu {
    private int choiceUpdate;

    public void setChoiceUpdate(int choiceUpdate) {
        this.choiceUpdate = choiceUpdate;
    }

    public void updateMenu() {
        do{

            System.out.println("1. Update Student Grade");
            System.out.println("2. Update Course Info");
            System.out.println("3. Update Student Personal Info");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            Scanner input = new Scanner(System.in);
            choiceUpdate = input.nextInt();
            switch (choiceUpdate) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    Grade grade = new Grade();
                    grade.updateGrade();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    Course course = new Course();
                    course.updateCourse();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    Student student = new Student();
                    student.updateStudent();
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;

            }
        } while(choiceUpdate>3);

    }
}
