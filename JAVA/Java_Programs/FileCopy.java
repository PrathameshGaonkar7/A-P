import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("payslip.txt");
        FileWriter fw = new FileWriter("copy.txt");
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();
        System.out.println("Copied payslip.txt to copy.txt");
    }
}