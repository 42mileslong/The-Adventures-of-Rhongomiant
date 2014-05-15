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
    public void paint(Graphics g) {
        super.paint(g);
        drawBackground(g);
    }

    /**
     * Paints the grid
     * @param g Graphics argument
     */
    public void drawBackground(Graphics g) {
        for (int x = 0; x < 60; x++) {
            for (int y = 0; y < 40; y++) {
                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        g.setColor(Main.world.chunks[0].chunk[x][y].colors[r][c]);
                        g.fillRect(2 * x, 2 * (y + 1), 2, 2);
                    }
                }
            }
        }
    }
}
