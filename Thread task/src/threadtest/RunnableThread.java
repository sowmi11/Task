package threadtest;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableThread implements Runnable{
	 Logger logger=Logger.getLogger(RunnableThread .class.getName());
	 private boolean running=true;

	  private long sleepTime;
	  public void stopRunning() {
		 running=false;
	  }
	  public RunnableThread() {
	    }

	    public RunnableThread(long millis) {

	        sleepTime=millis;
	    }
	public void run() {
		/*logger.log(Level.INFO,"Thread name is:"+Thread.currentThread().getName());
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

