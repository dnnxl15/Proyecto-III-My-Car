package proyect.myCar.logic;

public class Direction extends SystemCar
{
	private int axisX; //attribute that indicates the movement of the car
	
	public Direction() //constructor of the class
	{
		this.axisX = 0; //equal to 0
	}
	public int moveRight() //move the car to the right
	{
		return this.axisX; //return its value
	}
	
	public int moveLeft() //move the car to the left
	{
		return this.axisX; //return its value
	}
}