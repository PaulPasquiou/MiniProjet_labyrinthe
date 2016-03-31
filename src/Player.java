// TODO write comment
public class Player
{
	// TODO write comment
	private final Color color;
	
	// TODO write comment
	private Treasure[] objectives;
	
	// TODO fix comment
	/**
	 * @param color0
	 * 	the color of the Player who is going to be created
	 * @param objectives0
	 * 	all the treasure cards the player have to search
	 */
	public Player(Color color0,Treasure[] objectives0)
	{
		this.color=color0;
		this.objectives=objectives0;
	}
	
	// TODO write comment
	// TODO use this.
	public int getNbObjectives()
	{
		return objectives.length;
	}
}
