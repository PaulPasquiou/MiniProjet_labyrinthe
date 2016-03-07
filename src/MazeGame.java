/**
 * This class is used to start a new game
 * 
 * @author pasquiop
 *
 */
public class MazeGame
{
	// TODO fix comment (just what it is, from the game point of view)
	/**
	 * attribut containing a board type
	 */
	private Board board;

	// TODO detail comment (in which state is the new game returned?)
	/**
	 * create a new game
	 */
	public MazeGame()
	{
		this.board = new Board();
	}

	// TODO detail comment (what is the main algorithm)
	/**
	 * start the game
	 */
	public void play()
	{
		System.out.println("La partie commence.");

		System.out.println("La partie est finie.");
	}
}
