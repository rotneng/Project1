import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsCalculator extends JFrame {
    private JLabel problemLabel;
    private JLabel resultLabel;

    private JTextField inputField1;
    private JTextField inputField2;

    private JButton velocityButton;
    private JButton forceButton;
    
    public PhysicsCalculator() {
        setTitle("Physics Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        problemLabel = new JLabel("Select a problem:");
        resultLabel = new JLabel();

        inputField1 = new JTextField();
        inputField2 = new JTextField();


   
