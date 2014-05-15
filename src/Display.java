import world.Chunk;
import world.Square;

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
        for (int x = 0; x < 30; x++) {
            for (int y = 0; y < 20; y++) {
                for (int r = 0; r < 8; r++) {
                    for (int c = 0; c < 8; c++) {
                        Chunk chunk = Main.world.chunks[0];
                        Square square = chunk.chunk[x][y];
                        Color color = square.colors[r][c];
                        g.setColor(color);
                        g.fillRect(32 * x + 4 * r, gameHeight - (32 * y + 4 * c), 4, 4);
                    }
                }
            }
        }
    }
}
