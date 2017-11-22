import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Kosmiczny system komputerowy");
        final JButton btnLogin = new JButton("Przycisk dostępu");
        final JLabel l1 = new JLabel();
        final PictureDisplay picture = new PictureDisplay();
        frame.add(picture);
        frame.add(l1);
        l1.setBounds(30,50,450,20);
        l1.setText("Zaloguj się i zdobądź przynajmniej 3 punkty, aby uzyskać wskazówkę!\n");
        l1.setVisible(true);

        btnLogin.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        LoginDialog loginDlg = new LoginDialog(frame);
                        loginDlg.setVisible(true);
                        // if logon successfully
                        if(loginDlg.isSucceeded()){
                            Test quiz = new Test("Galaktyczny Quiz");
                            quiz.setLocationRelativeTo(null);
                            quiz.setVisible(true);
                        }
                    }
                });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(btnLogin);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
