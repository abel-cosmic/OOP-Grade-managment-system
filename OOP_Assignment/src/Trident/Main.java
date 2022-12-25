package Trident;

import static Trident.Curriculum.*;

public class Main {
    // read class curriculum after this to understand the main logic of the code
    public static void main(String[] args) {
        int menuChoice;
        System.out.println("\t\t\t* * * * * * * * * * * * * * *");
        System.out.println("\t\t\tWelcome to HEUC Student Management System");
        System.out.println("\t\t\t* * * * * * * * * * * * * * *");
        do{
            System.out.println("1. Add");
            System.out.println("2. Update");
            System.out.println("3. Display");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            menuChoice = input.nextInt();
            switch (menuChoice) {
                case 1 -> addMenu();
                case 2 -> updateMenu();
                case 3 -> displayMenu();
                case 4 -> deleteMenu();
                case 5 -> {
                    return;
                }
                default -> {
                    System.out.println("Enter a valid choice");
                }
            }
        } while(true);
    }
    public static void addMenu(){
        int choiceAdd;
        do {
            System.out.println("1. Add Department");
            System.out.println("2. Add Course");
            System.out.println("3. Add Student");
            System.out.println("4. Add Grade");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            choiceAdd = input.nextInt();
            switch (choiceAdd) {
                case 1 -> {
                    departmentAccess.addDep();
                    return;//to return to main menu
                }
                case 2 -> {
                    courseAccess.addCourse();
                    return;//to return to main menu
                }
                case 3 -> {
                    studentAccess.addStudent();
                    return;//to return to main menu
                }
                case 4 -> {
                    studentAccess.addGrade();
                    return;//to return to main menu
                }
                default -> System.out.println("Enter a valid choice");
            }
        } while (choiceAdd > 4);
    }
    public static void updateMenu() {
        int choiceUpdate;
        do{
            System.out.println("1. Update Student Grade");
            System.out.println("2. Update Course Info");
            System.out.println("3. Update Student Personal Info");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            choiceUpdate = input.nextInt();
            switch (choiceUpdate) {
                case 1:
                    studentAccess.updateStudentGrade();
                    return;
                case 2:
                    courseAccess.updateCourse();
                    return;
                case 3:
                    studentAccess.updateStudent();
                    return;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        } while(true);

    }
    public static void displayMenu() {
        int choiceDisplay;
        do{
            System.out.println("1. Display all Departments");
            System.out.println("2. Display Course List");
            System.out.println("3. Display Student Details");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            choiceDisplay = input.nextInt();
            switch (choiceDisplay) {
                case 1 -> {
                    departmentAccess.displayDep();
                    return;//to return to main menu
                }
                case 2 -> {
                    courseAccess.displayCourse();
                    return;//to return to main menu
                }
                case 3 -> {
                    studentAccess.displayStudent();
                    return;//to return to main menu
                }
                default -> System.out.println("Enter a valid choice");
            }
        }while(choiceDisplay>3);
    }
    public static void deleteMenu(){
        int choiceDelete;
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("1. Delete Department");
            System.out.println("2. Delete Course");
            System.out.println("3. Delete Student");
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter your choice");
            choiceDelete = input.nextInt();
            switch (choiceDelete) {
                case 1 -> {
                    departmentAccess.deleteDep();
                    return;//to return to main menu
                }
                case 2 -> {
                    courseAccess.deleteCourse();
                    return;//to return to main menu
                }
                case 3 -> {
                    studentAccess.deleteStudent();
                    return;//to return to main menu
                }
                default -> {
                    System.out.println("Enter a valid choice");
                }
            }
        }while(choiceDelete>3);
    }
}
