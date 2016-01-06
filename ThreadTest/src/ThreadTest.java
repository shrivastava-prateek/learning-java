public class ThreadTest
	{
		public static void main (String[] args)
			{
				System.out.println(Thread.currentThread().getName());
				Threading th=new Threading();
				Thread t= new Thread(th);
				t.setName("1st thread");
				t.start();
				try
					{Thread.sleep(2000);
					}
				catch(InterruptedException e)
					{}
				System.out.println(Thread.currentThread().getName());
			}
	}
