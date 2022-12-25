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
        if (noOfDepartments == 0) {
            System.out.println("No Records Available");
        }
        else {
            System.out.println("Here is the list of all Departments");
            int i = 0;
            while (i < noOfDepartments) {
                System.out.println(departments[i].DName + "\t" +
                        departments[i].DID + "\t" + departments[i].AccYear);
                i++;
            }
            stopOrContinue();
        }
    }
    public void displayCourse(){
        if (noOfCourses == 0) {
            System.out.println("No Records Available");
        }
        else {
            System.out.println("Here is the list of all Courses");
            int i = 0;
            while (i < noOfCourses) {
                System.out.println(courses[i].CID + "\t" + courses[i].CID + "\t" +
                        courses[i].CreditHr + "\t" + courses[i].ContactHr);
                i++;
            }
            stopOrContinue();
        }
    }
    public void displayStudent(){
        if (noOfStudents == 0) {
            System.out.println("No Records Available");
        }
        else {
            System.out.println("Here is the list of all Students");
            int i = 0;
            while (i < noOfStudents) {
                System.out.println(students[i].SID + "\t" + students[i].FName + "\t" + students[i].MName + "\t"
                        + students[i].LName + "\t" + students[i].SDID);
                i++;
            }
            stopOrContinue();
        }
    }
    private void stopOrContinue(){
        do{
            System.out.println("Would you like to go back to the main menu? (Y/N)");
            String choice = input.nextLine().toUpperCase();
            //glitch here for some reason
            //makes you IT automatically enters the first itretion and let's you input in the second
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
