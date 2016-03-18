// TODO fix comment (ask for advice)(done)
/**
 * Board of the game . grid 7x7 . 16 fixed tiles . 49 tiles on the board.
 * 
 * @author pasquiop
 *
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

	// TODO fix comment (ask for advice)(done)
	/**
	 *  (array) containing the tiles [row][column]
	 */
	private Tile[][] board;

	/**
	 * create a new default board, where mobile cards are placed randomly
	 */
	public Board()
	{
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
						this.board[row][column] = new Tile(Shape.L_SHAPE, -1, Rotation.ROTATION_90);
						break;
					case 2:
						this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.BOOK, Rotation.ROTATION_0);
						break;
					case 4:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 2, Rotation.ROTATION_0);
						break;
					case 6:
						this.board[row][column] = new Tile(Shape.L_SHAPE, -1, Rotation.ROTATION_180);
						break;
					default:
						
						break;
					}
				case 2:
					switch (column)
					{
					case 0:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 3, Rotation.ROTATION_270);
						break;
					case 2:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 4, Rotation.ROTATION_270);
						break;
					case 4:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 5, Rotation.ROTATION_0);
						break;
					case 6:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 6, Rotation.ROTATION_0);
						break;
					default:
					}
				case 4:
					switch (column)
					{
					case 0:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 7, Rotation.ROTATION_270);
						break;
					case 2:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 8, Rotation.ROTATION_180);
						break;
					case 4:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 9, Rotation.ROTATION_90);
						break;
					case 6:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 10, Rotation.ROTATION_90);
						break;
					default:
					}
				case 6:
					switch (column)
					{
					case 0:
						this.board[row][column] = new Tile(Shape.L_SHAPE, -1, Rotation.ROTATION_0);
						break;
					case 2:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 11, Rotation.ROTATION_180);
						break;
					case 4:
						this.board[row][column] = new Tile(Shape.T_SHAPE, 12, Rotation.ROTATION_180);
						break;
					case 6:
						this.board[row][column] = new Tile(Shape.L_SHAPE, -1, Rotation.ROTATION_270);
						break;
					default:
					}
				default:
				}
			}
		}
	}

	// TODO override toString to display an ascii-art representation of the(done)
	// board(done)
	public String toString()
    {
		String result = null;
    	for(int i=0; i<NB_ROWS; i++)
    	{
    		for(int j=0; j<NB_COLUMNS; j++)
    		{
    			result+=this.board[i][j].toString();
    		}
    		result+="\n";
    	}
		return result;
    }
}
