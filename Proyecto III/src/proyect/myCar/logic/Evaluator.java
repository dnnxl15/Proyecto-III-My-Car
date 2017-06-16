package proyect.myCar.logic;

import proyect.myCar.library.IConstants;

public class Evaluator implements IConstants
{
	private int scorePoints;
	
	public Evaluator()
	{
		this.scorePoints = POINTS_ON_GAME;
	}
	
	public int getScorePoints()
	{
		return this.scorePoints;
	}
	
	public void calculatePoints()
	{
		
	}
}