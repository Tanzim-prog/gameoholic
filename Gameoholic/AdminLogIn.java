import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogIn extends JFrame implements ActionListener
{
    JLabel l0, l1, l2, l3;
    JTextField t2;
    JPasswordField p3;
    JButton b1, b2;

    AdminLogIn()
    {
        super("Admin Log-In");
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

        l1 = new JLabel("Welcome Chief");
        l1.setFont(new Font("Arial",Font.PLAIN,30));
        l1.setForeground(Color.decode("#ff9933"));
        l1.setBounds(540, 200, 250, 50);
        add(l1);

        l2 = new JLabel("ID");
        l2.setFont(new Font("Arial",Font.PLAIN,25));
        l2.setForeground(Color.decode("#ff9933"));
        l2.setBounds(590, 320, 210, 40);
        add(l2);

        t2 = new JTextField();
        t2.setFont(new Font("Arial",Font.BOLD,25));
        t2.setBounds(625, 320, 150, 40);
        add(t2);

        l3 = new JLabel("Password");
        l3.setFont(new Font("Arial",Font.PLAIN,25));
        l3.setForeground(Color.decode("#ff9933"));
        l3.setBounds(505, 370, 210, 40);
        add(l3);

        p3 = new JPasswordField();
        p3.setFont(new Font("Arial",Font.BOLD,25));
        p3.setBounds(625, 370, 150, 40);
        add(p3);

        b1 = new JButton("Proceed");
        b1.setFont(new Font("Arial",Font.BOLD,25));
        b1.setForeground(Color.decode("#1e7b1e"));
        b1.setBackground(Color.decode("#d6f5d6"));
        b1.setBounds(650, 620, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exit");
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
        String s1 = t2.getText();
        String s2 = p3.getText();

        if(s1.equals("19-41409-3") && s2.equals("12345") && ae.getSource() == b1)
        {
            AdminHome adminHome = new AdminHome();
            this.setVisible(false);
            adminHome.setVisible(true);
        }
        else if(ae.getSource() == b2)
        {
            System.exit(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid! Try Again");
        }
    }
}
