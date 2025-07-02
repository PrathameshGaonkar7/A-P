import java.util.Scanner;

class Person {
    String name;
    int age;

    void inputPerson(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt(); sc.nextLine();
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    String designation;

    void inputEmployee(Scanner sc) {
        inputPerson(sc);
        System.out.print("Enter designation: ");
        designation = sc.nextLine();
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.inputEmployee(sc);
        emp.displayEmployee();
        sc.close();
    }
}