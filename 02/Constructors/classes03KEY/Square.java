public class Square
{
	private double sideLength;

	/**
	 * Constructs a square with sides of the given length.
	 * @param sideLength The length of the side
	 */
	public Square(double sideLength)
	{
		this.sideLength = sideLength;
	}

	/**
	 * Constructs a square with sides of length 0.
	 */
	public Square()
	{
		sideLength = 0.0;
	}

	/**
	 * @return the length of a side.
	 */
	public double getSideLength()
	{
		return sideLength;
	}

	/**
	 * @param sideLength The side length to set.
	 */
	public void setSideLength(double sideLength)
	{
		this.sideLength = sideLength;
	}

	/**
	 * @return the area of the square.
	 */
	public double getArea()
	{
		return sideLength * sideLength;
	}
	
	/**
	 * @return the perimeter of the square.
	 */
	public double getPerimeter()
	{
		return 4.0 * sideLength;
	}
}
