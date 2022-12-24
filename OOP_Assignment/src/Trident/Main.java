package Trident;

import static Trident.Curriculum.*;// I had to replace the menu with this
public class Main {
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
                case 1 -> add.addMenu();
                case 3 -> display.DisplayMenu();
                case 4 -> delete.deleteMenu();
                case 5 -> {
                    return;
                }
                default -> {
                    System.out.println("Enter a valid choice");
                }
            }
        } while(true);
    }

}
