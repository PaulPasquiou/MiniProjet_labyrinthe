import java.util.Random;

/**
 * it represents tiles, it's featured by a rotation, inherit Tile and give a random rotation
 * This tiles can rotate.
 * @author pasquiop
 *
 */
public class MovableTile extends Tile
{
	
	/**
	 * create a movable tile with a random rotation
	 * @param tile0
	 */
	public MovableTile(Face tile0)
	{
		super(tile0, Rotation.randomRotation());
	}

	/**
	 * rotate the tile
	 * @param rot
	 * 		the rotation wished
	 */
	public void rotate(Rotation rot)
	{
		this.rotation=rot;
	}

}
