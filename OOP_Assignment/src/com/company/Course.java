package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Course extends Department {

    Department department = new Department();
    Menu show = new Menu();
    private String choiceCourse;

    private static ArrayList<String> CID = new ArrayList<String>();
    private static ArrayList<Integer> CreditHr = new ArrayList<Integer>();
    private static ArrayList<Integer> ContactHr = new ArrayList<Integer>();
    private static ArrayList<Integer> LabHr = new ArrayList<Integer>();
    private static ArrayList<Integer> LectureHr = new ArrayList<Integer>();
    private static ArrayList<String> CName = new ArrayList<String>();
    private static ArrayList<Integer> CDID = new ArrayList<Integer>();

    ArrayList<Integer>DID = department.getID();
    ArrayList<String>DName = department.getName();
    Scanner inputC = new Scanner(System.in);

    public static ArrayList<String> getCID() {
        return CID;
    }

    public void addCourse() {
        System.out.println("Enter Department ID");
        int value = inputC.nextInt();
        if(DID.contains(value)){
            CDID.add(value);
            int location = DID.indexOf(value);
            System.out.println("You Have Selected" + " " + DName.get(location) + " " + DID.get(location));
            System.out.println("Enter Course ID: ");
            inputC.nextLine();
            CID.add(inputC.nextLine().toUpperCase());
            System.out.println("Enter Course Name");
            CName.add(inputC.nextLine().toUpperCase());
            System.out.println("Enter Credit hour");
            CreditHr.add(inputC.nextInt());
            System.out.println("Enter Contact hour");
            ContactHr.add(inputC.nextInt());
            System.out.println("Enter Lab hour");
            int lab = inputC.nextInt();
            System.out.println("Enter Lecture hour");
            int lec = inputC.nextInt();
            if(lab + lec == ContactHr.get(ContactHr.size()-1)){
                LabHr.add(lab);
                LectureHr.add(lec);
            }
            else{
                System.out.println("Lab hour and Lecture are not equal. Fill out everything out again :)");
                CID.remove(CID.size()-1);
                CName.remove(CName.size()-1);
                CreditHr.remove(CreditHr.size()-1);
                ContactHr.remove(ContactHr.size()-1);
                show.welcome();
            }

        }
        else{
            System.out.println("No Such Department Exists!!!");
        }

        System.out.println("Would you like to go back to the main menu? (Y/N)");
        inputD.nextLine();
        choiceCourse = inputD.nextLine().toUpperCase();
        switch (choiceCourse) {
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

    public void updateCourse() {
        System.out.println("Enter Course ID: ");
        String value = inputC.nextLine();
        if(CID.contains(value)){
            System.out.println("What would you like to Update: ");
            System.out.println("1. Course ID ");
            System.out.println("2. Course Name ");
            System.out.println("3. Credit hour ");
            System.out.println("4. Contact hour ");
            System.out.println("5. Lab hour ");
            System.out.println("6. Lecture hour ");
            int location;
            int values;
            int choice = inputC.nextInt();
            switch(choice){
                case 1: location = CID.indexOf(value);
                        System.out.println("Enter new Course ID");
                        value = inputC.nextLine().toUpperCase();
                        CID.set(location,value);
                        System.out.println("Course ID has been successfully updated!!!");
                        break;
                case 2: location = CID.indexOf(value);
                    System.out.println("Enter new Course Name");
                    value = inputC.nextLine().toUpperCase();
                    CName.set(location,value);
                    System.out.println("Course Name has been successfully updated!!!");
                    break;
                case 3: location = CID.indexOf(value);
                    System.out.println("Enter new Credit Hour");
                    values = inputC.nextInt();
                    CreditHr.set(location,values);
                    System.out.println("Credit hour has been successfully updated!!!");
                    break;
                case 4: location = CID.indexOf(value);
                    System.out.println("Enter new Contact Hour");
                    values = inputC.nextInt();
                    ContactHr.set(location,values);
                    System.out.println("Contact Hour has been successfully updated!!!");
                    break;
                case 5: location = CID.indexOf(value);
                    System.out.println("Enter new Lab Hour");
                    values = inputC.nextInt();
                    LabHr.set(location,values);
                    System.out.println("Lab Hour has been successfully updated!!!");
                    break;
                case 6: location = CID.indexOf(value);
                    System.out.println("Enter new Lecture hour");
                    values = inputC.nextInt();
                    LectureHr.set(location,values);
                    System.out.println("Lecture hour has been successfully updated!!!");
                    break;
            }
        }

        else{
            System.out.println("Course Not Found!!!");
        }

        System.out.println("Would you like to go back to the main menu? (Y/N)");
        choiceCourse = inputD.nextLine().toUpperCase();
        switch (choiceCourse) {
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

    public void displayCourse() {

        if(CID.isEmpty()){
            System.out.println("No records available!!!");
        }
        else{
            System.out.println("Please enter Department ID: ");
            int value = inputC.nextInt();
            boolean found = false;
                if(CDID.contains(value)){
                    found = true;
                    System.out.println("Here is a list of all the courses in the department");
                    for(int i=0; i<CDID.size();i++){
                        if(CDID.get(i) == value){
                            int location = CDID.indexOf(value);
                                 System.out.println("Department: "
                                + CDID.get(location) + " " + "Course Name: "
                                + CName.get(location) + " " + "Course ID: "
                                + CID.get(location) + " "  + "Contact Hour: "
                                + ContactHr.get(location) + " " + "Lab hour: "
                                + LabHr.get(location) + " " + "Lecture hour: " + " "
                                +  LectureHr.get(location));
                        }
                    }
                }
                else{
                    System.out.println("Department doesn't exist");
                }
            }
        System.out.println("Would you like to go back to the main menu? (Y/N)");
        choiceCourse = inputD.nextLine().toUpperCase();
        switch (choiceCourse) {
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

    public void deleteCourse() {
        System.out.println("Enter Department ID");
        int ID = inputD.nextInt();
        int location = CDID.indexOf(ID);
        CID.remove(location);
        CName.remove(location);
        CDID.remove(location);
        CreditHr.remove(location);
        ContactHr.remove(location);
        LectureHr.remove(location);
        LabHr.remove(location);
        System.out.println("Course Successfully Deleted");

        System.out.println("Would you like to go back to the main menu? (Y/N)");
        inputD.nextLine();
        choiceDep = inputD.nextLine().toUpperCase();
        switch (choiceDep) {
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
}
