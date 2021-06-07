package za.ac.cput.projectTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import static za.ac.cput.projectTest.LoginGUI.frame;

public class MainMenuGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JLabel lblHeading;
    private JButton btnSOS, btnFakeCall, btnLiveLocation, btnEmergencyServices, btnSettings;
    private Font ftHeading, ftButtons;

    public MainMenuGUI()
    {
        super("Safe App");

        lblHeading = new JLabel("MAIN MENU");

        btnSOS = new JButton("SOS");
        btnFakeCall = new JButton("FAKE CALL");
        btnLiveLocation = new JButton("LIVE LOCATION");
        btnEmergencyServices = new JButton("EMERGENCY SERVICES");
        btnSettings = new JButton("SETTINGS");

        ftHeading = new Font("Arial", Font.BOLD, 40);
        ftButtons = new Font("Arial", Font.PLAIN, 19);
    }


    public void mainMenu(Container pane) {
        lblHeading.setFont(ftHeading);
        lblHeading.setForeground(Color.WHITE);

        btnSOS.setFont(ftButtons);
        btnFakeCall.setFont(ftButtons);
        btnLiveLocation.setFont(ftButtons);
        btnEmergencyServices.setFont(ftButtons);
        btnSettings.setFont(ftButtons);

        /*
        btnSOS.addActionListener(this);
        btnFakeCall.addActionListener(this);
        btnLiveLocation.addActionListener(this);
        btnEmergencyServices.addActionListener(this);
        btnSettings.addActionListener(this);
        */

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        pane.setBackground(Color.WHITE);

        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(40, 50, 40, 50);
        c.weightx = 0.1;
        c.weighty = 0.1;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;
        pane.add(lblHeading, c);

        c.ipadx = 150;
        c.ipady = 15;

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 10, 10);
        c.gridwidth = 1;

        c.gridy = 1;
        pane.add(btnSOS, c);

        c.gridy = 2;
        pane.add(btnFakeCall, c);

        c.gridy = 3;
        pane.add(btnLiveLocation, c);

        c.gridy = 4;
        pane.add(btnEmergencyServices, c);

        c.insets = new Insets(50, 10, 20, 10);
        //btnSave.setBackground(Color.WHITE);
        c.gridy = 5;
        pane.add(btnSettings, c);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch (e.getActionCommand())
        {
            case "SOS":
            {

            }
            break;
            case "Fake Call":
            {

            }
            break;
            case "Live Location":
            {

            }
            break;
            case "Emergency Services":
            {

            }
            break;
            case "Settings":
            {

            }
            break;
            default:
                break;
        }
    }
}


