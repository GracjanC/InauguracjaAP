import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    public AppFrame() {
        super("Hello World");
        JPanel PictureDisplay = new PictureDisplay();
        add(PictureDisplay);
        setSize(300, 300);
        setLocation(0,0);
        setLayout(new GridLayout(1, 3));

        add(new JButton("Przycisk 1"));
        add(new JButton("Przycisk 2"));
        add(new JButton("Przycisk 3"));

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
