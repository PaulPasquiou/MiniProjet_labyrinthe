/**
 * Board of the game . grid 7x7 . 16 fixed tiles . 49 tiles on the board.
 * 
 * @author pasquiop
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

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
	
	private static final Map<Position, Tile> fixedTiles;
    static
    {
    	fixedTiles = new HashMap<Position, Tile>();
    	fixedTiles.put(new Position(0,0), new Tile(Face.YELLOW_FACE, Rotation.ROTATION_90));
    	fixedTiles.put(new Position(0,2), new Tile(Face.BOOK_FACE, Rotation.ROTATION_0));
    	fixedTiles.put(new Position(0,4), new Tile(Face.PURSE_FACE, Rotation.ROTATION_0));
    	fixedTiles.put(new Position(0,6), new Tile(Face.RED_FACE, Rotation.ROTATION_180));
    	
    	fixedTiles.put(new Position(2,0), new Tile(Face.MAP_FACE, Rotation.ROTATION_270));
    	fixedTiles.put(new Position(2,2), new Tile(Face.CROWN_FACE, Rotation.ROTATION_270));
    	fixedTiles.put(new Position(2,4), new Tile(Face.KEYS_FACE, Rotation.ROTATION_0));
    	fixedTiles.put(new Position(2,6), new Tile(Face.SKULL_FACE, Rotation.ROTATION_0));
    	
    	fixedTiles.put(new Position(4,0), new Tile(Face.RING_FACE, Rotation.ROTATION_270));
    	fixedTiles.put(new Position(4,2), new Tile(Face.CHEST_FACE, Rotation.ROTATION_180));
    	fixedTiles.put(new Position(4,4), new Tile(Face.EMERALD_FACE, Rotation.ROTATION_90));
    	fixedTiles.put(new Position(4,6), new Tile(Face.SWORD_FACE, Rotation.ROTATION_90));
    	
    	fixedTiles.put(new Position(6,0), new Tile(Face.GREEN_FACE, Rotation.ROTATION_0));
    	fixedTiles.put(new Position(6,2), new Tile(Face.CANDELS_FACE, Rotation.ROTATION_180));
    	fixedTiles.put(new Position(6,4), new Tile(Face.HELMET_FACE, Rotation.ROTATION_180));
    	fixedTiles.put(new Position(6,6), new Tile(Face.BLUE_FACE, Rotation.ROTATION_270));
    }
    

	/**
	 * create a new default board, where mobile cards are placed randomly
	 */
	public Board()
	{
		
		//Créer une liste qui contient toutes les tuiles mobiles avec une rotation aléatoire
		//Mélanger les éléments de cette liste
		//Prendre la tuile en tete de liste a chaque default
		
	    private List<Tile> movableTiles = new ArrayList();
	    movableTiles.add(new Tile());
	    //creer toutes les tuiles qui peuvent bouger avec une rotation de 0
	    //mélanger la liste
		
		this.board = new Tile[NB_ROWS][NB_COLUMNS];
		for (int row = 0; row < NB_ROWS; row++)
		{
			for (int column = 0; column < NB_COLUMNS; column++)
			{
				Tile toInsert = fixedTiles.get(new Position(column, row));
				if(toInsert != null)
				{
					this.board[row][column]=toInsert;
				}
				else
				{
					//mettre une tuile de la liste movable, faire une rotation aleatoire (avec methode rotate)
				}
			}
		}
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
		return result;
	}
}
