package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.DashElementType;
import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;
import proyect.myCar.userInterface.BrushesPanel;
import proyect.myCar.userInterface.MyCar;

public class Simulator implements Runnable, IConstants, IObservable
{
	private Dash dashObject; //attribute of the Dash type
	private FreeWay freeWayObject; //attribute of the Freeway type
	private Car carObject; //attribute of the car type
	private MyCar userInterface; //Interface
	private BrushesPanel brushesPanelObject; //Interface
	private Evaluator evaluatorObject; //attribute of the Evaluator type
	private ArrayList<IObserver> Observers; 
	
	private ArrayList<FreeWayComponent> componentFreeWay;
	
	public Simulator() //constructor method of the Simulator class
	{
		dashObject = new Dash();
		freeWayObject = new FreeWay();
		carObject = new Car();
		userInterface = MyCar.getInstance();
		userInterface.setObservable(this);
		carObject.addObserver(dashObject);
		userInterface.setSecondObservable(dashObject);
		evaluatorObject = new Evaluator();
		brushesPanelObject = new BrushesPanel();
		componentFreeWay = new ArrayList<FreeWayComponent>();
		Observers = new ArrayList<IObserver>();
	}
	
	public void setFreeWayComponent(String pFile) //set the freeWayComponent
	{
		this.freeWayObject.loadFreeComponent(pFile);
		this.componentFreeWay = this.freeWayObject.getComponentList();
	}
	
	public Car getCar() //get car
	{
		return carObject; //returning a car object
	}
	
	public void startThread() //start the thread
	{
		ThreadManager managerThreadObject = ThreadManager.getInstance(); //get the instance
		managerThreadObject.executeThread(carObject); //execute the thread
		managerThreadObject.executeThread(this); //execute the thread
		managerThreadObject.executeThread(brushesPanelObject); //execute the thread
	}

	@Override
	public void run() //run the thread
	{
		int counter = INITIAL; // equal to zero
		int distance = INITIAL; // equal to zer
		while(componentFreeWay.size() > counter) // while counter less than the size
		{ 
			FreeWayComponent component = componentFreeWay.get(counter); // road component
			if(component.getIdentifier() == FreeWayComponentType.WEATHER) //if is a weather component
			{
				Electric brushes = (Electric) carObject.getNavigationSystemObject().getElectric(); //cast the electric class
				boolean brushesState = brushes.getBrushes(); // ask for the brushes status
				evaluatorObject.calculatePointsOnWeather(component, brushesState); // evaluate the weather component
				notifyObserver(component);
				counter++;
			}
			else if(component.getIdentifier() == FreeWayComponentType.TIME) //if is a time component
			{
				Electric lights = (Electric) carObject.getNavigationSystemObject().getElectric(); //cast the electric class
				boolean lightsState = lights.getLights(); //get lights status
				evaluatorObject.calculatePointOnTime(component, lightsState); //calculate points
				notifyObserver(component); //notify the observer
				counter++;
			}
			else if(component.getIdentifier() == FreeWayComponentType.DISTANCE) //if is a distance component 
			{
				Distance metersDistance = (Distance) component; //cast the Distance class
				if(distance > carObject.getDistance())// if the distas is more than the distance that the car has travel
				{
					notifyObserver(component); //notify the observer
					continue;
				}
				else
				{
					distance = distance + metersDistance.getMeter(); //get the meters
					notifyObserver(component); //notify the observer
					counter++;
				}
			}
			else if(component.getIdentifier() == FreeWayComponentType.INTERSECTION) //if is a intersection component
			{
				Direction direction = (Direction) carObject.getCoordinationSystemObject().getDirection(); //cast the direction
				boolean LeftMove = direction.isMoveLeft(); //ask for moving left
				boolean RightMove = direction.isMoveRight(); //ask for moving right
				Electric  electric = (Electric) carObject.getNavigationSystemObject().getElectric(); //cast the electric
				boolean LightRight = electric.getRightDirectional(); //get the right directional status
				boolean LightLeft = electric.getLeftDirectional(); //get the left directional status
				Motor motorObject = (Motor) carObject.getNavigationSystemObject().getMotor(); //cast the motor class
				int velocity = motorObject.getVelocity(); //get the velocity
				evaluatorObject.calculatePointOnIntersection(component, RightMove, LeftMove, LightLeft, LightRight, velocity); //do the evaluation
				notifyObserver(component); //notify the observer
				counter++;
			}
			else if(component.getIdentifier() == FreeWayComponentType.VELOCITY) //if is a velocity component
			{
				Motor motorObject = (Motor) carObject.getNavigationSystemObject().getMotor(); //cast the Motor class
				int velocity = motorObject.getVelocity(); //get the velocity value
				evaluatorObject.calculatePointOnVelocity(component, velocity); //calculate points
				notifyObserver(component); //notify the observer
				counter++;
			}
			try 
			{
				Thread.sleep(WAIT_THREADS); //do the sleep
			}
			catch (InterruptedException e) 
			{
			}
		}
	}

	@Override
	public void addObserver(IObserver pObserver) 
	{
		this.Observers.add(pObserver);
	}

	@Override
	public void removeObserver(IObserver pObserver) 
	{
		this.Observers.remove(pObserver);
	}

	@Override
	public void notifyObserver(FreeWayComponent pComponent) 
	{
		for (Iterator<IObserver> it = Observers.iterator(); it.hasNext();) 
        {
            IObserver IObserver = it.next();
            IObserver.update(pComponent);
        }
	}

	@Override
	public void notifyObserver(DashElementType pType, int pState) 
	{		
	}
	
	@Override
	public void notifyObserver()
	{		
	}
}
