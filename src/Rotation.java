import java.util.Random;

/**
 * enum of all rotation available
 * 
 * @author pasquiop
 *
 */
public enum Rotation
{
	/**
	 * Default rotation for tiles 0 degres
	 */
	ROTATION_0, /**
				 * rotation for tiles 90 degres
				 */
	ROTATION_90, /**
					 * rotation for tiles 180 degres
					 */
	ROTATION_180, /**
					 * rotation for tiles 270 degres
					 */
	ROTATION_270;
	
	/**
	 * give a random rotation
	 * @return the random rotation
	 */
	public static Rotation randomRotation()
	{
		return Rotation.values()[new Random().nextInt(Rotation.values().length)];
	}
}
