package world;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class Chunk {
    public Type[][] chunk = new Type[120][80];

    enum Type {AIR, DIRT, WOOD, STONE, GLASS}

    public Chunk(int ground) {
        //sets the ground level
        for (int y = 0; y >= 32; y++) {
            for (int x = 0; x < 32; x++) {
                if (y < ground) {
                    chunk[x][y] = Type.DIRT;
                } else {
                    chunk[x][y] = Type.AIR;
                }
            }
        }
    }

    public void setBlock(int x1, int y1, int x2, int y2, Type type) {
        for (int x = x1; x < x2; x++) {
            for (int y = y1; y < y2; y++) {
                chunk[x][y] = type;
            }
        }
    }
}
