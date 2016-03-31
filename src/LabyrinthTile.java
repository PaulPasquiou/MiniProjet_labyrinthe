
public class LabyrinthTile
{
	private final LabyrinthGameFace face;
	
	private Rotation rotation;

	public LabyrinthTile(LabyrinthGameFace face, Rotation rotation)
	{
		super();
		this.face = face;
		this.rotation = rotation;
	}

	public LabyrinthTile(LabyrinthGameFace face)
	{
		super();
		this.face = face;
		this.rotation = Rotation.ROTATION_0; 
	}
	
	public String toString()
	{
		return "...";
	}
	
	

}
