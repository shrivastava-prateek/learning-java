package util;
import java.util.*;

public class SoftSkillsInstructor extends Instructor
{
	public SoftSkillsInstructor(){super();}
	public SoftSkillsInstructor(int id,String name)
	{
		super(id,name);
	}
	public ArrayList<String> getModules()
	{
		ArrayList<String> m=new ArrayList<String>();
		m.add("Communication");
		m.add("Presentation");
		m.add("Writing");
		m.add("Professional");
		return m;
	}
	

}
