package proyect.myCar.logic;

// Class Velocity

public class Velocity extends FreeWayComponent
{
	private int VelocityMinimum;
	private int VelocityMaximun;

	public Velocity()
	{
		setVelocityMinimum(0);
		setVelocityMaximun(0);
	}

	public int getVelocityMaximun() 
	{
		return VelocityMaximun;
	}

	public void setVelocityMaximun(int pVelocityMaximun)
	{
		VelocityMaximun = pVelocityMaximun;
	}

	public int getVelocityMinimum() 
	{
		return VelocityMinimum;
	}

	public void setVelocityMinimum(int pVelocityMinimum) 
	{
		VelocityMinimum = pVelocityMinimum;
	}
	
	public boolean isVelocityMaximun()
	{
		if(VelocityMaximun != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isVelocityMinimun()
	{
		if(VelocityMinimum != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
