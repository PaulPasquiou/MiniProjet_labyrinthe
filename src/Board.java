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
    
	// TODO fix comment (ask for advice)
     /**
     * attribute (array) containing the board with the tiles
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
                                this.board[row][column] = new Tile(Tile.L_SHAPE, -1, Tile.ROTATION_90);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 1, Tile.ROTATION_0);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 2, Tile.ROTATION_0);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Tile.L_SHAPE, -1, Tile.ROTATION_180);
                                break;
                            default:
                                break;
                        }
                    case 2:
                        switch (column)
                        {
                            case 0:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 3, Tile.ROTATION_270);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 4, Tile.ROTATION_270);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 5, Tile.ROTATION_0);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 6, Tile.ROTATION_0);
                                break;
                            default:
                        }
                    case 4:
                        switch (column)
                        {
                            case 0:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 7, Tile.ROTATION_270);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 8, Tile.ROTATION_180);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 9, Tile.ROTATION_90);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 10, Tile.ROTATION_90);
                                break;
                            default:
                        }
                    case 6:
                        switch (column)
                        {
                            case 0:
                                this.board[row][column] = new Tile(Tile.L_SHAPE, -1, Tile.ROTATION_0);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 11, Tile.ROTATION_180);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Tile.T_SHAPE, 12, Tile.ROTATION_180);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Tile.L_SHAPE, -1, Tile.ROTATION_270);
                                break;
                            default:
                        }
                    default:
                }
            }
        }
    }
    
    // TODO override toString to display an ascii-art representation of the board
}
