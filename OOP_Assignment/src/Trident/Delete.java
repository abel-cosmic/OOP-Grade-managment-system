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
        // this function shifts all the items after the deleted index to the left and decreases the noOfDep by 1
        System.out.println("Enter a department ID:");
        int ID = input.nextInt();
        int location = departmentLocation(ID);;
        if (location == -1){
            System.out.println("Department with ID \""+ID+"\" doesn't exist.");
            return;
        }
        // we should also remove all the courses and students in this department
        for(int i = location; i< noOfDepartments -1; i++) {//ma-she-ga-sheg
            departments[i]= departments[i+1];
        }
        noOfDepartments--;
        System.out.println("Department Succesfully Deleted");
        stopOrContinue();
    }
    private void deleteCourse() {
        // this function shifts all the items after the deleted index to the left and decreases the noOfDep by 1
        System.out.println("Enter a student ID:");
        String CID = input.nextLine();
        int location = courseLocation(CID);
        if (location == -1){
            System.out.println("Student with ID \""+ CID +"\" doesn't exist.");
            return;
        }
        // we should also remove all the courses taken of courses by students
        for(int i = location; i< noOfCourses-1; i++) {//ma-she-ga-sheg
            courses[i]= courses[i+1];
        }
        noOfCourses--;
        System.out.println("Student successfully Deleted");
        stopOrContinue();
    }
    private void deleteStudent() {
        // this function shifts all the items after the deleted index to the left and decreases the noOfDep by 1
        System.out.println("Enter a student ID:");
        String SID = input.nextLine();
        int location = studentLocation(SID);
        if (location == -1){
            System.out.println("Student with ID \""+SID+"\" doesn't exist.");
            return;
        }
        for(int i = location; i< noOfStudents-1; i++) {//ma-she-ga-sheg
            students[i]= students[i+1];
        }
        noOfStudents--;
        System.out.println("Student successfully Deleted");
        stopOrContinue();
    }
    public int departmentLocation(int id){
        for (int j = 0; j < noOfDepartments; j++){
            if (id == departments[j].DID){
                return j;
            }
        }
        return -1;
    }
    public int courseLocation(String id){
        //same as the above two but only looks for courses in the same department as the student
        for (int j = 0; j < noOfCourses; j++){
            if (id.equals(courses[j].CID)){//if the student is in the same department as the course
                return j;
            }
        }
        return -1;
    }
    public int studentLocation(String id){//same as the above
        for (int j = 0; j < noOfStudents; j++){
            if (id.equals(students[j].SID)){ // == wasn't working so I used equals
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
