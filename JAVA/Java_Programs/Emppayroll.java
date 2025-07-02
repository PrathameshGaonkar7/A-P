import employeepay.Emppay;
import java.util.Scanner;

public class Emppayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter empid: ");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter basic pay: ");
        double basic = sc.nextDouble();

        Emppay e = new Emppay(name, empid, gender, basic);
        e.computePay();
        e.displayPay();
        sc.close();
    }
}