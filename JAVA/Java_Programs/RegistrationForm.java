import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        Frame f = new Frame("Registration Form");
        f.setLayout(new GridLayout(5, 2));

        f.add(new Label("Name"));
        f.add(new TextField());
        f.add(new Label("Email"));
        f.add(new TextField());
        f.add(new Label("Gender"));
        f.add(new TextField());
        f.add(new Label("Age"));
        f.add(new TextField());
        f.add(new Button("Submit"));
        f.setSize(300, 200);
        f.setVisible(true);
    }
}