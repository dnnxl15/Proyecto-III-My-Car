package proyect.myCar.logic;

public class Obstacles 
{
	private boolean obstacleDay;
	private boolean obstacleNight;
	private int obstacleMinimumSpeed;
	private int obstacleMaximumSpeed;
	private boolean obstacleRain;
	
	public Obstacles()
	{
		obstacleDay = false;
		obstacleNight = false;
		obstacleMinimumSpeed = 0;
		obstacleMaximumSpeed = 0;
		obstacleRain = false;
	}
	
	public void setObstacleDay()
	{		
	}
	
	public void setObstacleNight()
	{
		
		obstacleDay = true;
		obstacleNight = false;
	}
	
	public boolean isObstacleDay()
	{
		return this.obstacleDay;
	}
	
	public boolean isObstacleNight()
	{
		return this.obstacleNight;
	}
	
	public boolean isObstacleMaximumSpeed()
	{
		return this.isObstacleMaximumSpeed();
	}
	
	public boolean isObstacleMinimumSpeed()
	{
		return this.isObstacleMinimumSpeed();
	}
	
	public boolean isRaining()
	{
		return this.isRaining();
	}
}
