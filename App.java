import javax.swing.JFrame;

public class App {
    public static void main(String[] args)
    {
        //create an instance of our Application Window class
        AppWindow window = new AppWindow();

        //terminate the program when the user "closes" the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //initalize the application window
        window.init();

        //set it to be visible
        window.setVisible(true);
    }
}