package bean;
import java.util.*;

public class Movie
	{
		Type type;
		String title;
		int year;
		Genre genre;
		String actor;
		String actress;
		String Director;

		public void setType(Type type)
			{
				this.type=type;
			}

		public Type getType()
			{
				return type;
			}

		public void setTitle(String title)
			{
				this.title=title;
			}

		public String getTitle()
			{
				return title;
			}

		public void setYear(int year)
			{
				this.year=year;
			}

		public int getYear()
			{
				return year;
			}

		public void setGenre(Genre genre)
			{
				this.genre=genre;
			}

		public Genre getGenre()
			{
				return genre;
			}

		public void setActor(String actor)
			{
				this.actor=actor;
			}

		public String getActor()
			{
				return actor;
			}

		public void setActress(String actress)
			{
				this.actress=actress;
			}

		public String getActress()
			{
				return actress;
			}

		public void setDirector(String director)
			{
				Director=director;
			}

		public String getDirector()
			{
				return Director;
			}


		
	}
