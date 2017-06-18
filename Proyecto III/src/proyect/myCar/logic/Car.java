package proyect.myCar.logic;

import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObserver;

public class Car implements Runnable, IConstants
{
	private AbstractSystem coordinationSystemObject; //attribute of AbstracSystem type
	private AbstractSystem navigationSystemObject; //attribute of AbstracSystem type
	private int distance;
	
	public Car() //constructor method for the Car class
	{
		coordinationSystemObject = new CoordinationSystem();
		coordinationSystemObject.createCoordinationSystem();
		navigationSystemObject = new NavigationSystem();
		navigationSystemObject.createCoordinationSystem();
		distance = INITIAL;
	}
	
	public int getDistance() //get the distance
	{
		return this.distance; //return the distance
	}
	
	public void setDistance(int pDistance) //set the distance value
	{
		this.distance = pDistance;
	}
	
	public AbstractSystem getCoordinationSystemObject() //get the CoorditionalSystem object
	{
		return coordinationSystemObject;
	}
	
	public AbstractSystem getNavigationSystemObject() //get the NavigationSystem object
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
	
	public void addObserver(IObserver pObserver) //observer function
	{
		coordinationSystemObject.getDirection().addObserver(pObserver);
		coordinationSystemObject.getMotor().addObserver(pObserver);
		navigationSystemObject.getElectric().addObserver(pObserver);
		navigationSystemObject.getObstacles().addObserver(pObserver);
	}

	@Override
	public void run() //run the thread
	{
		int counter; //counter for the while
		int velocity; //velocity the car has
		Motor motor = (Motor) navigationSystemObject.getMotor(); //cast and create a new Motor object
		while(ALWAYS) //while true
		{
			if(motor.getSpeedState() == true) //if is speedUp
			{
				counter = INITIAL; //counter equal to initial (0)
				while(motor.getSpeedState() == true) //while true
				{
					if(counter <= TIME_TO_GET_MAXIMUN_SPEED) //if the velocity less than the maximum
					{
						velocity = motor.speedUp(counter); 	//velocity equals to the return function
						motor.setVelocity(velocity); //set the velocity to the motor object
						
						distance = (velocity * MILISECONDS_IN_A_SECONDS) + distance; //calculate the distance the car has travel
						int revolutions = (velocity / motor.getGear()) * ONE_HUNDRED; //calculate the revolutions
						motor.setRevolutions(revolutions); //set the revolutions in the Motor class
						try 
						{
							Thread.sleep(WAIT_SPEED); //do the sleep
						} 
						catch (InterruptedException e) 
						{
						}
						counter = counter + ONE_HUNDRED; //counter incress 100
					}
					else
					{
						break; //break the while
					}
				}
			}
			else //else do
			{
				counter = FINAL_COUNTER; //counter equal to 5 seconds
				while(motor.getSpeedState() == false) //if speed down
				{
					if(counter >= TIME_TO_GET_MINIMUN_SPEED) //if counter more that 0
					{
						velocity = motor.speedUp(counter); //velocity equals to the speedUp
						motor.setVelocity(velocity); //set the velocity
						
						distance = (velocity * MILISECONDS_IN_A_SECONDS) + distance; //calculate the distance

						int revolutions = (velocity / motor.getGear()) * ONE_HUNDRED; //calculate the revolutions
						motor.setRevolutions(revolutions); //set the revolutions
						try 
						{
							Thread.sleep(WAIT_SPEED); //do the sleep
						} 
						catch (InterruptedException e) 
						{
						}
						counter = counter - ONE_HUNDRED; //counter decress 
					}
					else
					{
						break; //do the break
					}
				}
			}
			break; //do the break to get out from the run
		}
	}
}
