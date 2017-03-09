package carpark;

import java.util.concurrent.TimeUnit;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainScreen extends JFrame implements ActionListener{
    
    private carPark park;
    private GridBagConstraints constraints;
    
    private JLabel lblRegNo;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblStatus;
    
    private JTextField txtRegNo;
    private JTextField txtColour;
    private JTextField txtMake;
    private JTextField txtModel;
    
    private JButton btnAdd;
    private JButton btnRemove;
    
    public MainScreen()
    {
        park = new carPark();
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        constraints = new GridBagConstraints();
        
        //set up components
        initComponents();
        
        //create layout
        layoutComponents();
    }
    
    public void initComponents()
    {
        lblRegNo = new JLabel("Reg no.");
        lblColour = new JLabel("Colour");
        lblMake = new JLabel("Make");
        lblModel = new JLabel("Model");
        lblStatus = new JLabel("Car park has " + park.spacesRemaining() + " empty spaces");
        
        txtRegNo = new JTextField();
        txtColour = new JTextField();
        txtMake = new JTextField();
        txtModel = new JTextField();
        
        btnAdd = new JButton("Add");
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove");
        btnRemove.addActionListener(this);
    }
    
    public void layoutComponents()
    {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblRegNo, constraints);
        
        constraints.gridy = 1;
        this.add(lblColour, constraints);
        
        constraints.gridy = 2;
        this.add(lblMake, constraints);
        
        constraints.gridy = 3;
        this.add(lblModel, constraints);
        
        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtRegNo, constraints);
        
        constraints.gridy = 1;
        this.add(txtColour, constraints);
        
        constraints.gridy = 2;
        this.add(txtMake, constraints);
        
        constraints.gridy = 3;
        this.add(txtModel, constraints);
        
        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblStatus, constraints);
        
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        this.add(btnAdd, constraints);
        
        constraints.gridy = 5;
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
        
        
    }
    
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource().equals(btnAdd))
        {
            String regNo = txtRegNo.getText();
            String colour = txtColour.getText();
            String make = txtMake.getText();
            String model = txtModel.getText();
            
            if(park.parkFull())
            {
                JOptionPane.showMessageDialog(null, "Car park is full");
            }
            else
            {
                park.addCar(regNo, colour, make, model);
                JOptionPane.showMessageDialog(null, "Car reg. " + regNo + " has been added");
            }
        }
        else if(ev.getSource().equals(btnRemove))
        {
            String regNo = txtRegNo.getText();
            
            if(!park.isInPark(regNo))
            {
                JOptionPane.showMessageDialog(null, "Car is not in the car park");
            }
            else
            {
                park.removeCar(regNo);
                JOptionPane.showMessageDialog(null, "Car reg. " + regNo + " has been removed");
            }
        }
        
        txtRegNo.setText("");
        txtColour.setText("");
        txtMake.setText("");
        txtModel.setText("");
        lblStatus.setText("Car park has " + park.spacesRemaining() + " empty spaces");
              
    }
}
