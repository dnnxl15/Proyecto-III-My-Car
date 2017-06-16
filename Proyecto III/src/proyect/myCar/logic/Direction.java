package proyect.myCar.logic;

public class Direction extends SystemCar
{
	private int axisX;
	
	public Direction()
	{
		this.axisX = 0;
	}
	public int moveRight()
	{
		return this.axisX;
	}
	
	public int moveLeft()
	{
		return this.axisX;
	}
}