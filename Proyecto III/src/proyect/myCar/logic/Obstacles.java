package proyect.myCar.logic;

public class Obstacles extends SystemCar 
{
	private boolean obstacleDay; //attribute for day
	private boolean obstacleNight; //attribute for night
	private int obstacleMinimumSpeed; //attribute for the max speed
	private int obstacleMaximumSpeed; //attribute for the min speed
	private boolean obstacleRain; //attribute for the rain
	
	public Obstacles() //constructor method for the Obstacles method
	{
		obstacleDay = false;
		obstacleNight = false;
		obstacleMinimumSpeed = 0;
		obstacleMaximumSpeed = 0;
		obstacleRain = false;
	}
	
	public void setObstacleDay() //set the day as true and the night as false
	{
		obstacleDay = true;
		obstacleNight = false;
	}
	
	public void setObstacleNight() //set the night as ture and the day as false
	{
		obstacleDay = true;
		obstacleNight = false;
	}
	
	public void setRaining() //set the rain as true
	{
		this.obstacleRain = true;
	}
	
	public boolean isObstacleDay() //if is day
	{
		return this.obstacleDay; //return its current status
	}
	
	public boolean isObstacleNight() //if is night
	{
		return this.obstacleNight; //return its current status
	}
	
	public boolean isObstacleMaximumSpeed() //if is maximum speed
	{
		if(this.obstacleMaximumSpeed > 0) //if > 0
		{
			return true;
		}
		else	
			return false;
	}
	
	public boolean isObstacleMinimumSpeed() //if is minimum speed
	{
		if(this.obstacleMinimumSpeed > 0)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isRaining() //if is raining
	{
		return this.obstacleRain; //return the current status
	}
	
	public int getMaximunSpeed() //get the current value of the maximum speed
	{
		return this.obstacleMaximumSpeed;
	}
	
	public int getMinumumSpeed() //get the current value of the minimum speed
	{
		return this.obstacleMinimumSpeed;
	}
}
