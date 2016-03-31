/**
 * it represents tiles, 
 * it's featured by a shape, 
 * and an item,
 * they won't change once they are created
 * @author pasquiop
 * 
 */
public class FinalTile
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
     * create a new Tile with features passed in arguments
     * 
     * @param shape0
     *            the shape of the tile
     * @param item0
     *            the item of the tile
     */
    protected FinalTile(Shape shape0, Treasure item0)
    {
        this.shape = shape0;
        this.item = item0;
    }
    

	/**
	 * Give the shape of a tile
	 * @return the shape of the tile
	 */
	public Shape getShape()
	{
		return this.shape;
	}

	/**
	 * Give the item of a tile
	 * @return the item of the tile
	 */
	public Treasure getItem()
	{
		return this.item;
	}
}
