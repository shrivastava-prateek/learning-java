import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Test {
	private static void printFile() {
		InputStream stream = null;
		try{
			stream = new FileInputStream("read.txt");
			int data;
			while((data= stream.read()) != -1){
				System.out.println((char)data);
			}
		} catch(IOException e){
			e.printStackTrace();
		}finally{
			if(stream != null){
				try {
						stream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
	}
	
	public static void main(String[] args) {
		
			Test.printFile();
		
	}
}
