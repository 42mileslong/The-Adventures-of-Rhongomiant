import javax.swing.*;
import java.awt.*;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class Display extends JComponent {
    /**
     * The display
     */
    public static Display display = new Display();

    /**
     * The width of the game
     */
    public int gameWidth = 960;

    /**
     * The height of the game
     */
    public int gameHeight = 640;

    /**
     * Makes a Display with the default width and height
     */
    public Display() {
        init();
    }

    /**
     * Makes a Display with the given width and height
     *
     * @param width the width of the game
     * @param height the height of the game
     */
    public Display(int width, int height) {
        gameWidth = width;
        gameHeight = height;

        init();
    }

    /**
     * Initializes the display
     */
    public void init() {
        setSize(gameWidth, gameHeight);
    }

    /**
     * Paints the board
     */
    public void paintComponent() {

    }

    /**
     * Paints the grid
     * @param g Graphics argument
     */
    public void drawGrid(Graphics g) {
        for (int x = 0; x < 120; x++) {
            for (int y = 0; y < 80; y++) {

            }
        }
    }
}
