
public class Position
{
	private int row;
	private int column;
	
	public Position(int row, int column)
	{
		this.row = row;
		this.column = column;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public int getColumn()
	{
		return column;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + row;
		result = prime * result + column;
		return result;
	}

	/**
	 * Give the positon next to the pushing tile in the given direction
	 * @param direction
	 * @return
	 */
	public Position neighbourPosition(Direction direction)
	{
		return new Position(this.row+direction.getDeltaRow(),this.column+direction.getDeltaColumn());
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (this.row != other.row)
			return false;
		if (this.column != other.column)
			return false;
		return true;
	}
}