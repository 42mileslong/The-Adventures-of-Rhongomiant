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
        //makes a Display object
        Display d = new Display();

        //makes the frame
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(0, 0);
        f.setLocation(0, 0);
        f.setVisible(true);

        //adds d to the frame
        f.add(d);
    }

    public static void consolePrint(String message) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String formattedDate = sdf.format(date);
        System.out.println("[System @ " + formattedDate +"] " + message);
    }
}
