package proyect.myCar.logic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import proyect.myCar.library.IConstants;

public class ThreadManager implements IConstants
{
	private static ThreadManager Instance; //instance
	private ExecutorService Executor;
	
	private ThreadManager() //constructor method
	{
		this.Executor = Executors.newFixedThreadPool(MOUNT_OF_THREADS); 
	}
	
	public synchronized static ThreadManager getInstance()
	{
		if (Instance==null)
		{
			Instance = new ThreadManager();
		}
		return Instance;
	}
	
	public void executeThread(Runnable pThread)
	{
		this.Executor.execute(pThread);
	}
	
	public void shutdownThreads()
	{
		this.Executor.shutdown();
	}
	
	public boolean isTerminated()
	{
		return this.Executor.isTerminated();
	}
}

