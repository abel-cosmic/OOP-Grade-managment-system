package com.company;

import java.util.Scanner;

public class DisplayMenu {

    private int choiceDisplay;
    Department department = new Department();
    public void setChoiceDisplay(int choiceDisplay) {
        this.choiceDisplay = choiceDisplay;
    }

    public void DisplayMenu() {
        do{
            System.out.println("1. Display all Departments");
            System.out.println("2. Display Course List");
            System.out.println("3. Display Student Details");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            Scanner input = new Scanner(System.in);
            choiceDisplay = input.nextInt();
            switch (choiceDisplay) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    int sizeDep = department.getSize();
                    department.setSize(sizeDep);
                    department.displayDepartment();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    Course course = new Course();
                    course.displayCourse();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    Student student = new Student();
                    student.displayStudent();
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }while(choiceDisplay>3);

    }
}
