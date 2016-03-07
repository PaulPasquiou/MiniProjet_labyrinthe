/**
 * This class is used to start a new game
 * 
 * @author pasquiop
 *
 */
public class MazeGame
{
	// TODO fix comment (just what it is, from the game point of view)(done)
	/**
	 * attribut containing the board of the game
	 */
	private Board board;

	// TODO detail comment (in which state is the new game returned?)(done)
	/**
	 * create a new game, ready to be played (the board is ready, piece are placed, cards are distributed)
	 */
	public MazeGame()
	{
		this.board = new Board();
	}

	// TODO detail comment (what is the main algorithm)(done)
	/**
	 * start the game, every players push a tile when it's their turn, and move their piece where they can walk)
	 */
	public void play()
	{
		System.out.println("La partie commence.");
		
		System.out.println("La partie est finie.");
	}
}
