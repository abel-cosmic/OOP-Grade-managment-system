package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

    Menu show = new Menu();
    String choiceDep;
    private static int size;
    private static ArrayList<Integer> DID = new ArrayList<Integer>();
    private static ArrayList<Integer> AccYear = new ArrayList<Integer>();
    private static ArrayList<String> DName = new ArrayList<String>();
    Scanner inputD = new Scanner(System.in);

    public void setSize(int size) {
        Department.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setChoiceDep(String choiceDep) {
        this.choiceDep = choiceDep;
    }

    public void setInputD(Scanner inputD) {
        this.inputD = inputD;
    }

    public void setAccYear(ArrayList<Integer> AccYear) {
        Department.AccYear = AccYear;
    }

    public void setID(ArrayList<Integer> DID) {
        Department.DID = DID;
    }

    public void setName(ArrayList<String> DName) {
        Department.DName = DName;
    }

    public ArrayList<String> getName() {
        return DName;
    }

    public ArrayList<Integer> getID() {
        return DID;
    }

    public ArrayList<Integer> getAccYear() {
        return AccYear;
    }

    public String getChoiceDep() {
        return choiceDep;
    }

    public Scanner getInputD() {
        return inputD;
    }


    public void addDepartment() {
        if (DID.isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.println("\t\t\t* * * * * * * * * * * * * * *");
                System.out.println("\t \t \t Details for Department" + (i + 1));
                System.out.println("\t\t\t* * * * * * * * * * * * * * *");
                System.out.println("Enter Department ID: ");
                DID.add(inputD.nextInt());
                System.out.println("Enter Department Name: ");
                inputD.nextLine();
                DName.add(inputD.nextLine());
                System.out.println("Enter Accreditation Year: ");
                AccYear.add(inputD.nextInt());

            }
        } else {
            System.out.println("Enter Department ID: ");
            int check = inputD.nextInt();
            if (DID.contains(check)) {
                System.out.println("Department already exists!!!!");
            } else {
                for (int i = 0; i < size; i++) {
                    System.out.println("\t\t\t* * * * * * * * * * * * * * *");
                    System.out.println("\t \t \t Details for Department" + (i + 1));
                    System.out.println("\t\t\t* * * * * * * * * * * * * * *");
                    DID.add(check);
                    System.out.println("Enter Department Name: ");
                    inputD.nextLine();
                    DName.add(inputD.nextLine().toUpperCase());
                    System.out.println("Enter Accreditation Year: ");
                    AccYear.add(inputD.nextInt());
                }
            }


        }


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

    public void displayDepartment() {
        if (DID.isEmpty()) {
            System.out.println("No Records Available");
        }
        else {
            System.out.println("Here is the list of all Departments");
            int i = 0;
            while (i < DID.size()) {
                System.out.println(DName.get(i) + "\t" + DID.get(i) + "\t" + AccYear.get(i));
                i++;
            }

            System.out.println("Would you like to go back to the main menu? (Y/N)");
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
    public void deleteDepartment() {
        System.out.println("Enter a department ID:");
        int ID = inputD.nextInt();
        int location = DID.indexOf(ID);
        DID.remove(location);
        DName.remove(location);
        AccYear.remove(location);
        System.out.println("Department Succesfully Deleted");

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

