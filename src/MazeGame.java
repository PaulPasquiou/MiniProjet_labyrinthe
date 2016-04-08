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

	// TODO write comment
	/**
	 * 
	 */
	private Player[] player;

	/**
	 * create a new game, ready to be played (the board is ready, pieces are
	 * placed, cards are distributed, players are ready)
	 * @param nbPlayer0 is the number of player
	 */
	public MazeGame(int nbPlayer0)
	{
		this.board = new Board();
		this.player = new Player[nbPlayer0];
		for (int i=0;i < nbPlayer0 ;i++)
		{
			this.player[i]= new Player(,new Treasure[] )
		}
	}

	/**
	 * Play the game. while (<game is not over>) do <ask current player his move
	 * tile> while(<move is not valid>) <move row/column> increment current
	 * player
	 * 
	 * @return return the player who won the game.
	 */
	public Player play()
	{
		boolean finished = false;

		int currentPlayer = 0;

		System.out.println("La partie commence.");
		/* choix pions */
		while (!finished)
		{
			// do
			// {
			// /*ask current player his move*/
			// }while(); /*wrong move*/

			/* move player */
			if (this.player[currentPlayer].getNbObjectives() == 0)
			{
				finished = true;
				Player winner = this.player[currentPlayer];
			}
			else
				currentPlayer += 1;
			if (currentPlayer == this.player.length + 1)
				currentPlayer = 0;
		}
		System.out.println(this.board.toString());
		System.out.println("La partie est finie.");
		return this.player[currentPlayer];
	}
}
