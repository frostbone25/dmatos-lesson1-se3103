import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppWindow extends JFrame 
{
    public void init()
    {
        setTitle("My First Java Window!");

        var contentPane = getContentPane();

        var canvas = new AppCanvas();

        contentPane.add(canvas, BorderLayout.CENTER);

        JButton button = new JButton("Lucky Number");
        contentPane.add(button, BorderLayout.SOUTH);

        button.addActionListener(e -> {
            var random = new Random();
            int randomInt = random.nextInt(101); //101 BECAUSE STARTS FRP, 1
            canvas.randomNumber = randomInt;
            canvas.repaint();
        });
    }
}