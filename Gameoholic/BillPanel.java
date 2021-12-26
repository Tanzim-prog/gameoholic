import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillPanel extends JFrame implements ActionListener
{
    JLabel l0, l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JButton b1, b2, b3, b4;
    Container c1;
    JPasswordField t9;

    BillPanel()
    {
        super("Bill Panel");
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

        l1 = new JLabel("BILL");
        l1.setFont(new Font("Arial",Font.PLAIN,30));
        l1.setForeground(Color.decode("#c68c53"));
        l1.setBounds(612, 150, 200, 50);
        add(l1);

        l2 = new JLabel("Name: Call Of Duty");
        l2.setFont(new Font("Arial",Font.PLAIN,20));
        l2.setForeground(Color.decode("#c68c53"));
        l2.setBounds(565, 200, 200, 50);
        add(l2);

        l3 = new JLabel("Type: Action");
        l3.setFont(new Font("Arial",Font.PLAIN,20));
        l3.setForeground(Color.decode("#c68c53"));
        l3.setBounds(597, 230, 200, 50);
        add(l3);

        l4 = new JLabel("ID: 10010");
        l4.setFont(new Font("Arial",Font.PLAIN,20));
        l4.setForeground(Color.decode("#c68c53"));
        l4.setBounds(605, 260, 200, 50);
        add(l4);

        l5 = new JLabel("Price: 1000BDT");
        l5.setFont(new Font("Arial",Font.PLAIN,20));
        l5.setForeground(Color.decode("#c68c53"));
        l5.setBounds(585, 290, 200, 50);
        add(l5);

        l6 = new JLabel("VAT: 150BDT");
        l6.setFont(new Font("Arial",Font.PLAIN,20));
        l6.setForeground(Color.decode("#c68c53"));
        l6.setBounds(595, 320, 200, 50);
        add(l6);

        l7 = new JLabel("Total: 1150BDT");
        l7.setFont(new Font("Arial",Font.PLAIN,20));
        l7.setForeground(Color.decode("#c68c53"));
        l7.setBounds(585, 350, 200, 50);
        add(l7);

        l8 = new JLabel("Pay Method: B-Kash");
        l8.setFont(new Font("Arial",Font.PLAIN,20));
        l8.setForeground(Color.decode("#c68c53"));
        l8.setBounds(565, 380, 200, 50);
        add(l8);

        l9 = new JLabel("B-Kash Password");
        l9.setFont(new Font("Arial",Font.PLAIN,20));
        l9.setForeground(Color.decode("#c68c53"));
        l9.setBounds(500, 450, 200, 50);
        add(l9);

        t9 = new JPasswordField();
        t9.setFont(new Font("Arial",Font.BOLD,25));
        t9.setBounds(685, 455, 120, 40);
        add(t9);

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

        b3 = new JButton("Proceed");
        b3.setFont(new Font("Arial",Font.BOLD,25));
        b3.setForeground(Color.decode("#1e7b1e"));
        b3.setBackground(Color.decode("#d6f5d6"));
        b3.setBounds(650, 620, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("Exit");
        b4.setFont(new Font("Arial",Font.BOLD,25));
        b4.setForeground(Color.decode("#ff1a1a"));
        b4.setBackground(Color.decode("#ff8080"));
        b4.setBounds(450, 620, 150, 40);
        b4.addActionListener(this);
        add(b4);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s1 = t9.getText();

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
        else if(ae.getSource() == b3)
        {
            PurchasePanel purchasePanel = new PurchasePanel();
            this.setVisible(false);
            purchasePanel.setVisible(true);
        }
        else if(ae.getSource() == b4)
        {
            System.exit(0);
        }
    }

}
