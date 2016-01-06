package bean;

public class a
{






/*clas
	













public class TrainingCenter implements BatchAssignment
{
	String city;
	String code;
	
	public int addBatch(Batch b)
	{
		int flag=0,count=0,f=0;
		
		for(Batch bt:batch_ass)
		{
			count++;
			if	(bt.getBatchId().equals(b.getBatchId()))
			{
				flag=1;
				break;				
			}		
		}	
		if(flag==0)
		{
			for(Stream s:stream_ass)
			{
				if(s.getStreamCode()==b.getStream().getStreamCode())
				{	
					f=1;
					break;
				}
			}
			if(f==0)
				stream_ass.add(b.getStream());
			
			batch_ass.add(b);
			return count;
		}
		else
			return -1;
	}
	public void addTrainee(Trainee t)
	{
		int flag=0;
		for(Trainee tn:trainee_ass)
		{
			if (tn.getId()==t.getId())
			{	
				System.out.println("\nYour Trainee Id is Duplicate");
				flag=1;
			}
		}	
		if(flag==0)
		{	
			trainee_ass.add(t);
			System.out.println("Registration of trainee is succesfull");
		}
	}	
	public void addInstructor(Instructor i)
	{	
		int flag=0,fix=0;
		for(Instructor map:instructors_ass)
		{
			if (map.getId()==i.getId())
			{
				System.out.println("Your Trainee Id is Duplicate");
				flag=1;
			}
		}	
		if(flag==0)
		{
			if(i.getClass().getName().equals("SoftSkillsInstructor"))
			{	
				instructors_ass.add(i);
				System.out.println("SoftSkill Instructor is registered now");
			}
			else
			{
				for(Stream sop:stream_ass)
				{
					TechnicalInstructor t=(TechnicalInstructor)i;
					if(sop.getStreamCode()==t.getStreamCode())
					{	
						fix=1;
						instructors_ass.add(i);
						System.out.println("Technical Instructor is registered now ");
						break;
					}
				}
				if(fix==1)
					System.out.println("Sorry!! Technical Instructor cannot be registered as to the Stream (no existence)");
				
			}	
		}	
	}	
	
	
	public void assignBatch(int id,String name)
	{		
		int start1=0,start2=0,count=0;
		Trainee tr=null;
		Batch b=null;
		for(Batch bat:batch_ass)
		{
			if	(bat.getBatchId().equals(name))
			{
				b=bat;
				start1=1;
				break;				
			}		
		}
		for(Trainee t:trainee_ass)
		{
			if (t.getId()==id)
			{	
				tr=t;
				start2=1;
				break;
			}
		}
		if(start1==0 || start2==0)
			System.out.println("Sorry !!");
		if(start1==1 && start2==1)
		{
			if(tr.getBatchId()==null)
			{	
			
				for(Trainee top:trainee_ass)
				{
					if(top.getBatchId().getBatchId()==b.getBatchId())
						count++;
				}
				if(count<36)
				{	
					tr.setBatchId(b);
					System.out.println("Trainee is assigned a  batch ");
				}
				else
					try {
						throw new InvalidAssignmentException();
						} catch (InvalidAssignmentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
			}
			else
			   System.out.println("Trainee already has been assigned batch ");
		}
	}	
	public void assignTechLead(String name,int id) throws InvalidAssignmentException,RecordNotFoundException
	{   
		
	
		int start1=0,start2=0,count=0;
		TechnicalInstructor t=null;
		for(Batch bat1:batch_ass)
		{
			if	(bat1.getBatchId().equals(name))
			{
				start1=1;
				break;				
			}		
		}
		for(Instructor him:instructors_ass)
		{
			if (him.getId()==id)
			{	
				t=(TechnicalInstructor)him;
				start2=1;
				break;
			}
		}
		if(start1==0 || start2==0){
			throw new InvalidAssignmentException();
			
		}
			
		   
		if(start1==1 && start2==1)
		{
			for(Batch bt:batch_ass)
			{
				if	(bt.getBatchId().equals(name))		
				{	
					if(bt.getTechLead().getId()==id)
						count++;
					
				}
			}	
			if(count<2)
			{
				for(Batch bat1:batch_ass)
				{
					if(t.getStreamCode().equals(bat1.getStream().getStreamCode()))
					{		
						bat1.setTechLead(t);
						System.out.println("Tech lead is  assigned to !!"+bat1.getBatchId());
						break;
					}
				}	
				
			}
			else
				System.out.println("Tech lead is assigned two batches before");
		
		}
	
	
		
	}
	public void assignBizLead(String name,int id) throws RecordNotFoundException
	{
		
		int start1=0,start2=0,count=0;
		SoftSkillsInstructor t=null;
		for(Batch bat1:batch_ass)
		{
			if	(bat1.getBatchId().equals(name))
			{
				start1=1;
				break;				
			}		
		}
		for(Instructor pil:instructors_ass)
		{
			if (pil.getId()==id)
			{	
				t=(SoftSkillsInstructor)pil;
				start2=1;
				break;
			}
		}
		if(start1==0 || start2==0)
		throw new RecordNotFoundException();
		if(start1==1 && start2==1)
		{
			for(Batch bat1:batch_ass)
			{
				if	(bat1.getBatchId().equals(name))		
				{	
					if(bat1.getBizLead().getId()==id)
						count++;
					
				}
			}	
			if(count<3)
			{
				for(Batch bat1:batch_ass)
				{
					if(bat1.getBizLead()==null)
					{	
						bat1.setBizLead(t);
						System.out.println("Biz lead has been assigned to "+bat1.getBatchId());
						break;
					}
				}	
			}	
			else
				System.out.println("Biz lead is allocated to  three batches already");
		}
	}
	public void get(int check)
	{	
		ArrayList<String> dim=new ArrayList<String>();
		SoftSkillsInstructor sim=new SoftSkillsInstructor();
		TechnicalInstructor tim=new TechnicalInstructor();
		if(check==1)
		{
			dim=tim.getModules();
		}
		else
			dim=sim.getModules();
		System.out.print("The modules are:"+dim);
		
	}
	void findHighestBatch()
	{
		ArrayList<Integer> a_List=new ArrayList<Integer>();
		ArrayList<String> b=new ArrayList<String>();
		String batch="";
		int max=0,index=0;
		int count=0;
		for(Batch bt:batch_ass)
		{
			for(Trainee t:trainee_ass)
			{
				if(t.getBatchId().getBatchId()==bt.getBatchId())
					count++;
			}
			a_List.add(count);
			b.add(bt.getBatchId());
		}
		for(index=0;index<a_List.size();index++)
		{
			if(a_List.get(index)>max)
			{
				max=a_List.get(index);
				batch=b.get(index);
			}
		}
		
		System.out.println("Batch name: "+batch+" and no of trainees: "+max);
		
	}
	
	public static void main(String[] args) throws IOException,InvalidAssignmentException,RecordNotFoundException
	{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("\t\t Welcome to TCS ILP LAB Daigonostic Session");
		System.out.println("\t Enter your name");
		String name23=br.readLine();
		System.out.println("\t Enter your Employment id");
		int emp_no=Integer.parseInt(br.readLine());
		System.out.println("Ready for the test!!");
		System.out.println("Confirm with Yes or No");
		String option=br.readLine();
		if(option=="Yes")
			
		{
			System.out.println(((char) 27)+"[2J");
		}
		else 
		{
			System.out.println("TCS to you : You have to give the test else you are fired");
			System.out.println("Here your test starts");
		}
		System.out.println("\t\t\t\tHere is the question for you"+"Mr/Miss"+name23+" ("+emp_no+")");
		System.out.println("Visit 172.0.0.10/ps-1");
		System.out.println("Question Solved: Yes or No");
		String solve=br.readLine();
		if(solve=="Yes"){
			System.out.println("Would you like to run your code? Confirm with Yes or No only");
			String con=br.readLine();
			if(con=="yes"){
				System.out.println(((char) 27)+"[2J");
			}
			else 
			{
				System.out.println("You have to run your code else No salary!!!");
				System.out.println("We are waiting for your code");
				
			}
		}
		else {
		
		
			System.out.println("No alternate option, you have to solve ");
		}
		System.out.println(((char) 27)+"[2J");
		String ass_id="",ass_name="",ass="";
		int tid,index;
		int k=0;
	
		TrainingCenter tn=new TrainingCenter("Mumbai","m5");
		do
		{
			
			System.out.println("\t\t\tWelcome to daignostic of java Lab");
			System.out.println("\n\t1.Batch to be added \n\t2.Register Trainee \n\t3.Include Instructor \n\t4.TechnicalLeader assignment \n\t5.Assign BizLead\n\t6.Assign batch to Trainee \n\t7.Frequency of  Trainees\n\t8.Search Instructor \n\t9.Search Batch with maximum trainees \n\t10.See the modules \n\t11.Exit");			
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:System.out.println("Enter the batch id:");
						ass_id=br.readLine();
						Stream stream=new Stream("s9");
						int mew =tn.addBatch(new Batch(ass_id,stream));
						if(mew==-1)
							System.out.println("Batch cannot be added!!");	
						else
							System.out.println("Batch has been added"+"\n The Current no of batches: "+mew);
						break;
				
				case 2:System.out.println("Enter the trainee id:");
						tid=Integer.parseInt(br.readLine());
						System.out.println("Enter name:");
						ass_name=br.readLine();
						tn.addTrainee(new Trainee(tid,ass_name));
						break;
						
				case 3:	System.out.println("Enter the instructor id:");
						tid=Integer.parseInt(br.readLine());
						System.out.println("Enter name:");
						ass_name=br.readLine();
						System.out.println("1:technical instructor \n 2:soft skill instructor:");
						index=Integer.parseInt(br.readLine());
						if(index==1)
						{
							System.out.println("Enter stream code:");
							ass=br.readLine();
							tn.addInstructor(new TechnicalInstructor(tid,ass_name,ass));
						}
						else
							tn.addInstructor(new SoftSkillsInstructor(tid,ass_name));
						break;
				case 4:	System.out.println("Enter the batch id:");
						ass_id=br.readLine();
						System.out.println("Enter the instructor id:");
						tid=Integer.parseInt(br.readLine());
						tn.assignTechLead(ass_id,tid);
						break;
				case 5:System.out.println("Enter the batch id:");
						ass_id=br.readLine();
						System.out.println("Enter the instructor id:");
						tid=Integer.parseInt(br.readLine());
						tn.assignBizLead(ass_id,tid);
						break;
				case 6:System.out.println("Enter the batch id:");
						ass_id=br.readLine();
						System.out.println("Enter the trainee id:");
						tid=Integer.parseInt(br.readLine());
						tn.assignBatch(tid,ass_id);
						break;
				case 9:tn.findHighestBatch();
						break;
				case 10:System.out.println("1:technical instructor \n 2:soft skill instructor:");
						index=Integer.parseInt(br.readLine());
						tn.get(index);
						break;
				case 11:System.out.println("Sorry");
						System.exit(0);
				default:System.out.println("Invalid option!!");
		
		
			}
		}
		while(k==0);

	}*/


}
