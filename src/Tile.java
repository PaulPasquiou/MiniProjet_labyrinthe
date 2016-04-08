/**
 * it represents tiles, it's featured by a rotation, inherit the shape and the
 * treasure from FinalTile
 * 
 * @author pasquiop
 */
public class Tile
{
	/**
	 * tile's rotation
	 */
	private Rotation rotation;

	// TODO write comment(done)
	/**
	 * the shape and the item of the tile
	 */
	private Face tile;

	/**
	 * create a new Tile with features passed in arguments
	 * @param tile0 
	 * 		The shape and the item of the tile to create, from an enumeration
	 * @param rotation0 
	 * 		The orientation of the tile (in degrees)
	 */
	public Tile(Face tile0, Rotation rotation0)
	{
		this.tile = tile0;
		this.rotation = rotation0;
	}

	public String toString()
	{
		return "(" + this.tile.getShape() + "," + this.tile.getItem() + "," + this.rotation + ")";
	}

	/**
	 * Get the rotation
	 * @return the orientation of the tile
	 */
	public Rotation getRotation()
	{
		return this.rotation;
	}
}