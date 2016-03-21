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
                                this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.PLAYER, Rotation.ROTATION_90);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.BOOK, Rotation.ROTATION_0);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.PURSE, Rotation.ROTATION_0);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.PLAYER, Rotation.ROTATION_180);
                                break;
                            default:

                                break;
                        }
                    case 2:
                        switch (column)
                        {
                            case 0:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.MAP, Rotation.ROTATION_270);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.CROWN, Rotation.ROTATION_270);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.KEYS, Rotation.ROTATION_0);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.SKULL, Rotation.ROTATION_0);
                                break;
                            default:
                        }
                    case 4:
                        switch (column)
                        {
                            case 0:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.RING, Rotation.ROTATION_270);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.CHEST, Rotation.ROTATION_180);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.EMERALD, Rotation.ROTATION_90);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.SWORD, Rotation.ROTATION_90);
                                break;
                            default:
                        }
                    case 6:
                        switch (column)
                        {
                            case 0:
                                this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.PLAYER, Rotation.ROTATION_0);
                                break;
                            case 2:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.CANDELS, Rotation.ROTATION_180);
                                break;
                            case 4:
                                this.board[row][column] = new Tile(Shape.T_SHAPE, Treasure.HELMET, Rotation.ROTATION_180);
                                break;
                            case 6:
                                this.board[row][column] = new Tile(Shape.L_SHAPE, Treasure.PLAYER, Rotation.ROTATION_270);
                                break;
                            default:
                        }
                    default:
                }
            }
        }
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        String result = null;
        for (int i = 0; i < NB_ROWS; i++)
        {
            for (int j = 0; j < NB_COLUMNS; j++)
            {
                result += this.board[i][j].toString();
            }
            result += "\n";
        }
        return result;
    }
}
