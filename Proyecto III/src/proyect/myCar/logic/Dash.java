package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class Dash implements IObservable
{
	private ArrayList<IObserver> Observers;
	
	public Dash()
	{
		this.Observers = new ArrayList<IObserver>();
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
