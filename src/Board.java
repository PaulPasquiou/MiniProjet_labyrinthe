/**
 * Board of the game . grid 7x7 . 16 fixed tiles . 49 tiles on the board.
 * 
 * @author pasquiop
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Board
{

	
	/**
	 * number of columns
	 */
	private static final int NB_COLUMNS = 7;

	/**
	 * number of rows
	 */
	private static final int NB_ROWS = 7;

	/**
	 * (array) containing the tiles [row][column]
	 */
	private Tile[][] board;

	/**
	 * the remaining tile which is use to push raw or column
	 */
	private MovableTile pushingTile;
	
	private static final Map<Position, Direction> DIRECTIONTOPUSH;
    static
    {
    	DIRECTIONTOPUSH = new HashMap<Position, Direction>();
    	getDirectiontopush().put(new Position(0,1), Direction.DOWN);
    	getDirectiontopush().put(new Position(0,3), Direction.DOWN);
    	getDirectiontopush().put(new Position(0,5), Direction.DOWN);
    	
    	getDirectiontopush().put(new Position(6,1), Direction.UP);
    	getDirectiontopush().put(new Position(6,3), Direction.UP);
    	getDirectiontopush().put(new Position(6,5), Direction.UP);
    	
    	getDirectiontopush().put(new Position(1,0), Direction.RIGHT);
    	getDirectiontopush().put(new Position(3,0), Direction.RIGHT);
    	getDirectiontopush().put(new Position(5,0), Direction.RIGHT);
    	
    	getDirectiontopush().put(new Position(1,6), Direction.LEFT);
    	getDirectiontopush().put(new Position(3,6), Direction.LEFT);
    	getDirectiontopush().put(new Position(5,6), Direction.LEFT);
    }
    
	
	/**
	 * all fixed tiles
	 */
	private static final Map<Position, Tile> FIXEDTILE;
    static
    {
    	FIXEDTILE = new HashMap<Position, Tile>();
    	FIXEDTILE.put(new Position(0,0), new Tile(Face.YELLOW_FACE, Rotation.ROTATION_90));
    	FIXEDTILE.put(new Position(0,2), new Tile(Face.BOOK_FACE, Rotation.ROTATION_0));
    	FIXEDTILE.put(new Position(0,4), new Tile(Face.PURSE_FACE, Rotation.ROTATION_0));
    	FIXEDTILE.put(new Position(0,6), new Tile(Face.RED_FACE, Rotation.ROTATION_180));
    	
    	FIXEDTILE.put(new Position(2,0), new Tile(Face.MAP_FACE, Rotation.ROTATION_270));
    	FIXEDTILE.put(new Position(2,2), new Tile(Face.CROWN_FACE, Rotation.ROTATION_270));
    	FIXEDTILE.put(new Position(2,4), new Tile(Face.KEYS_FACE, Rotation.ROTATION_0));
    	FIXEDTILE.put(new Position(2,6), new Tile(Face.SKULL_FACE, Rotation.ROTATION_0));
    	
    	FIXEDTILE.put(new Position(4,0), new Tile(Face.RING_FACE, Rotation.ROTATION_270));
    	FIXEDTILE.put(new Position(4,2), new Tile(Face.CHEST_FACE, Rotation.ROTATION_180));
    	FIXEDTILE.put(new Position(4,4), new Tile(Face.EMERALD_FACE, Rotation.ROTATION_90));
    	FIXEDTILE.put(new Position(4,6), new Tile(Face.SWORD_FACE, Rotation.ROTATION_90));
    	
    	FIXEDTILE.put(new Position(6,0), new Tile(Face.GREEN_FACE, Rotation.ROTATION_0));
    	FIXEDTILE.put(new Position(6,2), new Tile(Face.CANDELS_FACE, Rotation.ROTATION_180));
    	FIXEDTILE.put(new Position(6,4), new Tile(Face.HELMET_FACE, Rotation.ROTATION_180));
    	FIXEDTILE.put(new Position(6,6), new Tile(Face.BLUE_FACE, Rotation.ROTATION_270));
    }
    
	/**
	 * create a new default board, where mobile cards are placed randomly
	 */
	public Board()
	{
		List<Tile> movableTiles = new ArrayList<Tile>();
		movableTile(movableTiles);
		this.board = new Tile[NB_ROWS][NB_COLUMNS];
		for (int row = 0; row < NB_ROWS; row++)
		{
			for (int column = 0; column < NB_COLUMNS; column++)
			{
				Tile toInsert = FIXEDTILE.get(new Position(row, column));
				if(toInsert != null)
					this.board[row][column]=toInsert;
				else
					this.board[row][column] = movableTiles.remove(0);
			}
		}
		this.pushingTile=(MovableTile) movableTiles.remove(0);
	}
	
	/**
	 * Fill the list of movable tile and shuffle it.
	 * @param listMovable the list going to be filled and shuffled
	 */
	private static void movableTile(List<Tile> listMovable)
	{
	    listMovable.add(new MovableTile(Face.I_FACE1));
	    listMovable.add(new MovableTile(Face.I_FACE2));
	    listMovable.add(new MovableTile(Face.I_FACE3));
	    listMovable.add(new MovableTile(Face.I_FACE4));
	    listMovable.add(new MovableTile(Face.I_FACE5));
	    listMovable.add(new MovableTile(Face.I_FACE6));
	    listMovable.add(new MovableTile(Face.I_FACE7));
	    listMovable.add(new MovableTile(Face.I_FACE8));
	    listMovable.add(new MovableTile(Face.I_FACE9));
	    listMovable.add(new MovableTile(Face.I_FACE10));
	    listMovable.add(new MovableTile(Face.I_FACE11));
	    listMovable.add(new MovableTile(Face.I_FACE12));
	    
	    listMovable.add(new MovableTile(Face.L_FACE1));
	    listMovable.add(new MovableTile(Face.L_FACE2));
	    listMovable.add(new MovableTile(Face.L_FACE3));
	    listMovable.add(new MovableTile(Face.L_FACE4));
	    listMovable.add(new MovableTile(Face.L_FACE5));
	    listMovable.add(new MovableTile(Face.L_FACE6));
	    listMovable.add(new MovableTile(Face.L_FACE7));
	    listMovable.add(new MovableTile(Face.L_FACE8));
	    listMovable.add(new MovableTile(Face.L_FACE9));
	    listMovable.add(new MovableTile(Face.L_FACE10));
	    
	    listMovable.add(new MovableTile(Face.SPIDER_FACE));
	    listMovable.add(new MovableTile(Face.BEETLE_FACE));
	    listMovable.add(new MovableTile(Face.BUTTERFLY_FACE));
	    listMovable.add(new MovableTile(Face.SALAMENDER_FACE));
	    listMovable.add(new MovableTile(Face.RAT_FACE));
	    listMovable.add(new MovableTile(Face.OWL_FACE));
	    
	    listMovable.add(new MovableTile(Face.BAT_FACE));
	    listMovable.add(new MovableTile(Face.CHAMELEON_FACE));
	    listMovable.add(new MovableTile(Face.PIG_FACE));
	    listMovable.add(new MovableTile(Face.CHAINED_GHOST_FACE));
	    listMovable.add(new MovableTile(Face.PRINCESS_FACE));
	    listMovable.add(new MovableTile(Face.GHOST_FACE));
	 
	    Collections.shuffle(listMovable);
	}
	
	/**
	 * Give the remaining tile
	 * @return the remaining tile
	 */
	public Tile getPushingTile()
	{
		return this.pushingTile;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = "";
		for (int row = 0; row < NB_ROWS; row++)
		{
			for (int column = 0; column < NB_COLUMNS; column++)
			{
				result += this.board[row][column].toString();
			}
			result += "\n";
		}
		
		return result+this.pushingTile.toString();
	}

	public void pushTile(PositionAndRotation parTile)
	{
		Direction direction = getDirectiontopush().get(parTile.getPosition());
		Position position = parTile.getPosition();
		pushingTile.rotate(parTile.getRotation());
		MovableTile memoryTile = pushingTile;
		while(true)
		{
			memoryTile = replaceTile(position,memoryTile);
			position = position.neighbourPosition(direction);
			if (!isValidPosition(position)) break;
		}
		
			
		
		this.pushingTile=memoryTile;
	}
	
	public boolean isValidPosition(Position position)
	{
		return position.getRow()>=0 && position.getRow()<NB_ROWS && position.getColumn()>=0 && position.getColumn()<NB_COLUMNS;
	}
	
	public MovableTile replaceTile(Position pos, MovableTile replaceTile)
	{
		MovableTile tileToReturn = (MovableTile) this.board[pos.getRow()][pos.getColumn()];
		this.board[pos.getRow()][pos.getColumn()]=replaceTile;
		return tileToReturn;
		
	}

	public static Map<Position, Direction> getDirectiontopush()
	{
		return DIRECTIONTOPUSH;
	}
}
