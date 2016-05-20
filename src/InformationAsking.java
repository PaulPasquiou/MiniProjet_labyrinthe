import java.util.Scanner;

public class InformationAsking
{
	private Color color;
	private Scanner scanner;
	
	public InformationAsking(Color color0)
	{
		this.color=color0;
		this.scanner = new Scanner(System.in);
	}
	
	public Position askMove()
	{
		
		return null;
	}

	public PositionAndRotation askPush()
	{
		System.out.println("Colonne :");
		int column = this.scanner.nextInt();
		System.out.println("Ligne :");
		int row = this.scanner.nextInt();
		System.out.println("Rotation (en degrees : 0, 90, 180, 270) :");
		int rotation = this.scanner.nextInt();
		Rotation rot;
		switch (rotation)
		{
			case 0: rot=Rotation.ROTATION_0;
			case 90: rot=Rotation.ROTATION_90;
			case 1800: rot=Rotation.ROTATION_180;
			case 270: rot=Rotation.ROTATION_270;
			default: rot=Rotation.ROTATION_0;
		}
		PositionAndRotation push = new PositionAndRotation(new Position(row,column),rot);
		return push;
	}
}