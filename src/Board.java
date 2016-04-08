/**
 * Board of the game . grid 7x7 . 16 fixed tiles . 49 tiles on the board.
 * 
 * @author pasquiop
 */
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
	 * create a new default board, where mobile cards are placed randomly
	 */
	public Board()
	{
		//Créer une strucuture de données de type MAP qui contient les tuiles fixes
		//à leurs emplacements et la compléter avec la liste suivante
		
		//Créer une liste qui contient toutes les tuiles mobiles avec une rotation aléatoire
		//Mélanger les éléments de cette liste
		//Prendre la tuile en tete de liste a chaque default
		
		
		this.board = new Tile[NB_ROWS][NB_COLUMNS];
		for (int row = 0; row < NB_ROWS; row++)
		{
			for (int column = 0; column < NB_COLUMNS; column++)
			{
				switch (row)
				{
				case 0:
					switch (column)
					{
					case 0:
						this.board[row][column] = new Tile(Face.YELLOW_FACE, Rotation.ROTATION_90);
						break;
					case 2:
						this.board[row][column] = new Tile(Face.BOOK_FACE, Rotation.ROTATION_0);
						break;
					case 4:
						this.board[row][column] = new Tile(Face.PURSE_FACE, Rotation.ROTATION_0);
						break;
					case 6:
						this.board[row][column] = new Tile(Face.RED_FACE, Rotation.ROTATION_180);
						break;
					default:
						//this.board[row][column] = ;
						break;
					}
					break;
				case 2:
					switch (column)
					{
					case 0:
						this.board[row][column] = new Tile(Face.MAP_FACE, Rotation.ROTATION_270);
						break;
					case 2:
						this.board[row][column] = new Tile(Face.CROWN_FACE, Rotation.ROTATION_270);
						break;
					case 4:
						this.board[row][column] = new Tile(Face.KEYS_FACE, Rotation.ROTATION_0);
						break;
					case 6:
						this.board[row][column] = new Tile(Face.SKULL_FACE, Rotation.ROTATION_0);
						break;
					default:
						//this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.NONE, Rotation.ROTATION_0);
						break;
					}
					break;
				case 4:
					switch (column)
					{
					case 0:
						this.board[row][column] = new Tile(Face.RING_FACE, Rotation.ROTATION_270);
						break;
					case 2:
						this.board[row][column] = new Tile(Face.CHEST_FACE, Rotation.ROTATION_180);
						break;
					case 4:
						this.board[row][column] = new Tile(Face.EMERALD_FACE, Rotation.ROTATION_90);
						break;
					case 6:
						this.board[row][column] = new Tile(Face.SWORD_FACE, Rotation.ROTATION_90);
						break;
					default:
						//this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.NONE, Rotation.ROTATION_0);
						break;
					}
					break;
				case 6:
					switch (column)
					{
					case 0:
						this.board[row][column] = new Tile(Face.GREEN_FACE, Rotation.ROTATION_0);
						break;
					case 2:
						this.board[row][column] = new Tile(Face.CANDELS_FACE, Rotation.ROTATION_180);
						break;
					case 4:
						this.board[row][column] = new Tile(Face.HELMET_FACE, Rotation.ROTATION_180);
						break;
					case 6:
						this.board[row][column] = new Tile(Face.BLUE_FACE, Rotation.ROTATION_270);
						break;
					default:
						//this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.NONE, Rotation.ROTATION_0);
						break;
					}
					break;
				default:
					//this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.NONE, Rotation.ROTATION_0);
					break;
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
