// TODO clean comment (not really clear)
/**
 * it represents tiles, 
 * it's featured by a shape, 
 * a rotation
 * and an eventual item
 * 
 * @author pasquiop
 */
public class Tile
{

    // TODO fix comment (ask for advice)(done)
    /**
     * gives us the shape of the tile
     */
    private Shape shape;

    // TODO fix comment (ask for advice)(done)
    /**
     * gives us the id of items on the tile
     */
    private Treasure item;

    // TODO fix comment (ask for advice)(done)
    /**
     * gives us the orientation of the tile
     */
    private Rotation rotation;

    // TODO detail comment (how is the created tile) (done)
    /**
     * create a new Tile with features passed in arguments
     * 
     * @param shape0
     *            the shape of the tile
     * @param item0
     *            the item of the tile
     * @param rotation0
     *            the rotation of the tile
     */
    public Tile(Shape shape0, Treasure item0, Rotation rotation0)
    {
        this.shape = shape0;
        this.item = item0;
        this.rotation = rotation0;
    }

    public String toString()
    {
        return "(" + this.shape + "," + this.rotation + "," + this.item + ")";
    }
}
