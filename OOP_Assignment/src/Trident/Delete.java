package Trident;

import static Trident.Curriculum.*;// I had to replace the menu extends with this


public class Delete {
    public void deleteMenu(){
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
                    deleteDep();
                    return;//to return to main menu
                }
                case 2 -> {
                    deleteCourse();
                    return;//to return to main menu
                }
                case 3 -> {
                    deleteStudent();
                    return;//to return to main menu
                }
                default -> {
                    System.out.println("Enter a valid choice");
                }
            }
        }while(choiceDelete>3);
    }


    public void deleteDep(){
        System.out.println("Enter a department ID:");
        int ID = input.nextInt();
        int location = location = delete.depLocation(ID);;
        if (location == -1){
            System.out.println("Department with ID \""+ID+"\" doesn't exist.");
            return;
        }
        // we should also remove all the courses and students in this department
        for(int i=location; i<number_of_departments-1;i++) {//mashegasheg
            departments[i]= departments[i+1];
        }
        number_of_departments--;
        System.out.println("Department Succesfully Deleted");
        stopOrContinue();
    }
    private void deleteStudent() {
    }
    private void deleteCourse() {

    }
    public int depLocation(int id){
        for (int j = 0;j < number_of_departments; j++){
            if (id == departments[j].DID){
                return j;
            }
        }
        return -1;
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
