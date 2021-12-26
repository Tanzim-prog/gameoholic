import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpSuccessful extends JFrame implements ActionListener
{
    JLabel l0, l1;
    JButton b1, b2;

    SignUpSuccessful()
    {
        super("Sign-Up Successful");
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

        l1 = new JLabel("Your Account is Registered");
        l1.setFont(new Font("Arial",Font.PLAIN,30));
        l1.setForeground(Color.decode("#ff9933"));
        l1.setBounds(460, 300, 400, 50);
        add(l1);

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
        if(ae.getSource() == b1)
        {
            MainMenu mainMenu = new MainMenu();
            this.setVisible(false);
            mainMenu.setVisible(true);
        }
        else if(ae.getSource() == b2)
        {
            System.exit(0);
        }
    }
}
