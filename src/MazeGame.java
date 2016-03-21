/**
 * This class represents a game of Labyrinth
 * 
 * @author pasquiop
 */
public class MazeGame
{

	/**
	 * the game board
	 */
	private Board board;
	private Player[] player;

	// TODO detail comment (how pieces ares placed?)
	/**
	 * create a new game, ready to be played (the board is ready, pieces are
	 * placed, cards are distributed, players are ready)
	 */
	public MazeGame(int nbPlayer0)
	{
		this.board = new Board();
		this.player = new Player[nbPlayer0];
	}

	// TODO detail algorithm (ask for advice)
	/**
	 * Play the game. 
	 * while (<game is not over>) 
	 * 	do
	 * 	 <ask current player his move tile> 
	 * 	while(<move is not valid>) 
	 * 	<move row/column>
	 * 	increment current player
	 * @return 
	 * 	return the player who won the game.
	 */
	public Player play()
	{
		boolean finished=false;
		int CurrentPlayer = 0;
		
		System.out.println("La partie commence.");
		/*choix pions*/
		while(this.finished==false)
		{
			do
			{
				/*ask current player his move*/
			}while(/*wwrong move*/);
			
			if (player[CurrentPlayer].getNbObjectives()==0)
			{
				this.finished=true;
				Player winner=player[CurrentPlayer];
			}
			else
				 CurrentPlayer += 1;
			if(CurrentPlayer==player.length+1) CurrentPlayer=0;
		}
		System.out.println(this.board.toString());
		System.out.println("La partie est finie.");
		return player[CurrentPlayer];
	}
}
