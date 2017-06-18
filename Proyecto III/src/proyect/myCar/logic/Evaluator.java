package proyect.myCar.logic;

import proyect.myCar.library.IConstants;

public class Evaluator implements IConstants
{
	private int scorePoints; //points of the player
	
	public Evaluator() //constructor method
	{
		this.scorePoints = POINTS_ON_GAME;
	}
	
	public int getScorePoints() //get the current score of the player
	{
		return this.scorePoints;
	}
	
	public void calculatePointsOnWeather(FreeWayComponent pComponent, boolean pBrushesState) //calculate the points for weather
	{
		Weather weatherComponent = (Weather) pComponent; //cast the Weather class
		boolean rainState = weatherComponent.isRaining(); //get the status of rain
		if(rainState == true) //if equal to true
		{
			if(pBrushesState == false) //and the brushes are false
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
		}
	}
	
	public void calculatePointOnTime(FreeWayComponent pComponent, boolean pLightsState) //calculate the points for Time class
	{
		Time timeComponent = (Time) pComponent; // cast the time class
		boolean nightState = timeComponent.isNight(); //take the state of night
		boolean dayState = timeComponent.isDay(); //take the state of day
		if(nightState == true) //if night equal to true
		{
			if(pLightsState == false) //if the lights are off
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
		}
		else //if is day
		{
			if(pLightsState == true) //and lights are on 
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
		}
	}
	
	//calculate points on the Intersection class
	public void calculatePointOnIntersection(FreeWayComponent pComponent, boolean pMoveRight, boolean pMoveLeft, boolean pLeftDirectional, boolean pRightDiretional, int pVelocity)
	{
		Intersection intersectionComponent = (Intersection) pComponent; //cast the Intersection class
		boolean intersection = intersectionComponent.isIntersection(); //intersection status 
		boolean fourCorner = intersectionComponent.isFourCorner(); //four corners status
		boolean routerFinal = intersectionComponent.isFinal(); //final status
		if(intersection == true) //if intersection equal to true
		{
			if(pMoveRight == false && pMoveLeft == false) //if don't move left or right 
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
			else if(pMoveRight == false || pRightDiretional == false) //if right directional is off
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
			else if(pMoveLeft == false || pLeftDirectional == false) //if left directional is off
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
		}
		else if(fourCorner == true || routerFinal == true) //if is four corners or final
		{
			if(pVelocity > 0) //and velocity not equal to 0
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
		}
	}
	
	public void calculatePointOnVelocity(FreeWayComponent pComponent, int pVelocity) //calculate the velocity class
	{
		Velocity velocityObject = (Velocity) pComponent; //cast the velocity class
		int maximunSpeed = velocityObject.getMaximunSpeed(); //take the maximum speed
		int minimunSpeed = velocityObject.getMinimunSpeed(); //take the minimum speed
		if(maximunSpeed > INITIAL) //if maximum speed more than the initial constant
		{
			if(maximunSpeed <= pVelocity) //if the maximum speed less than the current speed
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
		}
		else
		{
			if(minimunSpeed >= pVelocity) //else if current speed less than minimum speed
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT; //lose points
			}
		}
	}
}
