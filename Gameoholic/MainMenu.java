import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1, b2, b3, b4;

    MainMenu()
    {
        super("MainMenu");
        setSize(1280,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon logo = new ImageIcon("Logo.png");
        this.setIconImage(logo.getImage());

        l1 = new JLabel("Game-O-Holic");
        l1.setFont(new Font("Arial",Font.ITALIC,30));
        l1.setForeground(Color.decode("#ffff33"));
        l1.setBounds(540, 50, 200, 50);
        add(l1);

        b1 = new JButton("Log-In");
        b1.setFont(new Font("Arial",Font.BOLD,25));
        b1.setForeground(Color.decode("#1e7b1e"));
        b1.setBackground(Color.decode("#d6f5d6"));
        b1.setBounds(565, 300, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Sign-Up");
        b2.setFont(new Font("Arial",Font.BOLD,25));
        b2.setForeground(Color.decode("#1e7b1e"));
        b2.setBackground(Color.decode("#d6f5d6"));
        b2.setBounds(565, 350, 150, 40);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Admin");
        b3.setFont(new Font("Arial",Font.BOLD,25));
        b3.setForeground(Color.decode("#1e7b1e"));
        b3.setBackground(Color.decode("#d6f5d6"));
        b3.setBounds(565, 400, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("Exit");
        b4.setFont(new Font("Arial",Font.BOLD,25));
        b4.setForeground(Color.decode("#ff1a1a"));
        b4.setBackground(Color.decode("#ff8080"));
        b4.setBounds(565, 600, 150, 40);
        b4.addActionListener(this);
        add(b4);

        JLabel background;                                  //edit
        setSize(1280,720);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("Cod.jpg");

        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1280, 720);
        add(background);                                      //edit
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            UserLogin userLogin = new UserLogin();
            this.setVisible(false);
            userLogin.setVisible(true);
        }

        if(ae.getSource() == b2)
        {
            SignUpPanel signUpPanel = new SignUpPanel();
            this.setVisible(false);
            signUpPanel.setVisible(true);
        }
        else if(ae.getSource() == b3)
        {
            Admin admin = new Admin();
            this.setVisible(false);
            admin.setVisible(true);
        }
        else if(ae.getSource() == b4)
        {
            System.exit(0);
        }
    }
}
