import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPanel extends JFrame implements ActionListener
{
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    JLabel l0, l1, l2, l3, l4, l5, l6, l7, l8;
    JButton b1, b2;

    SignUpPanel()
    {
        super("Sign-Up Panel");
        setSize(1280,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon logo = new ImageIcon("Logo.png");
        this.setIconImage(logo.getImage());

        l0 = new JLabel("Game-O-Holic");
        l0.setFont(new Font("Arial",Font.ITALIC,30));
        l0.setForeground(Color.decode("#ffff33"));
        l0.setBounds(540, 50, 200, 50);
        add(l0);

        l1 = new JLabel("Name");
        l1.setFont(new Font("Arial",Font.PLAIN,25));
        l1.setForeground(Color.decode("#ff9933"));
        l1.setBounds(540, 170, 150, 40);
        add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Arial",Font.BOLD,25));
        t1.setBounds(625, 170, 150, 40);
        add(t1);

        l2 = new JLabel("E-Mail");
        l2.setFont(new Font("Arial",Font.PLAIN,25));
        l2.setForeground(Color.decode("#ff9933"));
        l2.setBounds(540, 220, 150, 40);
        add(l2);

        t2 = new JTextField();
        t2.setFont(new Font("Arial",Font.BOLD,25));
        t2.setBounds(625, 220, 150, 40);
        add(t2);

        l3 = new JLabel("Password");
        l3.setFont(new Font("Arial",Font.PLAIN,25));
        l3.setForeground(Color.decode("#ff9933"));
        l3.setBounds(500, 270, 150, 40);
        add(l3);

        t3 = new JTextField();
        t3.setFont(new Font("Arial",Font.BOLD,25));
        t3.setBounds(625, 270, 150, 40);
        add(t3);

        l4 = new JLabel("Confirm Password");
        l4.setFont(new Font("Arial",Font.PLAIN,25));
        l4.setForeground(Color.decode("#ff9933"));
        l4.setBounds(405, 320, 210, 40);
        add(l4);

        t4 = new JTextField();
        t4.setFont(new Font("Arial",Font.BOLD,25));
        t4.setBounds(625, 320, 150, 40);
        add(t4);

        l5 = new JLabel("Country");
        l5.setFont(new Font("Arial",Font.PLAIN,25));
        l5.setForeground(Color.decode("#ff9933"));
        l5.setBounds(525, 370, 150, 40);
        add(l5);

        t5 = new JTextField();
        t5.setFont(new Font("Arial",Font.BOLD,25));
        t5.setBounds(625, 370, 150, 40);
        add(t5);

        l6 = new JLabel("NID/Passport Number");
        l6.setFont(new Font("Arial",Font.PLAIN,25));
        l6.setForeground(Color.decode("#ff9933"));
        l6.setBounds(365, 420, 250, 40);
        add(l6);

        t6 = new JTextField();
        t6.setFont(new Font("Arial",Font.BOLD,25));
        t6.setBounds(625, 420, 150, 40);
        add(t6);

        l7 = new JLabel("B-Kash Number");
        l7.setFont(new Font("Arial",Font.PLAIN,25));
        l7.setForeground(Color.decode("#ff9933"));
        l7.setBounds(430, 470, 210, 40);
        add(l7);

        t7 = new JTextField();
        t7.setFont(new Font("Arial",Font.BOLD,25));
        t7.setBounds(625, 470, 150, 40);
        add(t7);

        l8 = new JLabel("B-Kash Password");
        l8.setFont(new Font("Arial",Font.PLAIN,25));
        l8.setForeground(Color.decode("#ff9933"));
        l8.setBounds(410, 520, 210, 40);
        add(l8);

        t8 = new JTextField();
        t8.setFont(new Font("Arial",Font.BOLD,25));
        t8.setBounds(625, 520, 150, 40);
        add(t8);

        b1 = new JButton("Proceed");
        b1.setFont(new Font("Arial",Font.BOLD,25));
        b1.setForeground(Color.decode("#1e7b1e"));
        b1.setBackground(Color.decode("#d6f5d6"));
        b1.setBounds(650, 620, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("Arial",Font.BOLD,25));
        b2.setForeground(Color.decode("#ff1a1a"));
        b2.setBackground(Color.decode("#ff8080"));
        b2.setBounds(450, 620, 150, 40);
        b2.addActionListener(this);
        add(b2);

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
            SignUpSuccessful signUpSuccessful = new SignUpSuccessful();
            this.setVisible(false);
            signUpSuccessful.setVisible(true);
        }
        else if(ae.getSource() == b2)
        {
            MainMenu mainMenu = new MainMenu();
            this.setVisible(false);
            mainMenu.setVisible(true);
        }
    }
}
