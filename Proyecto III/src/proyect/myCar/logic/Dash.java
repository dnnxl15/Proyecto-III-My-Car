package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class Dash implements IObservable
{
	private AbstractSystem coordinationObject;
	private AbstractSystem navigationObject;
	private ArrayList<IObserver> Observers;
	
	public Dash()
	{
		this.Observers = new ArrayList<IObserver>();
		
		this.coordinationObject = new CoordinationSystem();
		this.coordinationObject.createCoordinationSystem();
	
		this.navigationObject = new NavigationSystem();
		this.navigationObject.createNavigationSystem();
	}
	
	public AbstractSystem getCoordinationObject()
	{
		return this.coordinationObject;
	}
	
	
	public AbstractSystem getNaviggationObject()
	{
		return this.navigationObject;
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
	public void notifyObserver() 
	{
		for (Iterator<IObserver> Observer = Observers.iterator(); Observer.hasNext();) 
        {
            IObserver IObserver = Observer.next();
            IObserver.update();
        }		
	}
		
}
