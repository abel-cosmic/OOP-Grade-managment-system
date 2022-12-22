package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student extends Department {

    Department department = new Department();
    Grade grade = new Grade();
    Menu show = new Menu();
    private String choiceStudent;

    Map<String, Double> gradeValues = new HashMap<>();


    private static ArrayList<String> SID = new ArrayList<>();
    private static ArrayList<String> FName = new ArrayList<>();
    private static ArrayList<String> MName = new ArrayList<>();
    private static ArrayList<String> LName = new ArrayList<>();
    private static ArrayList<Integer> SDID = new ArrayList<>();
    ArrayList<Integer>DID = department.getID();
    ArrayList<String>DName = department.getName();
    ArrayList<String>SCID = Grade.getSCID();
    ArrayList<String>SGrade = Grade.getSGrade();
    ArrayList<String>SGID = Grade.getSGID();
    Scanner inputD = new Scanner(System.in);

    public static ArrayList<String> getSID() {
        return SID;
    }

    public void addStudent() {
        System.out.println("Enter Student Department");
        int value = inputD.nextInt();
        if(DID.contains(value)){
            SDID.add(inputD.nextInt());
            System.out.println("Enter Student ID: ");
            SID.add(inputD.nextLine().toUpperCase());
            System.out.println("Enter Student First Name: ");
            FName.add(inputD.nextLine().toUpperCase());
            System.out.println("Enter Student Father Name: ");
            MName.add(inputD.nextLine().toUpperCase());
            System.out.println("Enter Student Grandfather Name");
            LName.add(inputD.nextLine().toUpperCase());
        }
        else{
            System.out.println("No such Departments exist!!");
        }

        System.out.println("Would you like to go back to the main menu? (Y/N)");
        inputD.nextLine();
        choiceStudent = inputD.nextLine().toUpperCase();
        switch (choiceStudent) {
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

    public void updateStudent() {
        System.out.println("Enter Student ID:");
        String value = inputD.nextLine();
        if (SID.contains(value)){
            int location = SID.indexOf(value);
            System.out.println("Enter new Student First Name: ");
            value = inputD.nextLine().toUpperCase();
            FName.set(location,value);
            System.out.println("Enter new Student Father Name: ");
            value = inputD.nextLine().toUpperCase();
            MName.set(location,value);
            System.out.println("Enter new Student Grandfather Name: ");
            value = inputD.nextLine().toUpperCase();
            LName.set(location,value);
            System.out.println("Data of Student " + SID + " " + " Successfully Updated");
        }

        else{
            System.out.println("Student Not Found!!!");
        }

        System.out.println("Would you like to go back to the main menu? (Y/N)");
        inputD.nextLine();
        choiceStudent = inputD.nextLine().toUpperCase();
        switch (choiceStudent) {
            case "Y":
                Menu show = new Menu();
                show.welcome();
                break;
            case "N":
                System.exit(0);
            default:
                System.out.println("Enter a valid choice");
                break;
        }
    }

    public void displayStudent() {
        System.out.println("Enter Student ID: ");
        String value = inputD.nextLine();
        if(SID.contains(value)){
            int location = SID.indexOf(value);
            System.out.println("First Name: " + FName.get(location) + " " + "Father Name: " + MName.get(location) + " " + "Grandfather Name: " + LName.get(location) );

            gradeValues.put("A+" , 4.00);
            gradeValues.put("A" , 4.00);
            gradeValues.put("A-",3.75 );
            gradeValues.put("B+",3.50);
            gradeValues.put("B",3.00);
            gradeValues.put("B-",2.75);
            gradeValues.put("C+",2.50);
            gradeValues.put("C",2.00);
            gradeValues.put("C-",1.75);
            gradeValues.put("D",1.00);
            gradeValues.put("F",0.00);

            System.out.println("CGPA: ");
        }


    }

    public void deleteStudent() {
    }
}
