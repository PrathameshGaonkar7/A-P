import studentdetails.StudentPersonal;
import studentdetails.StudentAcademic;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentPersonal sp = new StudentPersonal();
        StudentAcademic sa = new StudentAcademic();
        sp.readDetails(sc);
        sa.readAcademic(sc);
        sc.close();
    }
}