import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        Button add = new Button("+");

        tf1.setBounds(50, 50, 150, 20);
        tf2.setBounds(50, 80, 150, 20);
        tf3.setBounds(50, 140, 150, 20);
        add.setBounds(50, 110, 50, 20);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                tf3.setText(String.valueOf(a + b));
            }
        });

        f.add(tf1); f.add(tf2); f.add(tf3); f.add(add);
        f.setSize(250, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}