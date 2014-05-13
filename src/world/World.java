package world;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class World {
    /**
     * The world
     */
    public static World world = new World();

    /**
     * The world loaded in chunks
     */
    public Chunk[] chunks = new Chunk[10];

    /**
     * World constructor
     */
    public World() {

    }
}
