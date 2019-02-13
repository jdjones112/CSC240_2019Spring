package Chapter9;

import javax.swing.*;   // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface


public class SimpleWindow extends JFrame
{
    private JLabel message;
    private JTextField kilometers;
    private JButton calcButton;
    private JPanel panel;

    public SimpleWindow()
    {
        final int WINDOW_WIDTH = 350;   // Window width in pixels
        final int WINDOW_HEIGHT = 250;  // Window height in pixels

        message = new JLabel(
                "Enter a distance in kilometers");
        kilometers = new JTextField(10);
        calcButton = new JButton("Calculate");
        panel = new JPanel();
        panel.add(message);
        panel.add(kilometers);
        panel.add(calcButton);

        setTitle("A Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Add an action listener to the button.
        calcButton.addActionListener(new CalcButtonListener());

        // Add the panel to the frame's content pane.
        add(panel);

        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window.
        setVisible(true);
    }

    private class CalcButtonListener implements ActionListener
    {
        /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
         */

        public void actionPerformed(ActionEvent e)
        {
            String input;  // To hold the user's input
            double miles;  // The number of miles

            // Get the text entered by the user into the
            // text field.
            input = kilometers.getText();

            // Convert the input to miles.
            miles = Double.parseDouble(input) * 0.6214;

            // Display the result.
            JOptionPane.showMessageDialog(null, input +
                    " kilometers is " + miles + " miles.");
        }
    }


}