// TODO write comment(done)
/**
 * A player of the labyrinth game. Featured by a color and an array of
 * objectives.
 * 
 * @author pasquiop
 * 
 */
public class Player
{
	// TODO write comment(done)
	/**
	 * The color of the player
	 */
	private final Color color;

	// TODO write comment(done)
	/**
	 * the array of objectives of the player (ie : items the player has to look
	 * for)
	 */
	private Treasure[] objectives;

	// TODO fix comment(done)
	/**
	 * create new player with a color and an array of objectives
	 * 
	 * @param color0
	 *            the color of the Player who is going to be created
	 * @param objectives0
	 *            all the treasure cards the player have to search
	 */
	public Player(Color color0, Treasure[] objectives0)
	{
		this.color = color0;
		this.objectives = objectives0;
	}

	/**
	 * give the remaining number of objectives
	 * 
	 * @return the remaining number of objectives
	 */
	// TODO write comment(done)
	// TODO use this.(done)
	public int getNbObjectives()
	{
		return this.objectives.length;
	}
}
