package threadtest;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thread.ExtendedThread;

public class ThreadTestRunner {
	static Logger logger=Logger.getLogger(ThreadTestRunner.class.getName());
	public static void main(String...args) {
	
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			logger.log(Level.INFO,"Enter problem number:");
		 choice=sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:	
		
		logger.log(Level.INFO,"Before starting the thread:");
		logger.log(Level.INFO,"Thread name is:"+Thread.currentThread().getName());
		logger.log(Level.INFO,"Thread Priority is:"+Thread.currentThread().getPriority());
		logger.log(Level.INFO,"Thread state is:"+Thread.currentThread().getState());
		ExtendedThread extThread=new ExtendedThread ();
		extThread.start();
		logger.log(Level.INFO,"After starting the thread:");
		break;
		case 2:
			logger.log(Level.INFO,"Before starting the thread:");
			logger.log(Level.INFO,"Thread name is:"+Thread.currentThread().getName());
			logger.log(Level.INFO,"Thread Priority is:"+Thread.currentThread().getPriority());
			logger.log(Level.INFO,"Thread state is:"+Thread.currentThread().getState());
			RunnableThread runThread=new RunnableThread ();
			Thread thread=new Thread(runThread);
			thread.start();
			logger.log(Level.INFO,"After starting the thread:");
			break;
		case 3:
			ExtendedThread extendedThread=new ExtendedThread ();
			RunnableThread runnableThread=new RunnableThread ();
			logger.log(Level.INFO,"Before starting the thread:");
			logger.log(Level.INFO,"Thread name is:"+Thread.currentThread().getName());
			logger.log(Level.INFO,"Thread Priority is:"+Thread.currentThread().getPriority());
			logger.log(Level.INFO,"Thread state is:"+Thread.currentThread().getState());
			extendedThread.start();
			Thread thread1=new Thread(runnableThread);
			thread1.start();
			logger.log(Level.INFO,"After starting the thread:");
			break;
		case 4:
			ExtendedThread extendThread1=new ExtendedThread (30000);
			ExtendedThread extendThread2=new ExtendedThread (30000);
			ExtendedThread extendThread3=new ExtendedThread (30000);
			ExtendedThread extendThread4=new ExtendedThread (30000);
			ExtendedThread extendThread5=new ExtendedThread (30000);
			RunnableThread runnThread1=new RunnableThread (30000);
			RunnableThread runnThread2=new RunnableThread (30000);
			RunnableThread runnThread3=new RunnableThread (30000);
			RunnableThread runnThread4=new RunnableThread (30000);
			RunnableThread runnThread5=new RunnableThread (30000);
			Thread threads1=new Thread(runnThread1);
			Thread threads2=new Thread(runnThread2);
			Thread threads3=new Thread(runnThread3);
			Thread threads4=new Thread(runnThread4);
			Thread threads5=new Thread(runnThread5);
			extendThread1.setName("extendThread1");
			extendThread2.setName("extendThread2");
			extendThread3.setName("extendThread3");
			extendThread4.setName("extendThread4");
			extendThread5.setName("extendThread5");
			threads1.setName("runnThread1");
			threads2.setName("runnThread2");
			threads3.setName("runnThread3");
			threads4.setName("runnThread4");
			threads5.setName("runnThread5");
			extendThread1.start();
			extendThread2.start();
			extendThread3.start();
			extendThread4.start();
			extendThread5.start();
			threads1.start();
			threads2.start();
			threads3.start();
			threads4.start();
			threads5.start();
		/*	try {
	            Thread.sleep(15000); 
	        } catch (InterruptedException e) {
	        	logger.log(Level.SEVERE,"An error occured",e);
	        }*/
	       
		        for (int i = 0; i <3; i++) {
		            try {
		                Thread.sleep(10000); 
		            } catch (InterruptedException e) {
		            	logger.log(Level.SEVERE,"An error occured",e);
		            }
		            logger.log(Level.INFO,"Thread dump " + (i + 1) + ":");
		          /*  Map<Thread, StackTraceElement[]> threadMap = Thread.getAllStackTraces();
		        	for (Map.Entry<Thread, StackTraceElement[]> entry : threadMap.entrySet()) {
		        	    Thread threads = entry.getKey();
		        	    StackTraceElement[] stackTraceElements = entry.getValue();
		        	    
		        	    logger.log(Level.INFO,"Thread name: " + threads.getName() + ", State: " + threads.getState());
		        	    for (StackTraceElement stackTraceElement : stackTraceElements) {
		        	    	logger.log(Level.INFO,"\t" + stackTraceElement.toString());
		        	    }
		        	    System.out.println();
		        	}*/
		            printThreadDump();
		        }
		    	try {
		    		extendThread1.stopRunning();
					Thread.sleep(6000);
					extendThread2.stopRunning();
					Thread.sleep(6000);
					extendThread3.stopRunning();
					Thread.sleep(6000);
					extendThread4.stopRunning();
					Thread.sleep(6000);
					extendThread5.stopRunning();
					Thread.sleep(6000);
					runnThread1.stopRunning();
					Thread.sleep(6000);
					runnThread2.stopRunning();
					Thread.sleep(6000);
					runnThread3.stopRunning();
					Thread.sleep(6000);
					runnThread4.stopRunning();
					Thread.sleep(6000);
					runnThread5.stopRunning(); 
					Thread.sleep(6000);
		
			} catch (InterruptedException e) {
				logger.log(Level.SEVERE,"An error occured",e);
			} 
			if(threads1.isAlive() || threads2.isAlive() || threads3.isAlive() || threads4.isAlive() || threads5.isAlive()
					|| extendThread1.isAlive()|| extendThread2.isAlive() || extendThread3.isAlive() || extendThread4.isAlive()||
					extendThread5.isAlive()) {
				logger.log(Level.INFO,"Still Alive");
			}
			else {
				logger.log(Level.INFO,"Task completed.");
			}
			break;

		}
}while(choice<=4 || choice>=1);
		sc.close();
	}
	private static  void printThreadDump() {
	     ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
	        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(true, true);
	        for (ThreadInfo info : threadInfos) {
	        	logger.log(Level.INFO,info.toString());
	        }
	    }
	



	
}
