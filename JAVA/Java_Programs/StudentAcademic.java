package studentdetails;
import java.util.Scanner;

public class StudentAcademic {
    public void readAcademic(Scanner sc) {
        System.out.print("Enter attendance %: ");
        float attendance = sc.nextFloat();
        System.out.print("Enter marks %: ");
        float marks = sc.nextFloat();
        System.out.println("Attendance: " + attendance + "%, Marks: " + marks + "%");
    }
}