import java.io.*;
import java.util.Scanner;

public class PaySlipFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic pay: ");
        double bp = sc.nextDouble();
        double da = 0.34 * bp;
        double hra = 0.18 * (bp + da);
        double ta = 3600 + 0.34 * 3600;
        double gross = bp + da + hra + ta;
        double gpf = 0.10 * gross, tax = 0.20 * gross;
        double net = gross - (gpf + tax);

        FileWriter fw = new FileWriter("payslip.txt");
        fw.write("Gross: " + gross + "\nNet: " + net);
        fw.close();
        System.out.println("Payslip written to payslip.txt");
        sc.close();
    }
}