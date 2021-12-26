import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyPanel extends JFrame implements ActionListener
{
    JLabel l0, l1, l2, l3;
    JButton b1, b2, b3;
    Container c1;

    BuyPanel()
    {
        super("Buy Panel");
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
        background.setBounds(460, 150, 350, 200);
        add(background);                                      //edit

        l1 = new JLabel("Call Of Duty");
        l1.setFont(new Font("Arial",Font.ITALIC,17));
        l1.setForeground(Color.decode("#c68c53"));
        l1.setBounds(600, 345, 150, 50);
        add(l1);

        l2 = new JLabel("Price: 1000bdt");
        l2.setFont(new Font("Arial",Font.ITALIC,17));
        l2.setForeground(Color.decode("#c68c53"));
        l2.setBounds(588, 365, 150, 50);
        add(l2);

        l3 = new JLabel("Choose Your Pay Method");
        l3.setFont(new Font("Arial",Font.ITALIC,30));
        l3.setForeground(Color.decode("#996633"));
        l3.setBounds(460, 460, 400, 50);
        add(l3);

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

        b3 = new JButton("Bkash");
        b3.setFont(new Font("Arial",Font.BOLD,15));
        b3.setForeground(Color.decode("#00b3b3"));
        b3.setBackground(Color.decode("#99ffff"));
        b3.setBounds(600, 530, 90, 40);
        b3.addActionListener(this);
        add(b3);
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
        else if(ae.getSource() == b3)
        {
            BillPanel billPanel = new BillPanel();
            this.setVisible(false);
            billPanel.setVisible(true);
        }
    }
}
