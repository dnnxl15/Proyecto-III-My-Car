package proyect.myCar.logic;

import proyect.myCar.library.IConstants;

public class Evaluator implements IConstants
{
	private int scorePoints; //attribute that would contain the points
	
	public Evaluator()
	{
		this.scorePoints = POINTS_ON_GAME; //equal the scorePoints to the constant POINTS_ON_GAME
	}
	
	public int getScorePoints() //return the current value of the points
	{
		return this.scorePoints;
	}
	
	public void calculatePoints()
	{
		
	}
}
