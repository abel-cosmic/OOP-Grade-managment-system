package Trident;

import static Trident.Curriculum.*;// I had to replace the menu extends with this

public class Add {
    public void addMenu(){
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
                    addDep();
                    return;//to return to main menu
                }
                case 2 -> {
                    addCourse();
                    return;//to return to main menu
                }
                case 3 -> {
                    addStudent();
                    return;//to return to main menu
                }
                default -> System.out.println("Enter a valid choice");
            }
        } while (choiceAdd > 4);
    }

    public void addDep() {
        System.out.println("Enter number of departments");
        int num = input.nextInt() + number_of_departments;
        String name;
        int id,year;
        for (int i = number_of_departments ; i<num; i++){
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("\t \t \t Details for Department " + (i + 1));
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter Department Name: ");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter Department ID: ");
            id = input.nextInt();
            if (depExists(id)){
                System.out.println("Department already exists!!!!");
                return;
            }
            System.out.println("Enter Accreditation Year: ");
            year = input.nextInt();
            departments[number_of_departments] = new Department(id,year,name);
            number_of_departments++;
        }
    }
    public void addCourse(){

    }
    private void addStudent() {
    }
    public boolean depExists(int id){
        for (int j = 0;j < number_of_departments; j++){
            if (id == departments[j].DID){
                return true;
            }
        }
        return false;
    }
}
