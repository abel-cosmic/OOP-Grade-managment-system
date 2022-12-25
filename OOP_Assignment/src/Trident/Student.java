package Trident;

public class Student {
    String SID;
    String FName;
    String MName;
    String LName;
    int SDID;
    //the field bellow works the same as departments in curriculum
    CourseTaken[] coursesTaken = new CourseTaken[10];//every student has at most 10 courses
    int noOfCoursesTaken;//to keep track of how many courses this student is already taking
    //add an object for course taken
    public Student( int SDID,String SID, String FName, String MName, String LName){
        this.SID = SID;
        this.FName = FName;
        this.MName = MName;
        this.LName = LName;
        this.SDID = SDID;
        noOfCoursesTaken = 0;
    }

}
