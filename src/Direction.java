
public enum Direction
{
	UP(-1,0),
	DOWN(1,0),
	LEFT(0,-1),
	RIGHT(0,1);
	
	private int dRow;
	private int dColumn;
	
	private Direction(int dRow,int dColumn)
	{
		this.dRow = dRow;
		this.dColumn = dColumn;
	}

	public int getDeltaRow()
	{
		return dRow;
	}

	public int getDeltaColumn()
	{
		return dColumn;
	}
}
