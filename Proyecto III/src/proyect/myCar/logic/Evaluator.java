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
	
	public void calculatePointsOnWeather(FreeWayComponent pComponent, boolean pBrushesState)
	{
		Weather weatherComponent = (Weather) pComponent;
		boolean rainState = weatherComponent.isRaining();
		if(rainState == true)
		{
			if(pBrushesState == false)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
		}
	}
	
	public void calculatePointOnTime(FreeWayComponent pComponent, boolean pLightsState)
	{
		Time timeComponent = (Time) pComponent;
		boolean nightState = timeComponent.isNight();
		boolean dayState = timeComponent.isDay();
		if(nightState == true)
		{
			if(pLightsState == false)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
		}
		else 
		{
			if(pLightsState == true)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
		}
	}
	
	public void calculatePointOnIntersection(FreeWayComponent pComponent, boolean pMoveRight, boolean pMoveLeft, boolean pLeftDirectional, boolean pRightDiretional, int pVelocity)
	{
		Intersection intersectionComponent = (Intersection) pComponent;
		boolean intersection = intersectionComponent.isIntersection();
		boolean fourCorner = intersectionComponent.isFourCorner();
		boolean routerFinal = intersectionComponent.isFinal();
		if(intersection == true)
		{
			if(pMoveRight == false && pMoveLeft == false)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
			else if(pMoveRight == false || pRightDiretional == false)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
			else if(pMoveLeft == false || pLeftDirectional == false)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
		}
		else if(fourCorner == true || routerFinal == true) 
		{
			if(pVelocity > 0)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
		}
	}
	
	public void calculatePointOnVelocity(FreeWayComponent pComponent, int pVelocity)
	{
		Velocity velocityObject = (Velocity) pComponent;
		int maximunSpeed = velocityObject.getMaximunSpeed();
		int minimunSpeed = velocityObject.getMinimunSpeed();
		if(maximunSpeed > INITIAL)
		{
			if(maximunSpeed <= pVelocity)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
		}
		else
		{
			if(minimunSpeed >= pVelocity)
			{
				this.scorePoints = this.scorePoints - POINTS_LOSE_BY_FAULT;
			}
		}
	}
}