/**
 * This class is use to start a new game
 * 
 * @author pasquiop
 *
 */
public class MazeGame
{
	/**
	 * attribut containing a board type
	 */
	private Board board;

	/**
	 * create a new game
	 */
	public MazeGame()
	{
		this.board = new Board();
	}

	/**
	 * start the game
	 */
	public void play()
	{
		System.out.println("La partie commence.");

		System.out.println("La partie est finie.");
	}
}
