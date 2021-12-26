import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevelopersPanel extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4, l5;
    JButton b1;
    Container c1;

    DevelopersPanel()
    {
        super("Developers Panel");
        setSize(1280,720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon logo = new ImageIcon("Logo.png");
        this.setIconImage(logo.getImage());

        c1 = this.getContentPane(); //BG Color
        c1.setLayout(null);
        c1.setBackground(Color.BLACK); //BG Color

        l1 = new JLabel("Game-O-Holic");
        l1.setFont(new Font("Arial",Font.ITALIC,30));
        l1.setForeground(Color.decode("#ffff33"));
        l1.setBounds(540, 50, 200, 50);
        add(l1);

        l2 = new JLabel("Developers Panel");
        l2.setFont(new Font("Arial",Font.ROMAN_BASELINE,23));
        l2.setForeground(Color.decode("#c68c53"));
        l2.setBounds(550, 150, 200, 50);
        add(l2);

        JLabel background1, background2, background3;                                  //edit
        setSize(1280,720);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img1 = new ImageIcon("Saptanil.jpg");

        background1 = new JLabel("", img1, JLabel.CENTER);
        background1.setBounds(90, 360, 200, 200);
        add(background1);                                      //edit

        l3 = new JLabel("Saptanil Ghose");
        l3.setFont(new Font("Arial",Font.BOLD,20));
        l3.setForeground(Color.decode("#ffff33"));
        l3.setBounds(120, 570, 150, 35);
        add(l3);

        setSize(1280,720);                        //edit
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img2 = new ImageIcon("Sany.jpg");

        background2 = new JLabel("", img2, JLabel.CENTER);
        background2.setBounds(525, 240, 200, 200);
        add(background2);                                      //edit

        l4 = new JLabel("Tanzim Zaman");
        l4.setFont(new Font("Arial",Font.BOLD,20));
        l4.setForeground(Color.decode("#ffff33"));
        l4.setBounds(550, 450, 150, 35);
        add(l4);

        setSize(1280,720);                         //edit
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img3 = new ImageIcon("Dania.jpg");

        background3 = new JLabel("", img3, JLabel.CENTER);
        background3.setBounds(915, 360, 200, 200);
        add(background3);                                      //edit

        l5 = new JLabel("Dania Nahar");
        l5.setFont(new Font("Arial",Font.BOLD,20));
        l5.setForeground(Color.decode("#ffff33"));
        l5.setBounds(960, 570, 150, 35);
        add(l5);

        b1 = new JButton("Proceed");
        b1.setFont(new Font("Arial",Font.BOLD,25));
        b1.setForeground(Color.decode("#1e7b1e"));
        b1.setBackground(Color.decode("#d6f5d6"));
        b1.setBounds(565, 620, 150, 40);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            MainMenu mainMenu = new MainMenu();
            this.setVisible(false);
            mainMenu.setVisible(true);
        }
    }
}
