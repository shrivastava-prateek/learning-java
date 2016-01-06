package util;
import java.util.*;
		public abstract class Instructor
			{
				int id;
				String name;
				public Instructor(){}
				public int getId() {
						return id;
					}
				public void setId(int id) {
						this.id = id;
					}
				public String getName() {
						return name;
					}
				public void setName(String name) {
						this.name = name;
					}
				public int getSessions() {
						return sessions;
					}
				public void setSessions(int sessions) {
						this.sessions = sessions;
					}
				int sessions;

				public Instructor(int id,String name)
					{
						this.id=id;
						this.name=name;
					}
				public abstract ArrayList<String> getModules();
			}

