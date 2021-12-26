import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpeningPanel extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JButton b1;
    Container c1;

    OpeningPanel()
    {
        super("Opening Panel");
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

        l2 = new JLabel("by team");
        l2.setFont(new Font("Arial",Font.PLAIN,15));
        l2.setForeground(Color.decode("#ffff33"));
        l2.setBounds(615, 120, 100, 30);
        add(l2);

        l3 = new JLabel("Newb Coders");
        l3.setFont(new Font("Arial",Font.BOLD,25));
        l3.setForeground(Color.decode("#ffff33"));
        l3.setBounds(560, 160, 200, 30);
        add(l3);

        l4 = new JLabel("Game-O-Holic is the very first international online based game purchasing application developed in Bangladesh");
        l4.setFont(new Font("Arial",Font.PLAIN,20));
        l4.setForeground(Color.decode("#cc6600"));
        l4.setBounds(150, 300, 1000, 50);
        add(l4);

        l5 = new JLabel("It was created in the year 2020 and every year we are trying to develop it as per users recommendations");
        l5.setFont(new Font("Arial",Font.PLAIN,20));
        l5.setForeground(Color.decode("#cc6600"));
        l5.setBounds(180, 330, 970, 50);
        add(l5);

        l6 = new JLabel("Our main goal is to make the purchase method friendly for Deshi gamers");
        l6.setFont(new Font("Arial",Font.PLAIN,20));
        l6.setForeground(Color.decode("#cc6600"));
        l6.setBounds(310, 360, 850, 50);
        add(l6);

        l7 = new JLabel("Also  we want to inspire people to prevent software piracy by giving exciting offers every week!");
        l7.setFont(new Font("Arial",Font.PLAIN,20));
        l7.setForeground(Color.decode("#cc6600"));
        l7.setBounds(235, 390, 950, 50);
        add(l7);

        l8 = new JLabel("Happy Gaming :)");
        l8.setFont(new Font("Arial",Font.PLAIN,20));
        l8.setForeground(Color.decode("#cc6600"));
        l8.setBounds(570, 420, 150, 50);
        add(l8);

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
            DevelopersPanel developersPanel = new DevelopersPanel();
            this.setVisible(false);
            developersPanel.setVisible(true);
        }
    }
}
