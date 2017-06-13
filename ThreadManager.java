package proyect.myCar.logic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import proyect.myCar.library.IConstants;

public class ThreadManager implements IConstants
{
	private ExecutorService Executor;
	
	public ThreadManager()
	{
		this.Executor = Executors.newFixedThreadPool(MOUNT_OF_THREADS); 
	}
	
	public void executeThread()
	{
		
	}
}
