package Trident;


import static Trident.Curriculum.*;

public class Course_Impl extends BasicFunctions {//extended to use all the basic functions that are common to all impls
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
    public void updateCourse() {
        //TODO: MAKE THE UPDATE COURSE PART
    }
    public void displayCourse(){
        if (Course.getNoOfCourses() == 0) {
            System.out.println("No Records Available");
        }
        else {
            System.out.println("Here is the list of all Courses");
            int i = 0;
            System.out.println("**********************************************************************************************************");
            System.out.println(
                    "Course ID\t |" + "Course Name\t\t    |" + "Credit hour  |" + "Contact hour|" +
                    "Lab hour|" + "Lecture hour|" + "Department Id  *"
            );
            System.out.println("**********************************************************************************************************");
            while (i < Course.getNoOfCourses()) {
                System.out.printf(
                        "* %-10s | %-20s | %-11d | %-10d | %-6d | %-10d | %-14s *%n",
                        courses[i].getCID(), courses[i].getCName(),
                        courses[i].getCreditHr(),courses[i].getContactHr(),
                        courses[i].getLabHr(),courses[i].getLectureHr(),courses[i].getDID());
                i++;
            }
            System.out.println("**********************************************************************************************************");
            stopOrContinue();
        }
    }
    public void deleteCourse() {
        // this function shifts all the items after the deleted index to the left and decreases the noOfDep by 1
        input.nextLine();
        System.out.println("Enter a Course ID:");
        String CID = input.nextLine();
        int location = courseLocation(CID);
        if (location == -1){
            System.out.println("Course with ID \""+ CID +"\" doesn't exist.");
            return;
        }
        //TODO: we should also remove all the courses taken in students of the course that is to be deleted
        for(int i = location; i< noOfCourses-1; i++) {//ma-she-ga-sheg
            courses[i]= courses[i+1];
        }
        noOfCourses--;
        System.out.println("Student successfully Deleted");
        stopOrContinue();
    }


}
