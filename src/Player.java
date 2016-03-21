public class Player
{
	private final Color color;
	private Treasure[] objectives;
	
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
	
	public int getNbObjectives()
	{
		return objectives.length;
	}
}
