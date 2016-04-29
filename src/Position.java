
public class Position
{
	private int abscisse;
	private int ordonnee;
	
	public Position(int abscisse0, int ordonnee0)
	{
		this.abscisse = abscisse0;
		this.ordonnee = ordonnee0;
	}
	
	public int getAbscisse()
	{
		return abscisse;
	}
	
	public int getOrdonnee()
	{
		return ordonnee;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + abscisse;
		result = prime * result + ordonnee;
		return result;
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
		if (this.abscisse != other.abscisse)
			return false;
		if (this.ordonnee != other.ordonnee)
			return false;
		return true;
	}
}