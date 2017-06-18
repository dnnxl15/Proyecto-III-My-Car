package proyect.myCar.logic;

public class NavigationSystem extends AbstractSystem
{
	public NavigationSystem() //constructor for the NavigationSystem class
	{
		this.electricObject = null;
		this.obstaclesObject = null;
	}
	
	@Override
	public void createNavigationSystem() 
	{
		this.electricObject = new Electric();
		this.obstaclesObject = new Obstacles();
	}
}
