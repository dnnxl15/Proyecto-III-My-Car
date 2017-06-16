package proyect.myCar.library;

import proyect.myCar.logic.FreeWayComponent;

public interface IObservable 
{
	void addObserver(IObserver pObserver);
	void removeObserver(IObserver pObserver);
	void notifyObserver();
	void notifyObserver(FreeWayComponent pComponent);
	
	void notifyObserver(DashElementType pType, int pState);	
}