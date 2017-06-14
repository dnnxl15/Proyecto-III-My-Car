package proyect.myCar.logic;

public class CoordinationSystem extends AbstractSystem
{	
	public CoordinationSystem()
	{
		this.motorObject = null;
		this.directionObject = null;
	}
	
	@Override
	public void createCoordinationSystem() 
	{
		this.motorObject = new Motor();
		this.directionObject = new Direction();
	}
}
