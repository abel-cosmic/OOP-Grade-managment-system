package Trident;

public class CourseTaken extends Course{
    String GradeLetter;
    public CourseTaken(String CID, int CreditHr, int ContactHr, int LabHr, int LectureHr, String CName, int CDID) {
        super(CID, CreditHr, ContactHr, LabHr, LectureHr, CName, CDID);
    }
}
