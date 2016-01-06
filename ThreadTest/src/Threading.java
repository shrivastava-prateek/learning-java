public class Threading implements Runnable
	{
		public Threading ()
			{
				System.out.println(Thread.currentThread().getName());
			}

		@Override
		public void run ()
			{
				System.out.println("Run by a " + Thread.currentThread().getName());
			}

	}
