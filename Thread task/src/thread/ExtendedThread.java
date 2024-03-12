package thread;

//import java.util.logging.Level;
import java.util.logging.Logger;


public class ExtendedThread extends  Thread  {
	 Logger logger=Logger.getLogger(ExtendedThread.class.getName());
	 private boolean running=true;
	  private long sleepTime;
	  public void stopRunning() {
		  running=false;
	  }
	  public ExtendedThread() {
	    }

	    public ExtendedThread(long millis) {
	        sleepTime=millis;
	    }
	public void run() {
		/*logger.log(Level.INFO,"Thread name is:"+getName());
		logger.log(Level.INFO,"Thread Priority is:"+Thread.currentThread().getPriority());
		logger.log(Level.INFO,"Thread state is:"+Thread.currentThread().getState());*/
		while(running) {
			System.out.println("Going to sleep");
		//logger.log(Level.INFO,"Going to sleep..");
//		try {
//			Thread.sleep(sleepTime);
//		} catch (InterruptedException e) {
//			logger.log(Level.SEVERE,"An error occured",e);
//		}
		//System.out.println("After sleeping:");

		}
		}
}

