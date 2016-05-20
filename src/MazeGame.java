import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

	// TODO write comment(done)
	/**
	 * contains all the player of the game
	 */
	private Player[] player;

	/**
	 * create a new game, ready to be played (the board is ready, pieces are
	 * placed, cards are distributed, players are ready)
	 * @param nbPlayer0 is the number of player
	 */
	public MazeGame(int nbPlayer0)
	{
		Treasure[] treasureToDeal = new Treasure[24/nbPlayer0];
		List<Color> rdmColor = new ArrayList<Color>();
		randomColor(rdmColor);
		List<Treasure> objectives = new ArrayList<Treasure>();
		dealObjectives(objectives);
		this.board = new Board();
		this.player = new Player[nbPlayer0];
		for (int i=0;i < nbPlayer0 ;i++)
		{
			treasureToDeal = new Treasure[24/nbPlayer0];
			for(int j=0;j<24/nbPlayer0;j++)
			{
				treasureToDeal[j]=objectives.remove(0);
			}
			this.player[i]= new Player(rdmColor.remove(0),treasureToDeal);
		}	
	}

	/**
	 * Fill the list of color and shuffle it.
	 * @param rdmColor the list going to be filled and shuffled
	 */
	private static void randomColor(List<Color> rdmColor)
	{
		rdmColor.add(Color.BLUE);
		rdmColor.add(Color.YELLOW);
		rdmColor.add(Color.RED);
		rdmColor.add(Color.GREEN);
	    
	    Collections.shuffle(rdmColor);
	}
	/**
	 * Fill the list of objectives and shuffle it.
	 * @param objectives the list going to be filled and shuffled
	 */
	private static void dealObjectives(List<Treasure> objectives)
	{
	    objectives.add(Treasure.BAT);
	    objectives.add(Treasure.BEETLE);
	    objectives.add(Treasure.BOOK);
	    objectives.add(Treasure.BUTTERFLY);
	    objectives.add(Treasure.CANDELS);
	    objectives.add(Treasure.CHAINED_GHOST);
	    objectives.add(Treasure.CHAMELEON);
	    objectives.add(Treasure.CHEST);
	    objectives.add(Treasure.CROWN);
	    objectives.add(Treasure.PRINCESS);
	    objectives.add(Treasure.EMERALD);
	    objectives.add(Treasure.GHOST);
	    objectives.add(Treasure.HELMET);
	    objectives.add(Treasure.KEYS);
	    objectives.add(Treasure.MAP);
	    objectives.add(Treasure.OWL);
	    objectives.add(Treasure.PIG);
	    objectives.add(Treasure.PURSE);
	    objectives.add(Treasure.RAT);
	    objectives.add(Treasure.RING);
	    objectives.add(Treasure.SALAMENDER);
	    objectives.add(Treasure.SKULL);
	    objectives.add(Treasure.SPIDER);
	    objectives.add(Treasure.SWORD);
	    
	    Collections.shuffle(objectives);
	}
	
	public Direction directionToPush(PositionAndRotation par0)
	{
		return Board.getDirectiontopush().get(par0.getPosition());
	}
	
	private boolean checkMove(Position destination, int currentPlayer)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Play the game. while (<game is not over>) do <ask current player his move
	 * tile> while(<move is not valid>) <move row/column> increment current
	 * player
	 * 
	 * @return return the player who won the game.
	 */
	public Color play()
	{
		boolean finished = false;
		int currentPlayer = 0;
		InformationAsking[] information = new InformationAsking[this.player.length];
		for (int i=0;i<this.player.length;i++)
		{
			information[i] = new InformationAsking(this.player[i].getColor());
		}

		System.out.println("La partie commence.");
		
		while (!finished)
		{
			Position destination;
			PositionAndRotation parTile;
			System.out.println(this.board.toString());
			Direction directionToPush;
			do
			{
				parTile = information[currentPlayer].askPush();
				directionToPush=this.directionToPush(parTile);
			}while(directionToPush==null); //wrong move
			
			this.board.pushTile(parTile,directionToPush);//push
			
			System.out.println(this.board.toString());
			do
			{
				destination = information[currentPlayer].askMove();
			}while(this.checkMove(destination,currentPlayer)); //wrong move

			 //move player 
			if (this.player[currentPlayer].getNbObjectives() == 0)
			{
				finished = true;
			}
			else
				currentPlayer += 1;
			if (currentPlayer == this.player.length + 1)
				currentPlayer = 0;
		}
		System.out.println(this.board.toString());
		for (int i=0;i<this.player.length;i++)
		{
			System.out.println(this.player[i].toString());
		}
		System.out.println("La partie est finie.");
		return this.player[currentPlayer].getColor();
	}
}
