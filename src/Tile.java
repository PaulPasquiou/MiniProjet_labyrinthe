/**
 * it represents tiles, it's featured by a rotation, inherit the shape and the
 * treasure from Face
 * This tiles can not change their rotation.
 * 
 * @author pasquiop
 */
public class Tile
{
	/**
	 * tile's rotation
	 */
	protected Rotation rotation;

	// TODO write comment(done)
	/**
	 * the shape and the item of the tile
	 */
	protected Face tile;

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
	//transformer Tile en classe servant uniquement pour les tuiles fixe
	//créer une sous classe de tuile qui servira pour les tuiles pouvant bouger
	//et donc ayant une rotation pouvant changer
	
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