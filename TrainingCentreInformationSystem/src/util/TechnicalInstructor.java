package util;
import java.util.*;

public class TechnicalInstructor extends Instructor
	{
		String streamCode;
		public TechnicalInstructor()
			{super();}
		public TechnicalInstructor(int id,String name,String streamCode)
			{
				super(id,name);
				this.streamCode=streamCode;
			}
		public String getStreamCode()
			{
				return streamCode;
			}
		public void setStreamCode(String streamCode)
			{
				this.streamCode=streamCode;
			}
		public ArrayList<String> getModules()
			{
				ArrayList<String> m=new ArrayList<String>();
				m.add("Application Understanding");
				m.add("User Interface");
				m.add("Problem Solving");
				m.add("Information Management");
				if(this.streamCode.equalsIgnoreCase("J2EE")||this.streamCode.equalsIgnoreCase("DOTNET")){
					m.add("Web site Development");
				}
				return m;
			}

	}
