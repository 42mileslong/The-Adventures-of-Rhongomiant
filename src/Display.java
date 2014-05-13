import javax.swing.*;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class Display extends JComponent {
    public static Display display = new Display();

    public int screenWidth = 960;
    public int screenHeight = 640;

    public Display() {
        init();
    }

    public Display(int width, int height) {
        screenWidth = width;
        screenHeight = height;
    }

    public void init() {
        setSize(screenWidth, screenHeight);
    }

    public void paintComponent() {

    }
}
