package studentdetails;
import java.util.Scanner;

public class StudentPersonal {
    public void readDetails(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}