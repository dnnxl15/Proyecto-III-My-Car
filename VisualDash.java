package proyect.myCar.logic;

import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class VisualDash implements IObserver
{
	private IObservable Observable;
	
	@Override
	public void update() // This method update the interface 
	{
		
	}

	@Override
	public void setObervable(IObservable pObservable)
	{
		this.Observable = pObservable;
		this.Observable.addObserver(this);
	}
}
