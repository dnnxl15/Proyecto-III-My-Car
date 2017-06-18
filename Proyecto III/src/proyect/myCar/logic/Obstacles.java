package proyect.myCar.logic;

public class Obstacles extends SystemCar 
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
		obstacleDay = true;
		obstacleNight = false;
	}
	
	public void setObstacleNight()
	{
		
		obstacleDay = true;
		obstacleNight = false;
	}
	
	public void setRaining()
	{
		this.obstacleRain = true;
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
		if(this.obstacleMaximumSpeed>0)
		{
			
			return true;
		}
		else	
			return false;
	}
	
	public boolean isObstacleMinimumSpeed()
	{
		if(this.obstacleMinimumSpeed>0)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isRaining()
	{
		return this.obstacleRain;
	}
	
	public int getMaximunSpeed()
	{
		return this.obstacleMaximumSpeed;
	}
	
	public int getMinumumSpeed()
	{
		return this.obstacleMinimumSpeed;
	}
}