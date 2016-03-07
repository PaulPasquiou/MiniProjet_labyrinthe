// TODO fix comment (ask for advice)(done)
/**
 * Board of the game . grid 7x7 . 16 fixed tiles .  49 tiles on the board.
 * 
 * @author pasquiop
 *
 */
public class Board
{
	/**
	 * number of column (constant)
	 */
	private static final int NB_COLUMN = 7;
	/**
	 * number of row (constant)
	 */
	private static final int NB_ROW = 7;
	// TODO fix comment (see MazeGame)(done)
	/**
	 * attribute (array) containing the board with the tiles
	 */
	private Tile[][] board;

	private Tile[] FixedTile;
	// TODO clean comment (board...board) (done)
	/**
	 * create the default board, where mobile cards are placed randomly
	 */
	public Board()
	{
		// TODO rename local variables(done)
		// TODO declare constants(done)
		for (int row = 0; row < NB_ROW; row++)
		{
			for (int column = 0; column < NB_COLUMN; column++)
			{
				switch (row)
				{
					case 0:
						switch (column)
						{
							case 0: this.board[row][column] = new Tile(L_SHAPE,-1,1); break;		
							case 2: this.board[row][column] = new Tile(,,); break;	
							case 4: this.board[row][column] = new Tile(,,); break;	
							case 6: this.board[row][column] = new Tile(,,); break;	
							default: break;
						}
					case 2:
						switch (column)
						{
							case 0: this.board[row][column] = new Tile(,,); break;		
							case 2: this.board[row][column] = new Tile(,,); break;	
							case 4: this.board[row][column] = new Tile(,,); break;	
							case 6: this.board[row][column] = new Tile(,,); break;	
							default:
						}
					case 4:
						switch (column)
						{
							case 0: this.board[row][column] = new Tile(,,); break;		
							case 2: this.board[row][column] = new Tile(,,); break;	
							case 4: this.board[row][column] = new Tile(,,); break;	
							case 6: this.board[row][column] = new Tile(,,); break;	
							default:
						}
					case 6:
						switch (column)
						{
							case 0: this.board[row][column] = new Tile(,,); break;		
							case 2: this.board[row][column] = new Tile(,,); break;	
							case 4: this.board[row][column] = new Tile(,,); break;	
							case 6: this.board[row][column] = new Tile(,,); break;	
							default:
						}
					default:
				}
			}
		}
	}
}
