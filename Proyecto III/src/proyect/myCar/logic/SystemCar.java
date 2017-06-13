package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class SystemCar implements IObservable
{
	public static Object out;
	private ArrayList<IObserver> Observers;

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
            IObserver IObserver = it.next();
            IObserver.update();
        }
	}

}
