
/**
 * Application that launches a Labyrinth game
 * 
 * @author pasquiop
 */
public class Main
{
	/**
	 * Application's main
	 * 
	 * @param args
	 *            command-line arguments (unused)
	 */
	public static void main(String[] args)
	{
		int nbPlayer = 2;
		new MazeGame(nbPlayer).play();
	}
}
