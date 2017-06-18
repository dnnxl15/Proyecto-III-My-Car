package proyect.myCar.logic;

public class Direction extends SystemCar
{
	private boolean leftMove;
	private boolean rightMove;
	
	public Direction()
	{
		this.leftMove = false;
		this.rightMove = false;
	}
	public void moveRight()
	{
		this.rightMove = true;
		this.leftMove = false;
	}
	
	public void moveLeft()
	{
		this.leftMove = true;
		this.rightMove = false;
	}
	
	public boolean isMoveLeft()
	{
		return this.leftMove;
	}
	
	public boolean isMoveRight()
	{
		return this.rightMove;
	}
}