package com.util;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Random;
import com.bean.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

// Override and implement all the methods of DataManager Interface here
public class DataManagerImpl implements DataManager
	{

		@Override
		public List<Question> populateData()
			{
				Connection con=null;
				Statement st=null;
				DatabaseConnectionManager dcm=new DatabaseConnectionManager();
				List<Question> ques=new ArrayList<>();
				try
					{
						con=dcm.getConnection();
						st=con.createStatement();
					}
				catch(ClassNotFoundException e)
					{System.out.println(e);}
				catch(SQLException e)
					{System.out.println(e);}
				try
					{
						ResultSet rs=st.executeQuery("SELECT * FROM questionBank");
						while(rs.next())
							{
								Question q=new Question(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
									rs.getString(5),rs.getString(6),rs.getString(7),Category.valueOf(rs.getString(8)),
									Complexity.valueOf(rs.getString(9)));
								ques.add(q);
								q=null;

							}
					}
				catch(SQLException e)
					{System.out.println(e);}
				if(con!=null)
					{
						try
							{
								dcm.closeConnection();
							}
						catch(SQLException e)
							{System.out.println(e);}
					}

				return ques;
			}

		@Override
		public List<Question> getQuestionByCategory(Category category,List<Question> questionsList)
			{
				List<Question> list=new ArrayList<>();
				for(Question q:questionsList)
					{
						if(category.equals(q.getCategory()))
							{
								list.add(q);
							}
					}
				return list;
			}

		@Override
		public List<Question> getQuestionByComplexity(Complexity complexity,List<Question> questionsList)
			{
				List<Question> list=new ArrayList<>();
				for(Question q:questionsList)
					{
						if(complexity.equals(q.getComplexity()))
							{
								list.add(q);
							}

					}
				return list;
			}

		@Override
		public Set<Question> generateQuestionPaper(List<Question> list,List<Criteria> template)
			{
				Set<Question> ques=new HashSet<>();
				Random r=new Random();
				for(Criteria c:template)
					{
						List<Question> qList=getQuestionByComplexity(c.getComplexity(),getQuestionByCategory(c.getCategory(),list));
						
						int i=0;
						while(i<c.getNoOfQuestion())
							{
								if(ques.add(qList.get(r.nextInt(qList.size()))))
									i++;
							}

					}
				return ques;
			}

		@Override
		public void sortByCategory(List<Question> questionList)
			{
				Collections.sort(questionList,new Comparator<Question>(){

							@Override
							public int compare(Question p1,Question p2)
								{

									return p1.getCategory().compareTo(p2.getCategory());
								}
						});
			}

		@Override
		public void sortByComplexity(List<Question> questionList)
			{
				Collections.sort(questionList,new Comparator<Question>(){

							@Override
							public int compare(Question p1,Question p2)
								{

									return p1.getComplexity().compareTo(p2.getComplexity());
								}
						});
			}



	}
