package proyect.myCar.logic;

public class NavigationSystem 
{
	private Electric navigationElectric;
	private Obstacles navigationObstacle;
	
	public NavigationSystem()
	{
		this.navigationElectric = null;
		this.navigationObstacle = null;
	}
	
	public void createObstacle()
	{
		this.navigationObstacle = new Obstacles();
	}
	
	public void createElectric()
	{
		this.navigationElectric = new Electric();
	}

}
