package world;

/**
 * See README.md for documentation
 * @author Rafi Long
 */
public class World {
    /**
     * The world loaded in chunks
     */
    public Chunk[] chunks = new Chunk[10];

    /**
     * World constructor
     */
    public World() {
        setChunk();
    }

    /**
     * Sets the chunks of the world
     */
    private void setChunk() {
        for (int x = 0; x < chunks.length; x++) {
            chunks[x] = new Chunk(3);
        }
    }
}
