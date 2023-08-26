import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ApplicationWindow extends JFrame 
{
    public void initalize()
    {
        //sets the window title.
        setTitle("Lucky Number Generator");

        //create our UI elements
        Container contentPane = getContentPane();
        ApplicationCanvas applicationCanvas = new ApplicationCanvas();
        JButton luckyNumberButton = new JButton("Lucky Number");

        //add our UI elements to the window
        contentPane.add(applicationCanvas, BorderLayout.CENTER);
        contentPane.add(luckyNumberButton, BorderLayout.SOUTH);

        //add button logic
        luckyNumberButton.addActionListener(e -> 
        {
            Random random = new Random();
            int randomInteger = random.nextInt(101);
            applicationCanvas.randomNumber = randomInteger;

            //after updating the values, we need to update the UI to show them
            applicationCanvas.repaint();
        });
    }
}