package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.DashElementType;
import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class SystemCar implements IObservable, IConstants
{
	private ArrayList<IObserver> Observers;
	
	public SystemCar() //constructor method
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
		for (Iterator<IObserver> it = Observers.iterator(); it.hasNext();) 
        {
            IObserver iObserver = it.next();
            iObserver.update();
        }		
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
	public void notifyObserver(FreeWayComponent pComponent) 
	{
	}
}
