package za.ac.cput.projectTest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import static za.ac.cput.projectTest.Global.frame;

public class ContactGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JLabel lblHeading, lblContact1, lblContact2, lblContact3, lblContact4, lblContact5;
    private JButton btnSetup;
    private JButton btnAdd1, btnAdd2, btnAdd3, btnAdd4, btnAdd5;
    private JButton btnEdit1, btnEdit2, btnEdit3, btnEdit4, btnEdit5;
    private Font ftContent, ftHeading, ftButtons;


    public ContactGUI()
    {
        super("Safe App");

        lblHeading = new JLabel("ADD CONTACTS");

        lblContact1 = new JLabel("CONTACT 1", SwingConstants.RIGHT);
        lblContact2 = new JLabel("CONTACT 2", SwingConstants.RIGHT);
        lblContact3 = new JLabel("CONTACT 3", SwingConstants.RIGHT);
        lblContact4 = new JLabel("CONTACT 4", SwingConstants.RIGHT);
        lblContact5 = new JLabel("CONTACT 5", SwingConstants.RIGHT);

        btnAdd1 = new JButton("Add");
        btnAdd2 = new JButton("Add");
        btnAdd3 = new JButton("Add");
        btnAdd4 = new JButton("Add");
        btnAdd5 = new JButton("Add");

        btnEdit1 = new JButton("Edit 1");
        btnEdit2 = new JButton("Edit 2");
        btnEdit3 = new JButton("Edit 3");
        btnEdit4 = new JButton("Edit 4");
        btnEdit5 = new JButton("Edit 5");

        btnSetup = new JButton("Setup");

        ftHeading = new Font("Arial", Font.BOLD, 40);
        ftContent = new Font("Arial", Font.PLAIN, 17);
        ftButtons = new Font("Arial", Font.PLAIN, 19);
    }


    public void contactList(Container pane)
    {
        lblHeading.setFont(ftHeading);
        lblHeading.setForeground(Color.WHITE);

        lblContact1.setFont(ftContent);
        lblContact2.setFont(ftContent);
        lblContact3.setFont(ftContent);
        lblContact4.setFont(ftContent);
        lblContact5.setFont(ftContent);

        lblContact1.setBackground(Color.white);
        lblContact2.setBackground(Color.white);
        lblContact3.setBackground(Color.white);
        lblContact4.setBackground(Color.white);
        lblContact5.setBackground(Color.white);

        lblContact1.setForeground(Color.white);
        lblContact2.setForeground(Color.white);
        lblContact3.setForeground(Color.white);
        lblContact4.setForeground(Color.white);
        lblContact5.setForeground(Color.white);

        btnAdd1.setFont(ftButtons);
        btnAdd2.setFont(ftButtons);
        btnAdd3.setFont(ftButtons);
        btnAdd4.setFont(ftButtons);
        btnAdd5.setFont(ftButtons);
        btnEdit1.setFont(ftButtons);
        btnEdit2.setFont(ftButtons);
        btnEdit3.setFont(ftButtons);
        btnEdit4.setFont(ftButtons);

        btnSetup.addActionListener(this);

        btnAdd1.addActionListener(this);
        btnAdd2.addActionListener(this);
        btnAdd3.addActionListener(this);
        btnAdd4.addActionListener(this);
        btnAdd5.addActionListener(this);

        btnEdit1.addActionListener(this);
        btnEdit2.addActionListener(this);
        btnEdit3.addActionListener(this);
        btnEdit4.addActionListener(this);
        btnEdit5.addActionListener(this);

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
        c.gridwidth = 1;

        c.gridy = 1;
        pane.add(lblContact1, c);

        c.gridy = 2;
        pane.add(lblContact2, c);

        c.gridy = 3;
        pane.add(lblContact3, c);

        c.gridy = 4;
        pane.add(lblContact4, c);

        c.gridy = 5;
        pane.add(lblContact5, c);

        //c.insets = new Insets(50,10,20,10);
        //btnSave.setBackground(Color.WHITE);
        //c.gridy = 6;
        //pane.add(btnSetup, c);

        c.ipadx = 200;
        c.insets = new Insets(10,10,10,10);

        c.gridy = 1;
        c.gridx = 1;

        pane.add(btnAdd1, c);

        c.gridy = 2;
        pane.add(btnAdd2, c);

        c.gridy = 3;
        pane.add(btnAdd3, c);

        c.gridy = 4;
        pane.add(btnAdd4, c);

        c.gridy = 5;
        pane.add(btnAdd5, c);


        c.insets = new Insets(50,10,20,10);
        //btnClear.setBackground(Color.WHITE);
        c.gridy = 6;
        pane.add(btnSetup, c);

        c.ipadx = 150;
        c.insets = new Insets(10,10,10,10);

        c.gridx = 2;
        c.gridy = 1;

        pane.add(btnEdit1, c);

        c.gridy = 2;
        pane.add(btnEdit2, c);

        c.gridy = 3;
        pane.add(btnEdit3, c);

        c.gridy = 4;
        pane.add(btnEdit4, c);

        c.gridy = 5;
        pane.add(btnEdit5, c);


        set();
    }

    public void set()
    {
        if (Global.contactCount > 0)
            lblContact1.setText(Global.contactList[0][0]);
        if (Global.contactCount > 1)
            lblContact2.setText(Global.contactList[1][0]);
        if (Global.contactCount > 2)
            lblContact3.setText(Global.contactList[2][0]);
        if (Global.contactCount > 3)
            lblContact4.setText(Global.contactList[3][0]);
        if (Global.contactCount > 4)
            lblContact5.setText(Global.contactList[4][0]);

        if (Global.contactCount > 2)
        {
            btnSetup.setVisible(true);
        }
        else
        {
            btnSetup.setVisible(false);
        }

        btnAdd1.setVisible(false);
        btnAdd2.setVisible(false);
        btnAdd3.setVisible(false);
        btnAdd4.setVisible(false);
        btnAdd5.setVisible(false);

        btnEdit1.setVisible(true);
        btnEdit2.setVisible(true);
        btnEdit3.setVisible(true);
        btnEdit4.setVisible(true);
        btnEdit5.setVisible(true);

        switch (Global.contactCount)
        {
            case 0:
            {
                btnAdd1.setVisible(true);
                btnEdit1.setVisible(false);
                btnEdit2.setVisible(false);
                btnEdit3.setVisible(false);
                btnEdit4.setVisible(false);
                btnEdit5.setVisible(false);
            }
            break;
            case 1:
            {
                btnAdd1.setVisible(false);
                btnAdd2.setVisible(true);
                btnEdit2.setVisible(false);
                btnEdit3.setVisible(false);
                btnEdit4.setVisible(false);
                btnEdit5.setVisible(false);
            }
            break;
            case 2:
            {
                btnAdd2.setVisible(false);
                btnAdd3.setVisible(true);
                btnEdit3.setVisible(false);
                btnEdit4.setVisible(false);
                btnEdit5.setVisible(false);
            }
            break;
            case 3:
            {
                btnAdd3.setVisible(false);
                btnAdd4.setVisible(true);
                btnEdit4.setVisible(false);
                btnEdit5.setVisible(false);
            }
            break;
            case 4:
            {
                btnAdd4.setVisible(false);
                btnAdd5.setVisible(true);
                btnEdit5.setVisible(false);
            }
            break;
            case 5:
            {
                btnAdd5.setVisible(false);
            }
            break;
            default:
                break;
        }
    }
/*
    public boolean validation()
    {
        boolean valid = true;
        boolean letterFound = false;
        int count;
        String customerNumber = txtNumber.getText();
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String cell = txtCell.getText();
        char compare;

        lblNumberError.setVisible(false);
        lblFirstNameError.setVisible(false);
        lblLastNameError.setVisible(false);
        lblCellError.setVisible(false);

        for (count = 0; count < cell.length(); count++)
        {
            compare = cell.charAt(count);
            if (compare != ' ')
            {
                letterFound = true;
            }
        }

        if ((cell.equals("")) || (letterFound == false))
        {
            valid = false;
            lblCellError.setVisible(true);
            txtCell.setText("");
            txtCell.requestFocus();
        }

        letterFound = false;

        for (count = 0; count < lastName.length(); count++)
        {
            compare = lastName.charAt(count);
            if (compare != ' ')
            {
                letterFound = true;
            }
        }

        if ((lastName.equals("")) || (letterFound == false))
        {
            valid = false;
            lblLastNameError.setVisible(true);
            txtLastName.setText("");
            txtLastName.requestFocus();
        }

        letterFound = false;

        for (count = 0; count < firstName.length(); count++)
        {
            compare = firstName.charAt(count);
            if (compare != ' ')
            {
                letterFound = true;
            }
        }

        if ((firstName.equals("")) || (letterFound == false))
        {
            valid = false;
            lblFirstNameError.setVisible(true);
            txtFirstName.setText("");
            txtFirstName.requestFocus();
        }

        letterFound = false;

        for (count = 0; count < customerNumber.length(); count++)
        {
            compare = customerNumber.charAt(count);
            if (compare != ' ')
            {
                letterFound = true;
            }
        }

        if ((customerNumber.equals("")) || (letterFound == false))
        {
            valid = false;
            lblNumberError.setVisible(true);
            txtNumber.setText("");
            txtNumber.requestFocus();
        }

        return valid;
    }
*/
    public void editContact(Integer index)
    {
        Global.contactEdit = index;
        EditGUI editDetails = new EditGUI();
        editDetails.edit(Global.frame.getContentPane());
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Global.clearFrame();
        switch (e.getActionCommand())
        {
            case "Add":
            {
                DetailsGUI addDetails = new DetailsGUI();
                addDetails.details(Global.frame.getContentPane());
            }
            break;
            case "Edit 1":
            {
                editContact(0);
            }
            break;
            case "Edit 2":
            {
                editContact(1);
            }
            break;
            case "Edit 3":
            {
                editContact(2);
            }
            break;
            case "Edit 4":
            {
                editContact(3);
            }
            break;
            case "Edit 5":
            {
                editContact(4);
            }
            break;
            case "Setup":
            {
                MainMenuGUI main = new MainMenuGUI();
                main.mainMenu(Global.frame.getContentPane());
            }
            break;
            default:
                break;
        }
        Global.frameDefault();
    }
}


