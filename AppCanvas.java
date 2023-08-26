import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class AppCanvas extends JPanel
{
    int randomNumber = 0;

    public AppCanvas()
    {
        setPreferredSize(new Dimension(300, 250));
    }

    @Override
    public void paintComponent(Graphics graphics)
    {
        graphics.drawString("Lucky Number Is:", 30, 100);
        graphics.drawString("" + randomNumber, 30, 140);
    }
}
