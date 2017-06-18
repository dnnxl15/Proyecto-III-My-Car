package proyect.myCar.logic;

import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObserver;

public class Car implements Runnable, IConstants
{
	private AbstractSystem coordinationSystemObject; //attribute of AbstracSystem type
	private AbstractSystem navigationSystemObject; //attribute of AbstracSystem type
	private int distance;
	
	public Car()
	{
		coordinationSystemObject = new CoordinationSystem();
		coordinationSystemObject.createCoordinationSystem();
		navigationSystemObject = new NavigationSystem();
		navigationSystemObject.createCoordinationSystem();
		distance = INITIAL;
	}
	
	public int getDistance()
	{
		return this.distance;
	}
	
	public void setDistance(int pDistance)
	{
		this.distance = pDistance;
	}
	
	public AbstractSystem getCoordinationSystemObject()
	{
		return coordinationSystemObject;
	}
	
	public AbstractSystem getNavigationSystemObject()
	{
		return navigationSystemObject;
	}
	
	public void turnOnLights() //function to turn on the light of the car
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnLights(); //call the function that turn on the lights
	}
	
	public void turnOffLights() //function to turn off the lights of the car
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffLights(); //call the function that turn off the lights 
	}
	
	public void turnOnLeftDirectional() //turn on the left directional 
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnLeftDirectional(); //call the function that turn on the left directional
	}
	
	public void turnOffLeftDirectionl() //turn off the left directional
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffLeftDirectional(); //call the function that turn off the left directional
	}
	
	public void turnOnRightDirectional() //turn on the right directional
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnRightDirectional(); //call the function that turn on the right directional
	}
	
	public void turnOffRightDirectional() //turn off the right directional
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffRightDirectional(); //call the function that turn off the right directional
	}
	
	public void turnOnBrushes() //turn on the brushes
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnBrushes(); //call the function that turn on the brushes
	}
	
	public void turnOffBrushes() //turn off the brushes
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffBrushes(); //call the function that turn off the brushes
	}
	
	public void addObserver(IObserver pObserver)
	{
		coordinationSystemObject.getDirection().addObserver(pObserver);
		coordinationSystemObject.getMotor().addObserver(pObserver);
		navigationSystemObject.getElectric().addObserver(pObserver);
		navigationSystemObject.getObstacles().addObserver(pObserver);
	}

	@Override
	public void run() 
	{
		int counter;
		int velocity;
		Motor motor = (Motor) navigationSystemObject.getMotor();
		while(ALWAYS)
		{
			if(motor.getSpeedState() == true)
			{
				counter = INITIAL;
				while(motor.getSpeedState() == true)
				{
					if(counter <= TIME_TO_GET_MAXIMUN_SPEED)
					{
						velocity = motor.speedUp(counter); 		
						motor.setVelocity(velocity);	
						
						distance = (velocity * MILISECONDS_IN_A_SECONDS) + distance;
						int revolutions = (velocity / motor.getGear()) * ONE_HUNDRED;
						motor.setRevolutions(revolutions);
						try 
						{
							Thread.sleep(WAIT_SPEED);
						} 
						catch (InterruptedException e) 
						{
						}
						counter = counter + ONE_HUNDRED;
					}
					else
					{
						break;
					}
				}
			}
			else
			{
				counter = FINAL_COUNTER;
				while(motor.getSpeedState() == false)
				{
					if(counter >= TIME_TO_GET_MINIMUN_SPEED)
					{
						velocity = motor.speedUp(counter); 		
						motor.setVelocity(velocity);
						
						distance = (velocity * MILISECONDS_IN_A_SECONDS) + distance;

						int revolutions = (velocity / motor.getGear()) * ONE_HUNDRED;
						motor.setRevolutions(revolutions);
						try 
						{
							Thread.sleep(WAIT_SPEED);
						} 
						catch (InterruptedException e) 
						{
						}
						counter = counter - ONE_HUNDRED;
					}
					else
					{
						break;
					}
				}
			}
			break;
		}
	}
}