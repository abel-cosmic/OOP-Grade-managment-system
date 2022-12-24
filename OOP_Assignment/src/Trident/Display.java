package Trident;

import static Trident.Curriculum.*;// I had to replace the menu extends with this
public class Display {
    public void DisplayMenu() {
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
                    displayDep();
                    return;//to return to main menu
                }
                case 2 -> {
                    displayCourse();
                    return;//to return to main menu
                }
                case 3 -> {
                    displayStudent();
                    return;//to return to main menu
                }
                default -> System.out.println("Enter a valid choice");
            }
        }while(choiceDisplay>3);
    }
    public void displayDep(){
        if (number_of_departments == 0) {
            System.out.println("No Records Available");
        }
        else {
            System.out.println("Here is the list of all Departments");
            int i = 0;
            while (i < number_of_departments) {
                System.out.println(departments[i].DName + "\t" +
                        departments[i].DID + "\t" + departments[i].AccYear);
                i++;
            }
            stopOrContinue();
        }
    }
    public void displayCourse(){

    }
    public void displayStudent(){

    }
    private void stopOrContinue(){
        do{
            System.out.println("Would you like to go back to the main menu? (Y/N)");
            input.nextLine();
            String choice = input.nextLine().toUpperCase();
            switch (choice) {
                case "Y" -> {
                    return;
                }
                case "N" -> System.exit(0);
                default -> System.out.println("Enter a valid choice");
            }
        }while (true);
    }
}
