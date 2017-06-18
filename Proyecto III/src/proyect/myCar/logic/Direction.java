package proyect.myCar.logic;

public class Direction extends SystemCar
{
	private boolean leftMove; //attribute for moving left
	private boolean rightMove; //attribute for moving right
	
	public Direction() //constructor method for the Direction class
	{
		this.leftMove = false;
		this.rightMove = false;
	}
	public void moveRight() //set the moving right attributes
	{
		this.rightMove = true;
		this.leftMove = false;
	}
	
	public void moveLeft() //set the moving left attributes
	{
		this.leftMove = true;
		this.rightMove = false;
	}
	
	public boolean isMoveLeft() //return the status 
	{
		return this.leftMove;
	}
	
	public boolean isMoveRight() //return the status
	{
		return this.rightMove;
	}
}