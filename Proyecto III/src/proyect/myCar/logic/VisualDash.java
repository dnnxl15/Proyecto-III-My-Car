package proyect.myCar.logic;

import proyect.myCar.library.DashElementType;
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
	public void setObservable(IObservable pObservable)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FreeWayComponent pComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSecondObservable(IObservable pObservable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DashElementType pType, int pState) {
		// TODO Auto-generated method stub
		
	}
}
