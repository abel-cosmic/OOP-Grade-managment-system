package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade extends Department {

    Course course = new Course();
    Student student = new Student();

    private static ArrayList<String> SGrade = new ArrayList<>();
    private static ArrayList<String> SGID = new ArrayList<>();
    private static ArrayList<String> SCID = new ArrayList<>();
    Menu show = new Menu();
    String choiceGrade;
    Scanner inputG = new Scanner(System.in);
    ArrayList<String>SID = student.getSID();
    ArrayList<String>CID = course.getCID();

    public static ArrayList<String> getSGID() {
        return SGID;
    }

    public static ArrayList<String> getSCID() {
        return SCID;
    }

    public static ArrayList<String> getSGrade() {
        return SGrade;
    }

    public void addGrade() {
        System.out.println("Enter Student ID:");
        String value = inputG.nextLine().toUpperCase();
        if(SID.contains(value)){
            SGID.add(value);
            System.out.println("Enter course ID: ");
            value = inputG.nextLine();
            if(CID.contains(value)){
                SCID.add(value);
                System.out.println("Enter grade for course: ");
                value = inputG.nextLine().toUpperCase();
                SGrade.add(value);
            }
            else{
                System.out.println("Course does not exist!!!");
            }
        }
        else{
            System.out.println("Student does not exist!!!");
        }

        System.out.println("Would you like to go back to the main menu? (Y/N)");
        inputD.nextLine();
        choiceGrade = inputD.nextLine().toUpperCase();
        switch (choiceGrade) {
            case "Y":
                show.welcome();
                break;
            case "N":
                System.exit(0);
            default:
                System.out.println("Enter a valid choice");
                break;
        }
    }

    public void updateGrade() {
        System.out.println("Enter Student ID: ");
        String value = inputG.nextLine().toUpperCase();
        if(SGID.contains(value)){
            System.out.println("Enter Course ID: ");
            value = inputG.nextLine().toUpperCase();
            if(SCID.contains(value)){
                int location = SCID.indexOf(value);
                System.out.println("Enter new grade of student: ");
                value = inputG.nextLine().toUpperCase();
                SGrade.set(location,value);
                System.out.println("Student grade has been successfully changed!!!");
            }
            else{
                System.out.println("Course does not exist!!!");
            }
        }
        else{
            System.out.println("Student does not exist!!!");
        }
    }

    public int calculateGPA(String mark){
       while(SCID.contains(mark)){

       }

    }
}
