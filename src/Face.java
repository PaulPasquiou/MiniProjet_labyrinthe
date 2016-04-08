/**
 * it represents tiles, it's featured by a shape, and an item, they won't change
 * once they are created
 * 
 * @author pasquiop
 * 
 */
public enum Face
{
	/**
	 * All the tile of the game
	 */
	// TODO write comment(done)
	/**
	 * Player's faces
	 */
	YELLOW_FACE(Shape.L_SHAPE, Treasure.PLAYER),
	RED_FACE(Shape.L_SHAPE, Treasure.PLAYER),
	GREEN_FACE(Shape.L_SHAPE, Treasure.PLAYER),
	BLUE_FACE(Shape.L_SHAPE, Treasure.PLAYER),
	/**
	 * I-shaped Faces without treasure
	 */
	I_FACE1(Shape.I_SHAPE, Treasure.NONE),
	I_FACE2(Shape.I_SHAPE, Treasure.NONE),
	I_FACE3(Shape.I_SHAPE, Treasure.NONE),
	I_FACE4(Shape.I_SHAPE, Treasure.NONE),
	I_FACE5(Shape.I_SHAPE, Treasure.NONE),
	I_FACE6(Shape.I_SHAPE, Treasure.NONE),
	I_FACE7(Shape.I_SHAPE, Treasure.NONE),
	I_FACE8(Shape.I_SHAPE, Treasure.NONE),
	I_FACE9(Shape.I_SHAPE, Treasure.NONE),
	I_FACE10(Shape.I_SHAPE, Treasure.NONE),
	I_FACE11(Shape.I_SHAPE, Treasure.NONE),
	I_FACE12(Shape.I_SHAPE, Treasure.NONE),
	/**
	 * L-shaped faces without treasure
	 */
	L_FACE1(Shape.L_SHAPE, Treasure.NONE),
	L_FACE2(Shape.L_SHAPE, Treasure.NONE),
	L_FACE3(Shape.L_SHAPE, Treasure.NONE),
	L_FACE4(Shape.L_SHAPE, Treasure.NONE),
	L_FACE5(Shape.L_SHAPE, Treasure.NONE),
	L_FACE6(Shape.L_SHAPE, Treasure.NONE),
	L_FACE7(Shape.L_SHAPE, Treasure.NONE),
	L_FACE8(Shape.L_SHAPE, Treasure.NONE),
	L_FACE9(Shape.L_SHAPE, Treasure.NONE),
	L_FACE10(Shape.L_SHAPE, Treasure.NONE),
	/**
	 * T-shaped with treasure
	 */
	BOOK_FACE(Shape.T_SHAPE,Treasure.BOOK), 
	PURSE_FACE(Shape.T_SHAPE,Treasure.PURSE), 
	MAP_FACE(Shape.T_SHAPE,Treasure.MAP), 
	CROWN_FACE(Shape.T_SHAPE,Treasure.CROWN), 
	KEYS_FACE(Shape.T_SHAPE,Treasure.KEYS), 
	SKULL_FACE(Shape.T_SHAPE,Treasure.SKULL), 
	RING_FACE(Shape.T_SHAPE,Treasure.RING), 
	CHEST_FACE(Shape.T_SHAPE,Treasure.CHEST), 
	EMERALD_FACE(Shape.T_SHAPE,Treasure.EMERALD), 
	SWORD_FACE(Shape.T_SHAPE,Treasure.SWORD), 
	CANDELS_FACE(Shape.T_SHAPE,Treasure.CANDELS), 
	HELMET_FACE(Shape.T_SHAPE,Treasure.HELMET), 
	BAT_FACE(Shape.T_SHAPE,Treasure.BAT), 
	CHAMELEON_FACE(Shape.T_SHAPE,Treasure.CHAMELEON), 
	PIG_FACE(Shape.T_SHAPE,Treasure.PIG), 
	CHAINED_GHOST_FACE(Shape.T_SHAPE,Treasure.CHAINED_GHOST),
	PRINCESS_FACE(Shape.T_SHAPE,Treasure.PRINCESS), 
	GHOST_FACE(Shape.T_SHAPE,Treasure.GHOST), 
	/**
	 * L-shaped with treasure
	 */
	SPIDER_FACE(Shape.L_SHAPE,Treasure.SPIDER), 
	BEETLE_FACE(Shape.L_SHAPE,Treasure.BEETLE), 
	BUTTERFLY_FACE(Shape.L_SHAPE,Treasure.BUTTERFLY), 
	SALAMENDER_FACE(Shape.L_SHAPE,Treasure.SALAMENDER), 
	RAT_FACE(Shape.L_SHAPE,Treasure.RAT), 
	OWL_FACE(Shape.L_SHAPE,Treasure.OWL);

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
	private Face(Shape shape0, Treasure item0)
	{
		this.shape = shape0;
		this.item = item0;
	}


	/**
	 * Give the shape of a tile
	 * 
	 * @return the shape of the tile
	 */
	public Shape getShape()
	{
		return this.shape;
	}

	/**
	 * Give the item of a tile
	 * 
	 * @return the item of the tile
	 */
	public Treasure getItem()
	{
		return this.item;
	}

}

