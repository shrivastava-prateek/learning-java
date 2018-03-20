import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResource {
	private static void printFile() {

	    try(FileInputStream input = new FileInputStream("read.txt");
	    		Scanner sc = new Scanner(System.in)){

	        int data;
	        while((data = input.read()) != -1){
	            System.out.print((char) data);
	        }
	    }catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		printFile();
	}

}
