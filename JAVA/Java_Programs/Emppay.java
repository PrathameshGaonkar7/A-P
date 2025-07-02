package employeepay;
public class Emppay {
    String name, gender;
    int empid;
    double basic, da, hra, ta, gross, deductions, net;

    public Emppay(String name, int empid, String gender, double basic) {
        this.name = name;
        this.empid = empid;
        this.gender = gender;
        this.basic = basic;
    }

    public void computePay() {
        da = 0.34 * basic;
        hra = 0.18 * (basic + da);
        ta = 3600 + 0.34 * 3600;
        gross = basic + da + hra + ta;
        deductions = 0.1 * gross + 0.2 * gross;
        net = gross - deductions;
    }

    public void displayPay() {
        System.out.println("Gross Pay: " + gross);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Pay: " + net);
    }
}