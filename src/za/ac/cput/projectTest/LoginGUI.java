

package za.ac.cput.projectTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    //public static JFrame frame = new JFrame();
    private JLabel lblIcon, lblFirstName, lblLastName, lblNumber1, lblNumber2;
    private JTextField txtFirstName, txtLastName, txtNumber1, txtNumber2;
    private JButton btnLogin;
    private Font ftButtons, ftContent;

    public LoginGUI()
    {
        super("SafeApp");

        //lblIcon = new JLabel(new ImageIcon("popcorn.png"));

        lblFirstName = new JLabel("First name:");
        lblLastName = new JLabel("Last name:");
        lblNumber1 = new JLabel("Phone number:");
        lblNumber2 = new JLabel("Retype phone number:");

        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtNumber1 = new JTextField();
        txtNumber2 = new JTextField();

        btnLogin = new JButton("LOGIN");

        ftContent = new Font("Arial", Font.PLAIN, 13);
        ftButtons = new Font("Arial", Font.PLAIN, 19);
    }

    public void login(Container pane)
    {
        Global.clearFrame();
        Color lightBlue = new Color(138,220,247);

        lblFirstName.setFont(ftContent);
        lblLastName.setFont(ftContent);
        lblNumber1.setFont(ftContent);
        lblNumber2.setFont(ftContent);

        txtFirstName.setFont(ftContent);
        txtLastName.setFont(ftContent);
        txtNumber1.setFont(ftContent);
        txtNumber2.setFont(ftContent);

        btnLogin.setFont(ftButtons);
        btnLogin.setBackground(Color.WHITE);

        btnLogin.addActionListener(this);

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        pane.setBackground(Color.WHITE);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 1;
        c.ipady = 20;
        c.ipadx = 100;
        c.insets = new Insets(50,50,10,50);
        c.gridx = 1;
        c.gridy = 0;
        pane.add(lblFirstName, c);

        c.insets = new Insets(10,50,10,50);
        c.gridy++;
        pane.add(txtFirstName, c);

        c.gridy++;
        pane.add(lblLastName, c);

        c.gridy++;
        pane.add(txtLastName, c);

        c.gridy++;
        pane.add(lblNumber1, c);

        c.gridy++;
        pane.add(txtNumber1, c);

        c.gridy++;
        pane.add(lblNumber2, c);

        c.gridy++;
        pane.add(txtNumber2, c);

        c.insets = new Insets(100,50,10,50);
        c.gridy++;
        pane.add(btnLogin, c);
        Global.frameDefault();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Global.clearFrame();
        switch (e.getActionCommand())
        {
            case "LOGIN":
            {
                ContactGUI contacts = new ContactGUI();
                contacts.contactList(Global.frame.getContentPane());
            }
            break;
        }

        Global.frameDefault();
    }

    public static void main(String[] args)
    {
        new LoginGUI().login(Global.frame.getContentPane());
    }
}
