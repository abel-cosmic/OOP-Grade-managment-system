package Trident;

import java.util.ArrayList;
import java.util.Arrays;

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
                case 4 -> {
                    addGrade();
                    return;//to return to main menu
                }
                default -> System.out.println("Enter a valid choice");
            }
        } while (choiceAdd > 4);
    }
    public void addDep() {
        System.out.println("Enter number of departments");
        int num = input.nextInt() + noOfDepartments;
        String name;
        int Did,year;
        //the loop starts at the noOf departments
        //if this is the first entry i = 0
        for (int i = noOfDepartments; i<num; i++){
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("\t \t \t Details for Department " + (i + 1));
            System.out.println("\t\t\t* * * * * * * * * * * * * * *");
            System.out.println("Enter Department Name: ");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter Department ID: ");
            Did = input.nextInt();
            if (departmentLocation(Did) != -1){
                System.out.println("Department already exists!!!!");
                return;
            }
            System.out.println("Enter Accreditation Year: ");
            year = input.nextInt();
            departments[noOfDepartments] = new Department(Did,year,name);
            //after inputting all te data for the first department departments[0]
            noOfDepartments++;
            //it will increase the noOfDepartments by one so that the next entry will
            // be inputted into  departments[1] ,,, and so on
            // the same logic applies to all the other add functions like addCourse(), addStudent,
            // addGrade is almost the same as well
        }
    }
    public void addCourse(){
        System.out.println("Enter Department ID");
        int Did = input.nextInt();
        if(departmentLocation(Did) == -1){ // calls the function below that uses a basic linear search
            System.out.println("No Such Department Exists!!!");
            return;
        }
        int location = departmentLocation(Did);
        System.out.println("You Have Selected" + " " + departments[location].DName + " " + departments[location].DID);
        System.out.println("Enter Course ID: ");
        input.nextLine();
        String cid = input.nextLine().toUpperCase();
        System.out.println("Enter Course Name");
        String cName = input.nextLine().toUpperCase();
        System.out.println("Enter Credit hour");
        int creditHr = input.nextInt();
        System.out.println("Enter Contact hour");
        int contactHr = input.nextInt();
        System.out.println("Enter Lab hour");
        int lab = input.nextInt();
        System.out.println("Enter Lecture hour");
        int lec = input.nextInt();
        if(lab + lec != contactHr){
            System.out.println("Lab hour and Lecture are not equal. Fill out everything out again :)");
            return;
        }
        courses[noOfCourses] = new Course(cid,creditHr,contactHr,lab,lec,cName,Did);
        //after inputting all te data for the first course courses[0] it will ++ by one down below
        //so that when the next entry is imputed it will be in courses[1]
        // this loop below is to update all the students in the department take the new course
        for (int i = 0; i<noOfStudents; i++){
            if (Did == students[i].SDID) {
                int noCoursesByStudent = students[i].noOfCoursesTaken;
                students[i].coursesTaken[noCoursesByStudent] = new CourseTaken(courses[noOfCourses]);
                students[i].noOfCoursesTaken++;
            }
        }
        noOfCourses++;
    }
    private void addStudent() {
        System.out.println("Enter Student Department Id");
        int Did = input.nextInt();
        //glitch here for some reason
        //makes you inter student department Id twice
        if (departmentLocation(Did) == -1) {//changed this by removing the old depExists function
            System.out.println("No such Departments exist!!");
            return;
        }
        int Sdid = input.nextInt();
        System.out.println("Enter Student ID: ");
        input.nextLine();
        String sid = input.nextLine().toUpperCase();
        System.out.println("Enter Student First Name: ");
        String FName = input.nextLine().toUpperCase();
        System.out.println("Enter Student Father Name: ");
        String MName = input.nextLine().toUpperCase();
        System.out.println("Enter Student Grandfather Name");
        String LName = input.nextLine().toUpperCase();
        students[noOfStudents] = new Student(Sdid,sid,FName,MName,LName);
        //after inputting all te data for the first course courses[0] it will ++ by one down below
        //so that when the next entry is imputed it will be in courses[1]
        // this loop below is to add all the courses in the student's department to course taken
        for (int i = 0; i< noOfCourses; i++){
            if (Did == courses[i].DID) {
                int noCoursesByStudent = students[noOfStudents].noOfCoursesTaken;
                // check class student to understand this more
                students[noOfStudents].coursesTaken[noCoursesByStudent] = new CourseTaken(courses[i]);
                students[noOfStudents].noOfCoursesTaken++;
            }
        }
        noOfStudents++;
    }
    public void addGrade() {
        input.nextLine();
        System.out.println("Enter Student ID:");
        String value = input.nextLine().toUpperCase();
        int studentsIndex =studentLocation(value);
        if(studentsIndex == -1) {
            System.out.println("Student does not exist!!!");
            return;
        }
        System.out.println("Enter course ID: ");
        value = input.nextLine().trim().toUpperCase();
        if (courseLocation(value,students[studentsIndex].SDID) == -1){
            System.out.println("Course does not exist for this student!!!");
            return;
        }
        System.out.println("Enter grade for course: ");
        value = input.nextLine().trim();
        ArrayList<String> possibleGrades = new ArrayList<>(
                Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F"));
        if (!possibleGrades.contains(value)){//checks if it's a valid input
            System.out.println("Incorrect Input!!!");
            return;
        }
        System.out.println("Added grade successfully!!!");
    }
    public int departmentLocation(int id){// basic linear search that returns -1 if id ain't found
        for (int j = 0; j < noOfDepartments; j++){
            if (id == departments[j].DID){
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
    public int courseLocation(String id, int Sdid){
        //same as the above two but only looks for courses in the same department as the student
        for (int j = 0; j < noOfCourses; j++){
            if (id.equals(courses[j].CID) && courses[j].DID == Sdid){//if the student is in the same department as the course
                return j;
            }
        }
        return -1;
    }
}
