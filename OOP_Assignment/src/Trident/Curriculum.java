package Trident;

import java.util.Scanner;

// this class is imported in Adder Delete
public class Curriculum {
    public static Department[] departments = new Department[10];
    static int number_of_departments = 0;
    static Scanner input = new Scanner(System.in);

    // I had to replace the menu extends with this
    //Why?
    // it was because classes like Adder extended from Menu but then an adder object
    // just like the one below were a field of Menu which made a full loop
    static Add add = new Add();
    static Display display = new Display();
    static Delete delete = new Delete();
}
