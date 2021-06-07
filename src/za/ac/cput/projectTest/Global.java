package za.ac.cput.projectTest;

import javax.swing.*;
import java.awt.*;

public class Global
{
    public static int contactCount = 0;
    public static int contactEdit = 0;
    public static JFrame frame = new JFrame();
    boolean loggedIn = false;
    public static String[][] contactList = new String[5][2];
    public static String[][] emergencyServices = new String[4][2];

    public static void frameDefault()
    {
        Color lightBlue = new Color(138,220,247);
        frame.setTitle("Safe App");
        frame.getContentPane().setBackground(lightBlue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void clearFrame()
    {
        frame.getContentPane().removeAll();
        frame.repaint();
    }

    String userFirstName, userLastName, userNumber;
}
