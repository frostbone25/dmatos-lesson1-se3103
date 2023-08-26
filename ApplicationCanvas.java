import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ApplicationCanvas extends JPanel
{
    //The "lucky number" that is displayed.
    public int randomNumber;

    //Constructor
    public ApplicationCanvas()
    {
        Dimension dimensions = new Dimension(300, 250);

        setPreferredSize(dimensions);
    }

    //"Update UI" Method
    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);

        Font font = new Font("Courier New", Font.BOLD, 24);
        graphics.setFont(font);

        graphics.setColor(Color.red);
        graphics.drawString("Lucky Number Is:", 30, 100);
        graphics.drawString("" + randomNumber, 30, 140);
    }
}
