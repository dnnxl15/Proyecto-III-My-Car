package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.DashElementType;
import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class Dash implements IObserver, IConstants, IObservable
{
	private int velocity;
	private int gear;
	private boolean lights;
	private boolean leftDirectional;
	private boolean rightDirectional;
	private boolean brushes;
	private IObservable Observable;
	
	// To apply IObservable
	private ArrayList<IObserver> Observers;
	
	public Dash()
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
		if(pType == DashElementType.BRUSHES)
		{
			if(pState == ON)
			{
				this.brushes = true;
				notifyObserver(DashElementType.BRUSHES, ON);
			}
			else
			{
				this.brushes = false;
				notifyObserver(DashElementType.BRUSHES, OFF);
			}
		}
		else if(pType == DashElementType.GEAR)
		{
			this.gear = pState;
			notifyObserver(DashElementType.GEAR, pState);
		}
		else if(pType == DashElementType.LIGHTS)
		{
			if(pState == ON)
			{
				this.lights = true;
				notifyObserver(DashElementType.LIGHTS, ON);
			}
			else
			{
				this.lights = false;
				notifyObserver(DashElementType.LIGHTS, OFF);
			}
		}
		else if(pType == DashElementType.LIGHTS_LEFT)
		{
			if(pState == ON)
			{
				this.leftDirectional = true;
				notifyObserver(DashElementType.LIGHTS_LEFT, ON);
			}
			else
			{
				this.leftDirectional = false;
				notifyObserver(DashElementType.LIGHTS_LEFT, OFF);
			}
		}
		else if(pType == DashElementType.LIGHTS_RIGHT)
		{
			if(pState == ON)
			{
				this.rightDirectional = true;
				notifyObserver(DashElementType.LIGHTS_RIGHT, ON);
			}
			else
			{
				this.rightDirectional = false;
				notifyObserver(DashElementType.LIGHTS_RIGHT, OFF);
			}
		}
		else 
		{
			this.velocity = pState;
			notifyObserver(DashElementType.VELOCITY, pState);
		}
	}

	// I didn't use
	
	@Override
	public void update(FreeWayComponent pComponent) 
	{
		// TODO Auto-generated method stub
	}
	
	// I didn't use
	
	@Override
	public void update() 
	{
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

	// I didn't use
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
	}

	// I didn't use

	@Override
	public void notifyObserver(FreeWayComponent pComponent) {
		// TODO Auto-generated method stub
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
}