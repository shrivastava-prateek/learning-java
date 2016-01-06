package bean;
import java.util.*;

public class Stream
{
	String streamCode;
	ArrayList<String> subjects=new ArrayList<String>();
	
	public Stream(String streamCode)
	{
		this.streamCode=streamCode;
	}
	
	public String getStreamCode() {
		return streamCode;
	}
	public void setStreamCode(String streamCode) {
		this.streamCode = streamCode;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	
	
	
}

