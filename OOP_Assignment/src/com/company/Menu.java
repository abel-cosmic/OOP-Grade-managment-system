package com.company;
import java.lang.*;
import java.util.Scanner;

public class Menu {
    private int choiceMenu;

    public void setChoiceMenu(int choiceMenu) {
        this.choiceMenu = choiceMenu;
    }

    public void  welcome(){
        System.out.println("\t\t\t* * * * * * * * * * * * * * *");
        System.out.println("\t\t\tWelcome to HEUC Student Managment System");
        System.out.println("\t\t\t* * * * * * * * * * * * * * *");
        do{
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Display");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("\t\t\t* * * * * * * * * * * * * * *");
        System.out.println("Enter your choice");
        Scanner input = new Scanner(System.in);
        choiceMenu = input.nextInt();
            switch(choiceMenu){
                case 1: System.out.print("\033[H\033[2J");
                        AddMenu add = new AddMenu();
                        add.addMenu();
                        break;
                case 2:  System.out.print("\033[H\033[2J");
                        UpdateMenu update = new UpdateMenu();
                        update.UpdateMenu();
                        break;
                case 3: System.out.print("\033[H\033[2J");
                        DisplayMenu display = new DisplayMenu();
                        display.DisplayMenu();
                        break;
                case 4:
                    System.out.print("\033[H\033[2J");
                        DeleteMenu delete = new DeleteMenu();
                        delete.DeleteMenu();
                        break;
                case 5: System.exit(0);
                        break;
                default:
                        System.out.println("Enter a Valid Input");
                        break;
            }
        } while(choiceMenu>5);
    }

}

