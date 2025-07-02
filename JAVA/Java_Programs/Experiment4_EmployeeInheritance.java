import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void getPersonDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public void showPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    protected int empId;
    protected String designation;

    public void getEmployeeDetails(Scanner sc) {
        getPersonDetails(sc);
        System.out.print("Enter employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter designation: ");
        designation = sc.nextLine();
    }

    public void showEmployeeDetails() {
        showPersonDetails();
        System.out.println("Emp ID: " + empId + ", Designation: " + designation);
    }
}

class Teaching extends Employee {
    private String subject;

    public void getTeachingDetails(Scanner sc) {
        getEmployeeDetails(sc);
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
    }

    public void showTeachingDetails() {
        showEmployeeDetails();
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teaching t = new Teaching();
        t.getTeachingDetails(sc);
        System.out.println("\n--- Employee Details ---");
        t.showTeachingDetails();
        sc.close();
    }
}