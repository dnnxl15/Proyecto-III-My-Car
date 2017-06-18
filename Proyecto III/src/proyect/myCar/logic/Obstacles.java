package proyect.myCar.logic;

public class Obstacles extends SystemCar 
{
	private boolean obstacleDay; //attribute for day
	private boolean obstacleNight; //attribute for night
	private int obstacleMinimumSpeed; //attribute for minimum speed
	private int obstacleMaximumSpeed; //attribute for maximumm speed
	private boolean obstacleRain; //attribute for the rain
	
	public Obstacles() //constructor method for the Obstacles class 
	{
		obstacleDay = false;
		obstacleNight = false;
		obstacleMinimumSpeed = 0;
		obstacleMaximumSpeed = 0;
		obstacleRain = false;
	}
	
	public void setObstacleDay()
	{
		obstacleDay = true; //set day as true
		obstacleNight = false; //set night as false
	}
	
	public void setObstacleNight()
	{
		obstacleDay = true; //set the night as true
		obstacleNight = false; //set the day as false
	}
	
	public void setRaining() //set the rain as true
	{
		this.obstacleRain = true;
	}
	
	public boolean isObstacleDay() //return the status of day
	{
		return this.obstacleDay;
	}
	
	public boolean isObstacleNight() //return the status of night
	{
		return this.obstacleNight;
	}
	
	public boolean isObstacleMaximumSpeed() //if is maximum speed
	{
		if(this.obstacleMaximumSpeed > 0)
		{
			
			return true;
		}
		else	
			return false;
	}
	
	public boolean isObstacleMinimumSpeed() //if is minimmum speed
	{
		if(this.obstacleMinimumSpeed>0)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isRaining() //return the status of rain
	{
		return this.obstacleRain;
	}
	
	public int getMaximunSpeed() //get the value of maximum speed
	{
		return this.obstacleMaximumSpeed;
	}
	
	public int getMinumumSpeed() //get the value of minimum speed
	{
		return this.obstacleMinimumSpeed;
	}
}