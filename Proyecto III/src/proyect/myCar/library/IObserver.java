package proyect.myCar.library;

import proyect.myCar.logic.FreeWayComponent;

public interface IObserver 
{
	void update(FreeWayComponent pComponent);
	void update();
	void setObservable(IObservable pObservable);
	void setSecondObservable(IObservable pObservable);
	void update(DashElementType pType, int pState);
}