package proyect.myCar.library;

public interface IObservable 
{
	void addObserver(IObserver pObserver);
	void removeObserver(IObserver pObserver);
	void notifyObserver();
}
