
// TODO write comment
public enum LabyrinthGameFace
{
	// TODO write comment
	MY_FIRST_FACE(null, Treasure.BAT), MY_SECOND_FACE(null, Treasure.NONE);

	// TODO write comment
	private final Shape shape;

	// TODO write comment
	private final Treasure treasure;

	// TODO write comment
	private LabyrinthGameFace(Shape shape, Treasure treasure)
	{
		this.shape = shape;
		this.treasure = treasure;
	}

	// TODO write comment
	public Shape getShape()
	{
		return shape;
	}

	// TODO write comment
	public Treasure getTreasure()
	{
		return treasure;
	}

}
