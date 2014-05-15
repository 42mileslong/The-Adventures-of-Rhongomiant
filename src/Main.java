import world.World;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class Main {
    /**
     * The world
     */
    public static World world;

    /**
     * Initializes everything
     */
    public static void main(String args[]) {
        world = new World();
        consolePrint("Making frame");
        initDisplay();
        Display.display.repaint();
    }

    /**
     * Makes the frame and adds the display to the frame
     */
    public static void initDisplay() {
        //makes the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Display.display.gameWidth, Display.display.gameHeight);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //adds display to the frame
        frame.add(Display.display);
    }

    /**
     * Specialized console print messages with timestamps
     * @param message the message to be printed
     */
    public static void consolePrint(String message) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String formattedDate = sdf.format(date);
        System.out.println("[System @ " + formattedDate +"] " + message);
    }
}
