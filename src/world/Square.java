package world;

import java.awt.*;

/**
 * Enum for the types of blocks
 */
enum Type {AIR, DIRT, WOOD, STONE, GLASS}

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class Square {
    /**
     * Sets the type of the square
     */
    public Type type;

    /**
     * The integer related to the type
     */
    public int typeNumber;

    /**
     * The different colors for the various types of blocks
     */
    Color[][] typeColors = {
        {new Color(0xB9E4EB), new Color(0xC1E3E8), new Color(0xC1E3E8)},
        {new Color(0x96563B), new Color(0x7A4B37), new Color(0x7A868C)},
        {},
        {},
        {}
    };

    /**
     * Holds the colors for the various pixels
     */
    public Color colors[][] = new Color[8][8];

    /**
     * Sets the colors for the pixels
     * @param type the type of block
     */
    public Square(Type type) {
        this.type = type;
        this.setTypeNumber();
        this.setColors();
    }

    public void setTypeNumber() {
        if (type == Type.AIR) typeNumber = 0;
        if (type == Type.DIRT) typeNumber = 1;
        if (type == Type.WOOD) typeNumber = 2;
        if (type == Type.STONE) typeNumber = 3;
        if (type == Type.GLASS) typeNumber = 4;
    }

    /**
     * Randomly sets the colors for the various pixels
     */
    public void setColors() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                double randomNumber = Math.random();

                if (y > 0 && colors[x][y-1] == typeColors[typeNumber][1] && randomNumber > 0.5){
                    randomNumber -= .1;
                }
                if (y < 7 && colors[x][y+1] == typeColors[typeNumber][1] && randomNumber > 0.5){
                    randomNumber -= .1;
                }
                if (x > 0 && colors[x-1][y] == typeColors[typeNumber][1] && randomNumber > 0.5){
                    randomNumber -= .1;
                }
                if (x < 7 && colors[x+1][y] == typeColors[typeNumber][1] && randomNumber > 0.5){
                    randomNumber -= .1;
                }

                if (randomNumber > 0.5) {
                    colors[x][y] = typeColors[typeNumber][0];
                } else if (randomNumber < 0.45) {
                    colors[x][y] = typeColors[typeNumber][1];
                } else {
                    colors[x][y] = typeColors[typeNumber][2];
                }
            }
        }
    }
}
