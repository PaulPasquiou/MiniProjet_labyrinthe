

public enum LabyrinthGameFace
{
	MY_FIRST_FACE(null, Treasure.BAT),
	MY_SECOND_FACE(null, Treasure.NONE);
	
	private final Shape shape;
	private final Treasure treasure;
	
	
	private LabyrinthGameFace(Shape shape, Treasure treasure)
	{
		this.shape = shape;
		this.treasure = treasure;
	}

	public Shape getShape()
	{
		return shape;
	}

	public Treasure getTreasure()
	{
		return treasure;
	}

}
