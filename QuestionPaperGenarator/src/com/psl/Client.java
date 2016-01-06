package com.psl;
import com.util.DataManagerImpl;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import com.bean.*;

public class Client
	{
		public static void main(String[] args)
			{
				// Call your functionalities from here to test your code.
				DataManagerImpl dm=new DataManagerImpl();
				List<Question> questionList=dm.populateData();
				System.out.println("Total questions : "+questionList.size());
				for(Question q:questionList)
					{
						System.out.println(q);
					}
				List<Question> list=	dm.getQuestionByCategory(Category.History,questionList);
				System.out.println("\nQuestions with Category : "+Category.History);
				for(Question q:list)
					{
						System.out.println(q);
					}
				List<Question> list2=dm.getQuestionByComplexity(Complexity.Medium,questionList);
				System.out.println("\nQuestion with complexity : "+Complexity.Medium);
				for(Question q:list2)
					{
						System.out.println(q);
					}
				System.out.println("Sorting by category");
				dm.sortByCategory(questionList);
				for(Question q:questionList)
					{
						System.out.println(q);
					}
				System.out.println("Sorting by complexity");
				for(Question q:questionList)
					{
						System.out.println(q);
					}

				List<Criteria> template=new ArrayList<>();
				template.add(new Criteria(Category.Geography,Complexity.Simple,2));
				template.add(new Criteria(Category.GK,Complexity.Simple,2));
				template.add(new Criteria(Category.History,Complexity.Simple,2));
				template.add(new Criteria(Category.Science,Complexity.Simple,2));
				template.add(new Criteria(Category.History,Complexity.Medium,2));
				Set<Question> questionPaper=dm.generateQuestionPaper(questionList,template);
				System.out.println("Total questions : "+questionPaper.size());
				int i=0;
				for(Question q:questionPaper)
					{
						System.out.println(++i+"."+q.getQuestion()+" "+q.getCategory()+" "+q.getComplexity());
						System.out.println(" Options are : a."+q.getOption1()+" b."+q.getOption2()+" c."+q.getOption3()+" d."+q.getOption4());
					}

			}
	}
