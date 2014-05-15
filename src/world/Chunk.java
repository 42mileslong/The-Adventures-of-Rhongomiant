package world;

import java.awt.*;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class Chunk {
    /**
     * An array of types of blocks
     * Calculations run on this
     */
    public Square[][] chunk = new Square[60][40];

    /**
     * Constructor for Chunk, sets the ground
     * @param ground the ground level
     */
    public Chunk(int ground) {
        //sets the ground level
        for (int y = 0; y >= 60; y++) {
            for (int x = 0; x < 40; x++) {
                if (y < ground) {
                    chunk[x][y] = new Square(Type.DIRT);
                } else {
                    chunk[x][y] = new Square(Type.AIR);
                }
            }
        }
    }

    /**
     * Sets the blocks in a given area
     * @param one the first point
     * @param two the second point
     * @param type the type of block for the area to be filled in
     */
    public void setBlock(Point one, Point two, Type type) {
        for (int x = (int) one.getX(); x < two.getX(); x++) {
            for (int y = (int) one.getY(); y < two.getY(); y++) {
                chunk[x][y].type = type;
            }
        }
    }
}
