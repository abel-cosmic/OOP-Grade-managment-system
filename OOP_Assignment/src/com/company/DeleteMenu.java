package com.company;

import java.util.Scanner;

public class DeleteMenu {
    private int choiceDelete;

    public void setChoiceDelete(int choiceDelete){
        this.choiceDelete = choiceDelete;
    }
    public void DeleteMenu(){

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("1. Delete Department");
            System.out.println("2. Delete Course");
            System.out.println("3. Delete Student");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            Scanner input = new Scanner(System.in);
            choiceDelete = input.nextInt();
            switch (choiceDelete) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    Department department = new Department();
                    department.deleteDepartment();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    Course course = new Course();
                    course.deleteCourse();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    Student student = new Student();
                    student.deleteStudent();
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }while(choiceDelete>3);
    }
}
