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

    /**
     * tile's shape
     */
    private Shape shape;

    /**
     * Treasure on the tile (<tt>null</tt> means no treasure)
     */
    private Treasure item;

 
    /**
     * tile's rotation
     */
    private Rotation rotation;
    
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
