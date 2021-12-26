import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminCOD extends JFrame implements ActionListener
{
    JButton b1, b2;
    JLabel l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    Container c1;
    JTextField t7, t8, t9, t10;

    AdminCOD()
    {
        super("Call Of Duty");
        setSize(1280,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon logo = new ImageIcon("Logo.png");
        this.setIconImage(logo.getImage());

        c1 = this.getContentPane(); //BG Color
        c1.setLayout(null);
        c1.setBackground(Color.BLACK); //BG Color

        l0 = new JLabel("Game-O-Holic");
        l0.setFont(new Font("Arial",Font.ITALIC,30));
        l0.setForeground(Color.decode("#ffff33"));
        l0.setBounds(540, 50, 200, 50);
        add(l0);

        JLabel background;                                  //edit
        setSize(1280,720);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("CODnew.jpg");

        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(100, 150, 350, 200);
        add(background);                                      //edit

        l1 = new JLabel("Call Of Duty");
        l1.setFont(new Font("Arial",Font.ITALIC,17));
        l1.setForeground(Color.decode("#c68c53"));
        l1.setBounds(100, 350, 150, 50);
        add(l1);

        l2 = new JLabel("Price: 1000bdt");
        l2.setFont(new Font("Arial",Font.ITALIC,17));
        l2.setForeground(Color.decode("#c68c53"));
        l2.setBounds(100, 380, 150, 50);
        add(l2);

        l3 = new JLabel("Reviews");
        l3.setFont(new Font("Arial",Font.BOLD,20));
        l3.setForeground(Color.decode("#c68c53"));
        l3.setBounds(500, 200, 150, 50);
        add(l3);

        l4 = new JLabel("Sany: Good Game");
        l4.setFont(new Font("Arial",Font.BOLD,17));
        l4.setForeground(Color.decode("#c68c53"));
        l4.setBounds(500, 230, 170, 50);
        add(l4);

        l5 = new JLabel("Dania: Nice Software");
        l5.setFont(new Font("Arial",Font.BOLD,17));
        l5.setForeground(Color.decode("#c68c53"));
        l5.setBounds(500, 250, 190, 50);
        add(l5);

        l6 = new JLabel("Saptanil: Bad Software");
        l6.setFont(new Font("Arial",Font.BOLD,17));
        l6.setForeground(Color.decode("#c68c53"));
        l6.setBounds(500, 270, 200, 50);
        add(l6);

        b1 = new JButton("Log-Out");
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setForeground(Color.decode("#00b3b3"));
        b1.setBackground(Color.decode("#99ffff"));
        b1.setBounds(1100, 60, 100, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Home");
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setForeground(Color.decode("#00b3b3"));
        b2.setBackground(Color.decode("#99ffff"));
        b2.setBounds(100, 60, 100, 40);
        b2.addActionListener(this);
        add(b2);

        l7 = new JLabel("Reply to Sany");
        l7.setFont(new Font("Arial",Font.BOLD,17));
        l7.setForeground(Color.decode("#c68c53"));
        l7.setBounds(300, 420, 150, 40);
        add(l7);

        t7 = new JTextField();
        t7.setFont(new Font("Arial",Font.BOLD,17));
        t7.setBounds(450, 420, 550, 30);
        add(t7);

        l8 = new JLabel("Reply to Dania");
        l8.setFont(new Font("Arial",Font.BOLD,17));
        l8.setForeground(Color.decode("#c68c53"));
        l8.setBounds(300, 470, 150, 40);
        add(l8);

        t8 = new JTextField();
        t8.setFont(new Font("Arial",Font.BOLD,17));
        t8.setBounds(450, 470, 550, 30);
        add(t8);

        l9 = new JLabel("Reply to Saptanil");
        l9.setFont(new Font("Arial",Font.BOLD,17));
        l9.setForeground(Color.decode("#c68c53"));
        l9.setBounds(300, 520, 150, 40);
        add(l9);

        t9 = new JTextField();
        t9.setFont(new Font("Arial",Font.BOLD,17));
        t9.setBounds(450, 520, 550, 30);
        add(t9);

        l10 = new JLabel("Comment Here");
        l10.setFont(new Font("Arial",Font.BOLD,17));
        l10.setForeground(Color.decode("#c68c53"));
        l10.setBounds(300, 570, 120, 40);
        add(l10);

        t10 = new JTextField();
        t10.setFont(new Font("Arial",Font.BOLD,17));
        t10.setBounds(450, 570, 550, 30);
        add(t10);
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
            UserHome userHome = new UserHome();
            this.setVisible(false);
            userHome.setVisible(true);
        }
    }
}
