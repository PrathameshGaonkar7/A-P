import java.util.Scanner;

class BankAccount {
    String name, accType;
    int accNo;
    double balance;

    BankAccount(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Name: " + name + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Account Type: ");
        String accType = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, accType, balance);

        System.out.print("Enter Deposit Amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");
        acc.withdraw(sc.nextDouble());

        acc.display();
        sc.close();
    }
}