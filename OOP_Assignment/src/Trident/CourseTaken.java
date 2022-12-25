package Trident;

public class CourseTaken extends Course{
    String GradeLetter;
    public CourseTaken(String CID, int CreditHr, int ContactHr, int LabHr, int LectureHr, String CName, int CDID, String gL) {
        super(CID, CreditHr, ContactHr, LabHr, LectureHr, CName, CDID);
        GradeLetter = "F";
    }
    public CourseTaken(Course C){
        super(C.CID, C.CreditHr, C.ContactHr, C.LabHr, C.LectureHr, C.CName, C.DID);
        GradeLetter = "F";
    }
}
