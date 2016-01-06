/* This is the resource shared by multiple threads*/
package synchronization;
public class Resource {
	public synchronized void printMsg(String msg){
		System.out.print("[ "+ msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ]");
	}
}
