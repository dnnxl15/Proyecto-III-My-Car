package proyect.myCar.logic;

public class CoordinationSystem 
{
	private Motor coordinationMotor;
	private Direction coordinationDirection;
	
	public CoordinationSystem()
	{
		this.coordinationMotor = null;
		this.coordinationDirection = null;
	}
	
	public void createMotor()
	{
		this.coordinationMotor = new Motor();
	}
	
	public void createDirection()
	{
		this.coordinationDirection = new Direction();
	}
}
