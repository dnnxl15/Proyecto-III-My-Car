package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.DashElementType;
import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class Dash implements IObserver, IConstants, IObservable
{
	private int velocity; //attribute for the velocity
	private int gear; //attribute for the gear
	private boolean lights; //attribute for the lights
	private boolean leftDirectional; //attribute for the left directional
	private boolean rightDirectional; //attribute for the right directional
	private boolean brushes; //attribute for the brushes
	private IObservable Observable; 
	
	// To apply IObservable
	private ArrayList<IObserver> Observers;
	
	public Dash() //constructor method for the Dash class
	{
		this.velocity = 0;
		this.gear = 0;
		this.lights = false;
		this.leftDirectional = false;
		this.rightDirectional = false;
		this.Observers = new ArrayList<IObserver>();
	}

	@Override
	public void setObservable(IObservable pObservable) 
	{
		this.Observable = pObservable;
		this.Observable.addObserver(this);
	}

	@Override
	public void update(DashElementType pType, int pState)
	{
		if(pType == DashElementType.BRUSHES) //if the type is brushes
		{
			if(pState == ON) //if are on
			{
				this.brushes = true; //brushes equal true
				notifyObserver(DashElementType.BRUSHES, ON); //notify the observer
			}
			else
			{
				this.brushes = false; //if is off
				notifyObserver(DashElementType.BRUSHES, OFF); //notify the observer
			}
		}
		else if(pType == DashElementType.GEAR) //if the type is gear
		{
			this.gear = pState; //the gear equals to pState
			notifyObserver(DashElementType.GEAR, pState); //notify the observer
		}
		else if(pType == DashElementType.LIGHTS) //if the type are lights
		{
			if(pState == ON) //if lights are on
			{
				this.lights = true; //set lights as true
				notifyObserver(DashElementType.LIGHTS, ON); //notify the observer
			}
			else
			{
				this.lights = false; //else set as false
				notifyObserver(DashElementType.LIGHTS, OFF); //notify the observer
			}
		}
		else if(pType == DashElementType.LIGHTS_LEFT) //if the type is left directional
		{
			if(pState == ON) //if the left directional is on
			{
				this.leftDirectional = true; //set as ture
				notifyObserver(DashElementType.LIGHTS_LEFT, ON); //notify the observer
			}
			else
			{
				this.leftDirectional = false; //if are off set as false
				notifyObserver(DashElementType.LIGHTS_LEFT, OFF); //notify the observer
			}
		}
		else if(pType == DashElementType.LIGHTS_RIGHT) //if the type is right directional
		{
			if(pState == ON) //if the right directional is on
			{
				this.rightDirectional = true; //set the right directional as true
				notifyObserver(DashElementType.LIGHTS_RIGHT, ON); //notify the observer
			}
			else
			{
				this.rightDirectional = false; //else set as false
				notifyObserver(DashElementType.LIGHTS_RIGHT, OFF); //notify the observer
			}
		}
		else //else is velocity type
		{
			this.velocity = pState; //equal the velocity
			notifyObserver(DashElementType.VELOCITY, pState); //notify the observer
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
	public void notifyObserver(DashElementType pType, int pState) 
	{
		for (Iterator<IObserver> it = Observers.iterator(); it.hasNext();) 
        {
            IObserver iObserver = it.next();
            iObserver.update(pType, pState);
        }		
	}

	@Override
	public void setSecondObservable(IObservable pObservable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver(FreeWayComponent pComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FreeWayComponent pComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}