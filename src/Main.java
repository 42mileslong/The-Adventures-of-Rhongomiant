import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * See README.md for documentation
 * @author 42mileslong
 */
public class Main {

    public static void main(String args[]) {
        consolePrint("Making frame");
        initDisplay();
    }

    public static void initDisplay() {
        //makes the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Display.display.screenWidth, Display.display.screenHeight);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //adds display to the frame
        frame.add(Display.display);
    }

    public static void consolePrint(String message) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String formattedDate = sdf.format(date);
        System.out.println("[System @ " + formattedDate +"] " + message);
    }
}
