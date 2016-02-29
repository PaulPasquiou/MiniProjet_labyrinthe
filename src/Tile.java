/**
 * it's tile of the board of the game 
 * 
 * @author pasquiop
 *
 */
public class Tile
{
	/**
	 * 
	 */
	public static final int T_SHAPE=0;
	/**
	 * 
	 */
	public static final int L_SHAPE=1;
	/**
	 * 
	 */
	public static final int I_SHAPE=2;
	
	private int shape;
	private int item;
	private int rotation;
	

	/**
	 * @param shape0
	 * @param item0
	 * @param rotation0
	 */
	public Tile(int shape0, int item0, int rotation0)
	{
		this.shape =shape0;
		this.item =item0;
		this.rotation =rotation0;
	}
}
