package Trident;

import java.util.Scanner;

// this class is imported in Add Delete Display
public class Curriculum {
    // these are all the departments courses and students of the curriculum
    public static Department[] departments = new Department[10];
    public static Course[] courses = new Course[100];
    public static Student[] students = new Student[1000];
    //noOf______ is used to keep track of how many ______ are registered in the system
    static int noOfDepartments = 0;
    static int noOfCourses = 0;
    static int noOfStudents = 0;
    static Scanner input = new Scanner(System.in);

    static Add add = new Add();
    static Display display = new Display();
    static Delete delete = new Delete();
}
