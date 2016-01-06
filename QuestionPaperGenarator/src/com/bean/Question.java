package com.bean;

public class Question
	{
		private int srno;
		private String question;
		private String option1;
		private String option2;
		private String option3;
		private String option4;
		private String correctAns;
		private Category Category;
		private Complexity complexity;

		public Question(int srno,String question,String option1,String option2,String option3,String option4,String correctAns,Category Category,Complexity complexity)
			{
				this.srno=srno;
				this.question=question;
				this.option1=option1;
				this.option2=option2;
				this.option3=option3;
				this.option4=option4;
				this.correctAns=correctAns;
				this.Category=Category;
				this.complexity=complexity;
			}

		public Question()
			{
			}


		public int getSrno()
			{
				return srno;
			}

		public void setSrno(int srno)
			{
				this.srno=srno;
			}

		public String getQuestion()
			{
				return question;
			}

		public void setQuestion(String question)
			{
				this.question=question;
			}

		public String getOption1()
			{
				return option1;
			}

		public void setOption1(String option1)
			{
				this.option1=option1;
			}

		public String getOption2()
			{
				return option2;
			}

		public void setOption2(String option2)
			{
				this.option2=option2;
			}

		public String getOption3()
			{
				return option3;
			}

		public void setOption3(String option3)
			{
				this.option3=option3;
			}

		public String getOption4()
			{
				return option4;
			}

		public void setOption4(String option4)
			{
				this.option4=option4;
			}

		public String getCorrectAns()
			{
				return correctAns;
			}

		public void setCorrectAns(String correctAns)
			{
				this.correctAns=correctAns;
			}

		public Category getCategory()
			{
				return Category;
			}

		public void setType(Category type)
			{
				this.Category=type;
			}

		public Complexity getComplexity()
			{
				return complexity;
			}

		public void setComplexity(Complexity complexity)
			{
				this.complexity=complexity;
			}
		@Override
		public String toString()
			{
				return srno+","+question+"," 
					+option1+","+option2+","
					+option3+","+option4+"," 
					+Category+","+complexity;


			}

		@Override
		public boolean equals(Object p1)
			{
				if(this==p1)return true;
				if(p1==null||p1.getClass()!=this.getClass())return false;
				Question q=(Question)p1;
				return (q.srno==this.srno)||(this.question.equals(q.getQuestion()));
			}

		@Override
		public int hashCode()
			{
				int hash=23;
				hash=37*hash+this.srno;
				hash=37*hash+(this.question!=null?this.question.hashCode():0);
				return hash;
			}

	}
