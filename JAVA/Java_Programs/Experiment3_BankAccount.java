import java.util.Scanner;

class BankAccount {
    private String name;
    private int accNo;
    private String accType;
    private double balance;

    public BankAccount(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter account type: ");
        String accType = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, accType, balance);

        System.out.print("Enter amount to deposit: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        acc.withdraw(sc.nextDouble());

        acc.display();
        sc.close();
    }
}