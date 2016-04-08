// TODO write comment
public class LabyrinthTile
{
	// TODO write comment
	private final LabyrinthGameFace face;

	// TODO write comment
	private Rotation rotation;

	// TODO write comment
	public LabyrinthTile(LabyrinthGameFace face, Rotation rotation)
	{
		super();
		this.face = face;
		this.rotation = rotation;
	}

	// TODO write comment
	public LabyrinthTile(LabyrinthGameFace face)
	{
		super();
		this.face = face;
		this.rotation = Rotation.ROTATION_0;
	}

	// TODO write comment
	public String toString()
	{
		return "...";
	}

}
