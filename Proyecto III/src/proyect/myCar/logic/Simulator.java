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
	private Dash dashObject;
	private FreeWay freeWayObject;
	private Car carObject;
	private MyCar userInterface; //Interface
	private BrushesPanel brushesPanelObject; //Interface
	private Evaluator evaluatorObject;
	private ArrayList<IObserver> Observers;
	
	private ArrayList<FreeWayComponent> componentFreeWay;
	
	public Simulator()
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
	
	public void setFreeWayComponent(String pFile)
	{
		this.freeWayObject.loadFreeComponent(pFile);
		this.componentFreeWay = this.freeWayObject.getComponentList();
	}
	
	public Car getCar()
	{
		return carObject;
	}
	
	public void startThread()
	{
		ThreadManager managerThreadObject = ThreadManager.getInstance();
		managerThreadObject.executeThread(carObject);
		managerThreadObject.executeThread(this);
		managerThreadObject.executeThread(brushesPanelObject);
	}

	@Override
	public void run() 
	{
		int counter = INITIAL; // Inicializarlo a cero
		int distance = INITIAL; // Inicializarlo a cero
		while(componentFreeWay.size() > counter) // mientras que la lista sea mayor que el contador
		{ 
			FreeWayComponent component = componentFreeWay.get(counter); // componente de la carretera
			if(component.getIdentifier() == FreeWayComponentType.WEATHER)
			{
				Electric brushes = (Electric) carObject.getNavigationSystemObject().getElectric();
				boolean brushesState = brushes.getBrushes(); // Parabrisas encendido?
				evaluatorObject.calculatePointsOnWeather(component, brushesState); // evaluador evalua
				notifyObserver(component);
				counter++;
			}
			else if(component.getIdentifier() == FreeWayComponentType.TIME)
			{
				Electric lights = (Electric) carObject.getNavigationSystemObject().getElectric();
				boolean lightsState = lights.getLights();
				evaluatorObject.calculatePointOnTime(component, lightsState);
				notifyObserver(component);
				counter++;
			}
			else if(component.getIdentifier() == FreeWayComponentType.DISTANCE)
			{
				Distance metersDistance = (Distance) component;
				if(distance > carObject.getDistance())// si la distancia es mayor que lo que lleva el carro recoriendo
				{
					notifyObserver(component);
					continue;
				}
				else
				{
					distance = distance + metersDistance.getMeter();
					notifyObserver(component);
					counter++;
				}
			}
			else if(component.getIdentifier() == FreeWayComponentType.INTERSECTION)
			{
				Direction direction = (Direction) carObject.getCoordinationSystemObject().getDirection();
				boolean LeftMove = direction.isMoveLeft();
				boolean RightMove = direction.isMoveRight();
				Electric  electric = (Electric) carObject.getNavigationSystemObject().getElectric();
				boolean LightRight = electric.getRightDirectional();
				boolean LightLeft = electric.getLeftDirectional();
				Motor motorObject = (Motor) carObject.getNavigationSystemObject().getMotor();
				int velocity = motorObject.getVelocity();
				evaluatorObject.calculatePointOnIntersection(component, RightMove, LeftMove, LightLeft, LightRight, velocity);
				notifyObserver(component);
				counter++;
			}
			else if(component.getIdentifier() == FreeWayComponentType.VELOCITY)
			{
				Motor motorObject = (Motor) carObject.getNavigationSystemObject().getMotor();
				int velocity = motorObject.getVelocity();
				evaluatorObject.calculatePointOnVelocity(component, velocity);
				notifyObserver(component);
				counter++;
			}
			try 
			{
				Thread.sleep(WAIT_THREADS);
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