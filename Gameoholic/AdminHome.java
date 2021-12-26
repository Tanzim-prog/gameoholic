import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminHome extends JFrame implements ActionListener
{
    JLabel l0, l1, l2, l3, l4, l5;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

    AdminHome()
    {
        super("Admin Home");
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

        l1 = new JLabel("Welcome");
        l1.setFont(new Font("Arial",Font.ITALIC,15));
        l1.setForeground(Color.decode("#ffff33"));
        l1.setBounds(1100, 60, 100, 50);
        add(l1);

        b1 = new JButton("Log-Out");
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setForeground(Color.decode("#00b3b3"));
        b1.setBackground(Color.decode("#99ffff"));
        b1.setBounds(100, 60, 100, 40);
        b1.addActionListener(this);
        add(b1);

        l2 = new JLabel("ACTION Games");
        l2.setFont(new Font("Arial",Font.ITALIC,20));
        l2.setForeground(Color.decode("#000000"));
        l2.setBounds(100, 150, 170, 50);
        add(l2);

        b2 = new JButton("1.Call of Duty");
        b2.setFont(new Font("Arial",Font.BOLD,25));
        b2.setForeground(Color.decode("#0047b3"));
        b2.setBackground(Color.decode("#99c2ff"));
        b2.setBounds(100, 200, 200, 40);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("2.Battlefield");
        b3.setFont(new Font("Arial",Font.BOLD,25));
        b3.setForeground(Color.decode("#0047b3"));
        b3.setBackground(Color.decode("#99c2ff"));
        b3.setBounds(400, 200, 200, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("3.Medal of Honor");
        b4.setFont(new Font("Arial",Font.BOLD,25));
        b4.setForeground(Color.decode("#0047b3"));
        b4.setBackground(Color.decode("#99c2ff"));
        b4.setBounds(700, 200, 270, 40);
        b4.addActionListener(this);
        add(b4);

        l3 = new JLabel("ARCADE Games");
        l3.setFont(new Font("Arial",Font.ITALIC,20));
        l3.setForeground(Color.decode("#000000"));
        l3.setBounds(100, 290, 170, 50);
        add(l3);

        b5 = new JButton("4.Chess");
        b5.setFont(new Font("Arial",Font.BOLD,25));
        b5.setForeground(Color.decode("#0047b3"));
        b5.setBackground(Color.decode("#99c2ff"));
        b5.setBounds(100, 340, 150, 40);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("5.Riddles");
        b6.setFont(new Font("Arial",Font.BOLD,25));
        b6.setForeground(Color.decode("#0047b3"));
        b6.setBackground(Color.decode("#99c2ff"));
        b6.setBounds(400, 340, 150, 40);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("6.Scribbles");
        b7.setFont(new Font("Arial",Font.BOLD,25));
        b7.setForeground(Color.decode("#0047b3"));
        b7.setBackground(Color.decode("#99c2ff"));
        b7.setBounds(700, 340, 170, 40);
        b7.addActionListener(this);
        add(b7);

        l4 = new JLabel("KIDS Games");
        l4.setFont(new Font("Arial",Font.ITALIC,20));
        l4.setForeground(Color.decode("#000000"));
        l4.setBounds(100, 430, 170, 50);
        add(l4);

        b8 = new JButton("7.Snake Game");
        b8.setFont(new Font("Arial",Font.BOLD,25));
        b8.setForeground(Color.decode("#0047b3"));
        b8.setBackground(Color.decode("#99c2ff"));
        b8.setBounds(100, 480, 210, 40);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("8.PUBG");
        b9.setFont(new Font("Arial",Font.BOLD,25));
        b9.setForeground(Color.decode("#0047b3"));
        b9.setBackground(Color.decode("#99c2ff"));
        b9.setBounds(400, 480, 150, 40);
        b9.addActionListener(this);
        add(b9);

        b10 = new JButton("9.Roller Ball");
        b10.setFont(new Font("Arial",Font.BOLD,25));
        b10.setForeground(Color.decode("#0047b3"));
        b10.setBackground(Color.decode("#99c2ff"));
        b10.setBounds(700, 480, 210, 40);
        b10.addActionListener(this);
        add(b10);

        l5 = new JLabel("20% Discount on PUBG Ongoing");
        l5.setFont(new Font("Arial",Font.PLAIN,25));
        l5.setForeground(Color.decode("#cc3300"));
        l5.setBounds(450, 600, 400, 50);
        add(l5);

        JLabel background;                                  //edit
        setSize(1280,720);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("Battlefield.jpg");

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
            AdminCOD adminCOD = new AdminCOD();
            this.setVisible(false);
            adminCOD.setVisible(true);
        }
    }
}