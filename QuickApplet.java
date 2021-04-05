import java.awt.*;
import javax.swing.*;

public class QuickApplet extends JApplet {

    private JLabel label = new JLabel("This is a Java applet");

    public void init() {
        setLayout(new FlowLayout());
        label.setFont(new Font("ARIAL", Font.BOLD, 18));
        label.setForeground(Color.RED);
        add(label);
    }

    public void drawText(String text) {
        label.setText(text);
    }
}
