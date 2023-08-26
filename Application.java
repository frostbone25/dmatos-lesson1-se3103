import javax.swing.JFrame;

public class Application 
{
    public static void main(String[] args)
    {
        //Create an instance of our Application Window class
        ApplicationWindow applicationWindow = new ApplicationWindow();

        //Terminate the program when the user "closes" the program
        applicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Initalize the Application Window (which creates the UI)
        applicationWindow.initalize();

        //Resizes the window according to the components within it
        applicationWindow.pack();

        //Sets the window to be visible
        applicationWindow.setVisible(true);
    }
}