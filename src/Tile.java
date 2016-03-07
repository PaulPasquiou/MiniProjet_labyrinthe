/**
 * it's tile of the board of the game
 * 50 tiles
 * 
 * @author pasquiop
 *
 */
public class Tile
{
	//TODO 
	/**
	 * 
	 */
	public static final int ROTATION_0=0;
	//TODO
	/**
	 * 
	 */
	public static final int ROTATION_90=1;
	//TODO
	/**
	 * 
	 */
	public static final int ROTATION_180=2;
	//TODO
	/**
	 * 
	 */
	public static final int ROTATION_270=3;
	// TODO write comment(done)
	/**
	 * constant which shows that the tile has a shape in T
	 */
	public static final int T_SHAPE = 0;

	// TODO write comment(done)
	/**
	 * constant which shows that the tile has a shape in L
	 */
	public static final int L_SHAPE = 1;

	// TODO write comment(done)
	/**
	 * constant which shows that the tile has a shape in I
	 */
	public static final int I_SHAPE = 2;

	// TODO write comment(done)
	/**
	 * attribute which gives us the shape of the tile
	 */
	private int shape;

	// TODO write comment(done)
	/**
	 * attribute which gives us the id of items on the tile
	 */
	private int item;

	// TODO write comment(done)
	/**
	 * attribute which gives us the orientation of the tile
	 */
	private int rotation;
	

	// TODO fix comment(done)
	/**
	 * create a new Tile
	 * 
	 * @param shape0
	 *            the shape of the tile
	 * @param item0
	 *            the item of the tile
	 * @param rotation0
	 *            the rotation of the tile
	 */
	public Tile(int shape0, int item0, int rotation0)
	{
		this.shape = shape0;
		this.item = item0;
		this.rotation = rotation0;
	}
}
