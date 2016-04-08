/**
 * it represents tiles, it's featured by a rotation, inherit the shape and the
 * treasure from FinalTile
 * 
 * @author pasquiop
 */
public class Tile extends FinalTile
{
	/**
	 * tile's rotation
	 */
	private Rotation rotation;
	
	// TODO write comment
	private FinalTile tile;

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
    	new FinalTile
        
        this.rotation = rotation0;
    }

	public String toString()
	{
		return "(" + super.getShape() + "," + super.getItem() + "," + this.rotation + ")";
	}
}
