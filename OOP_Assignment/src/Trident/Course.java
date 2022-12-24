package Trident;


public class Course {
    String CID;
    int CreditHr;
    int ContactHr;
    int LabHr;
    int LectureHr;
    String CName;
    int CDID;

    public Course(String CID, int CreditHr, int ContactHr, int LabHr, int LectureHr, String CName, int CDID){
        this.CID = CID;
        this.CreditHr = CreditHr;
        this.ContactHr = ContactHr;
        this.LabHr = LabHr;
        this.LectureHr = LectureHr;
        this.CName = CName;
        this.CDID = CDID;
    }
}
