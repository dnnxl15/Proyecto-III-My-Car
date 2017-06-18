package proyect.myCar.logic;

public class CoordinationSystem extends AbstractSystem
{	
	public CoordinationSystem() //public constructor for the class
	{
		this.motorObject = null; //motorObject created in AbstracSystem
		this.directionObject = null; //directionObject created in AbstracSystem
	}
	
	@Override
	public void createCoordinationSystem() 
	{
		this.motorObject = new Motor(); //creates a new Object of the Motor type
		this.directionObject = new Direction(); //creates a new Object of the Direction type
	}
}