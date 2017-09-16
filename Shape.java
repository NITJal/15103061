abstract public class Shape {
	public abstract void numberOfSides();
	public static void main(String args[])
	{
		Trapezoid t=new Trapezoid();
		Hexagon h=new Hexagon();
		Triangle tr=new Triangle();
		t.numberOfSides();
		h.numberOfSides();
		tr.numberOfSides();
	}
}
class Trapezoid extends Shape{
	public void numberOfSides()
	{
		System.out.println("Number of sides in trapezoid is 4");
	}
}
class Hexagon extends Shape{
	public void numberOfSides()
	{
		System.out.println("Number of sides in hexagon is 6");
	}
}
class Triangle extends Shape{
	public void numberOfSides()
	{
		System.out.println("Number of sides in triangle is 3");
	}
}