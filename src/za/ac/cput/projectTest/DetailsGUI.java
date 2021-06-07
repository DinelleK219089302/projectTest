package za.ac.cput.projectTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import static za.ac.cput.projectTest.LoginGUI.frame;

public class DetailsGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JLabel lblHeading, lblName, lblNumber, lblNumberRetype;
    private JTextField txtName, txtNumber,txtNumberRetype;
    private JButton btnAddContact;
    private Font ftContent, ftHeading, ftButtons;


    public DetailsGUI()
    {
        super("Safe App");

        lblHeading = new JLabel("CONTACT");

        lblName = new JLabel("NAME", SwingConstants.RIGHT);
        lblNumber = new JLabel("NUMBER", SwingConstants.RIGHT);
        lblNumberRetype = new JLabel("RETYPE NUMBER", SwingConstants.RIGHT);

        txtName = new JTextField();
        txtNumber = new JTextField();
        txtNumberRetype = new JTextField();

        btnAddContact = new JButton("ADD CONTACT");

        ftHeading = new Font("Arial", Font.BOLD, 40);
        ftContent = new Font("Arial", Font.PLAIN, 17);
        ftButtons = new Font("Arial", Font.PLAIN, 19);
    }


    public void details(Container pane)
    {
        lblHeading.setFont(ftHeading);
        lblHeading.setForeground(Color.WHITE);

        lblName.setFont(ftContent);
        lblNumber.setFont(ftContent);
        lblNumberRetype.setFont(ftContent);

        lblName.setForeground(Color.white);
        lblNumber.setForeground(Color.white);
        lblNumberRetype.setForeground(Color.white);

        btnAddContact.setFont(ftButtons);

        btnAddContact.addActionListener(this);

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        pane.setBackground(Color.blue);

        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(40,50,40,50);
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
        c.insets = new Insets(10,10,10,10);

        c.gridy = 1;
        pane.add(lblName, c);

        c.gridy = 2;
        pane.add(txtName, c);

        c.gridy = 3;
        pane.add(lblNumber, c);

        c.gridy = 4;
        pane.add(txtNumber, c);

        c.gridy = 5;
        pane.add(lblNumberRetype, c);

        c.gridy = 6;
        pane.add(txtNumberRetype, c);

        c.insets = new Insets(50,10,20,10);
        //btnClear.setBackground(Color.WHITE);
        c.gridy = 7;
        pane.add(btnAddContact, c);
        set();
    }

    public void set()
    {
        switch (Global.contactCount)
        {
            case 0:
            {
                lblHeading.setText("contact #1");
            }
            break;
            case 1:
            {
                lblHeading.setText("contact #2");
            }
            break;
            case 2:
            {
                lblHeading.setText("contact #3");
            }
            break;
            case 3:
            {
                lblHeading.setText("contact #4");
            }
            break;
            case 4:
            {
                lblHeading.setText("contact #5");
            }
            break;
            default:
                break;
        }

        txtName.requestFocus();
    }

    public boolean validation()
    {
        boolean valid = true;
        boolean letterFound = false;
        int count;
        String name = txtName.getText();
        String number = txtNumber.getText();
        String numberRetype = txtNumberRetype.getText();
        char compare;

            for (count = 0; count < numberRetype.length(); count++)
            {
                compare = numberRetype.charAt(count);
                if (compare != ' ')
                {
                    letterFound = true;
                }
            }

            if ((numberRetype.equals("")) || (letterFound == false))
            {
                valid = false;
                txtNumberRetype.setText("");
                txtNumberRetype.requestFocus();
            }

            letterFound = false;

            for (count = 0; count < number.length(); count++)
            {
                compare = number.charAt(count);
                if (compare != ' ')
                {
                    letterFound = true;
                }
            }

            if ((number.equals("")) || (letterFound == false))
            {
                valid = false;
                txtNumber.setText("");
                txtNumber.requestFocus();
            }

            letterFound = false;

            for (count = 0; count < name.length(); count++)
            {
                compare = name.charAt(count);
                if (compare != ' ')
                {
                    letterFound = true;
                }
            }

            if ((name.equals("")) || (letterFound == false))
            {
                valid = false;
                txtName.setText("");
                txtName.requestFocus();
            }

            if (valid == true)
            {
                if (number.equals(numberRetype) == false)
                {
                    JOptionPane.showMessageDialog(null, "numbers don't match");
                    txtNumberRetype.setText("");
                    txtNumber.setText("");
                    txtNumber.requestFocus();
                    valid = false;
                }
                else
                {
                    for (int i = 0; i < Global.contactCount; i++)
                    {
                        if (number.equals(Global.contactList[i][1]))
                        {
                            JOptionPane.showMessageDialog(null, "number already added");
                            txtNumberRetype.setText("");
                            txtNumber.setText("");
                            txtNumber.requestFocus();
                            valid = false;
                        }
                    }
                }
            }

            return valid;
        }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch (e.getActionCommand())
        {
            case "ADD CONTACT":
            {
                if (validation() == true)
                {
                    Global.contactList[Global.contactCount][0] = txtName.getText();
                    Global.contactList[Global.contactCount][1] = txtNumber.getText();
                    Global.contactCount++;
                    Global.clearFrame();
                    ContactGUI contacts = new ContactGUI();
                    contacts.contactList(Global.frame.getContentPane());
                    Global.frameDefault();
                }
            }
            break;
            default:
                break;
        }
    }
}


