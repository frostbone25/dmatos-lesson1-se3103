import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AppWindow extends JFrame 
{
    public void init()
    {
        setTitle("My First Java Window!");

        var contentPane = getContentPane();

        var canvas = new AppCanvas();

        contentPane.add(canvas, BorderLayout.CENTER);
    }
}