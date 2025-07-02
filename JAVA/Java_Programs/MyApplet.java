import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 100);
        g.drawString("Simple House", 70, 170);
    }
}
// <applet code="MyApplet" width=300 height=300></applet>