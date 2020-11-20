public class SquareTester
{
	public static void main(String[] args)
	{
		Square s = new Square(5.0);
		Square t = new Square();
		
		System.out.println("Square s");
		System.out.println("side length: " + s.getSideLength());
		System.out.println("area: " + s.getArea());
		System.out.println("perimeter: " + s.getPerimeter());
		
		t.setSideLength(10.0);
		System.out.println("Square t");
		System.out.println("side length: " + t.getSideLength());
		System.out.println("area: " + t.getArea());
		System.out.println("perimeter: " + t.getPerimeter());
	}
}
