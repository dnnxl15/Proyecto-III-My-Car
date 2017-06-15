package proyect.myCar.logic;

public class AbstractSystem 
{	//Protected attributes to be used in the classes that extends 
	protected SystemCar motorObject; //attribute of Motor type 
	protected SystemCar obstaclesObject; //attribute of Obstacle type
	protected SystemCar directionObject; //attribute of Direction type
	protected SystemCar electricObject; //attribute of Electric type
	
	public AbstractSystem() //Constructor method for the class
	{
		this.motorObject = null;
		this.obstaclesObject = null;
		this.directionObject = null;
		this.electricObject = null;
	}
	
	public void createMotor() //create a new Motor object
	{
		this.motorObject = new Motor();
	}
	
	public SystemCar getMotor()
	{
		return this.motorObject;
	}
	
	public void createObstacle() //create a new Obstacles object
	{
		this.obstaclesObject = new Obstacles();
	}
	
	public SystemCar getObstacles()
	{
		return this.obstaclesObject;
	}
	
	public void createDirection() //creat a new Direction object
	{
		this.directionObject = new Direction();
	}
	
	public SystemCar getDirection()
	{
		return this.directionObject;
	}
	
	public void createElectric() //create a new Electric object
	{
		this.electricObject = new Electric();
	}

	public SystemCar getElectric()
	{
		return this.electricObject;
	}
	
	public void createCoordinationSystem() //method that allows CoordinationSystem to create objects
	{
		// TODO Auto-generated method stub	
	}

	public void createNavigationSystem() //method that allows NavigationSystem to create objects
	{
		// TODO Auto-generated method stub	
	}
}
