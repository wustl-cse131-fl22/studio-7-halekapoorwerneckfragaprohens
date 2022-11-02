package studio7;

public class Rectangle {
	
	private int width;
	private int length;	
	public Rectangle(int initWidth, int initLength)
	{
		width = initWidth;
		length = initLength;
	}
	
	public int getArea()
	{
		int area = width*length;
		return area;
	}
	
	
	public static void main(String[] args)
	{
		Rectangle rec1 = new Rectangle(5, 6);
		System.out.println("area: "+ rec1.getArea());
	}

}

