package world;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class Chunk {
    public int[][] chunk = new int[16][32];

    public Chunk() {

    }

    public Chunk(int[][] grid) {
        chunk = grid;
    }

}
