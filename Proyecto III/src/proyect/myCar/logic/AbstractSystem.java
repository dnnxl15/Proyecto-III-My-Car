package proyect.myCar.logic;

// Aplicar patron bridge
// Mus

public class AbstractSystem 
{
	private Motor motorObject;
	private Obstacles obstaclesObject;
	private Direction directionObject;
	private Electric electricObject;
	
	public AbstractSystem()
	{
		this.motorObject = null;
		this.obstaclesObject = null;
		this.directionObject = null;
		this.electricObject = null;
	}
	
	public void createMotor()
	{
		this.motorObject = new Motor();
	}
	
	public void createObstacle()
	{
		this.obstaclesObject = new Obstacles();
	}
	
	public void createDirection()
	{
		this.directionObject = new Direction();
	}
	
	public void createElectric()
	{
		this.electricObject = new Electric();
	}
}
