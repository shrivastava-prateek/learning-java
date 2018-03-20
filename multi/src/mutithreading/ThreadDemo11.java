package mutithreading;

public class ThreadDemo11 extends Thread {
	public ThreadDemo11(String name) {
		super(name);
	}
@Override
public void run(){
	for (int i = 0; i <10; i++) {
	//3.Running State - execution of thread
	System.out.println(getName()+" : "+i);
	}
}
//4.dead state - thread execution is completed

	public static void main(String[] args) {
		
       //1.New born - thread object is created
		ThreadDemo11 t1=new ThreadDemo11("ONE");
		ThreadDemo11 t2=new ThreadDemo11("TWO");
		ThreadDemo11 t3= new ThreadDemo11("THREE");
		
		//2.Ready state -  ready to run
		t1.start();
		t2.start();
		t3.start();
		/*for (int i = 0; i < 10; i++) {
			System.out.println("Main thread : "+i);
			}
			*/
			
		}	
			
	}


