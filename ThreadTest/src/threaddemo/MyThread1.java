/*This application demonstrates thread creation by extending Thread class & life cycle of a thread */
package threaddemo;
public class MyThread1 extends Thread
	{
		@Override
		public void run ()
			{
				System.out.println("Inside run");
			}

		public static void main (String[] args)
			{
				//new born - create object of thread
				MyThread1 t1 = new MyThread1();

				//ready - start thread - ready to execute but not running
				//CPU will control the thread
				t1.start();

				//start will call run implicitly
				//running - run method gets executed

				//dead - execution of run is over
			}
	}
