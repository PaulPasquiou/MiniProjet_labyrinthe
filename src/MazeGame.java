// TODO fix comment (what this class represents?)

/**
 * This class is used to start a new game
 * 
 * @author pasquiop
 *
 */
public class MazeGame
{
	
	/**
	 * the game board
	 */
	private Board board;

	// TODO detail comment (how pieces ares placed?)
	/**
	 * create a new game, ready to be played (the board is ready, pieces are
	 * placed, cards are distributed)
	 */
	public MazeGame()
	{
		this.board = new Board();
	}

	// TODO detail algorithm (ask for advice)
	/**
	 * Play the game.  
	 * Every players push a tile when it's their turn, and move
	 * their piece where they can walk)
	 */
	public void play()
	{
		System.out.println("La partie commence.");

		System.out.println("La partie est finie.");
	}
}
