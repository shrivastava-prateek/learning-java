package psl;
import java.util.*;
import util.*;
import bean.*;
import Exception.*;

public class TrainingCenter implements BatchAssignment
	{
		String city;
		String code;
		ArrayList<Batch> batch_ass=new ArrayList<Batch>();
		ArrayList<Stream> stream_ass=new ArrayList<Stream>();
		ArrayList<Trainee> trainee_ass=new ArrayList<Trainee>();
		ArrayList<Instructor> instructors_ass=new ArrayList<Instructor>();


		public TrainingCenter(String city,String code) throws InvalidAssignmentException
			{
				this.city=city;
				this.code=code;
			}

		public String getCode()
			{
				return code;
			}
		public void setCode(String code)
			{
				this.code=code;
			}
		public String getCity()
			{
				return city;
			}
		public void setCity(String city)
			{
				this.city=city;
			}
		public ArrayList<Batch> getBatches()
			{
				return batch_ass;
			}
		public void setBatches(ArrayList<Batch> batches)
			{
				this.batch_ass=batches;
			}




		public int addBatch(String batchId,Stream s)
			{
				boolean flag=false;
				for(Batch b1:batch_ass)
					{
						if(b1.getBatchId().equals(batchId))
							{
								flag=true;
							}
					}
				if(flag)
					{
						return -1;
					}
				else
					{
						Batch b=new Batch(batchId,s);
						batch_ass.add(b);
					}
				flag=false;
				for(Stream s1:stream_ass)
					{
						if(s1.getStreamCode().equals(s))
							{
								flag=true;break;
							}
						if(flag==false)
							{
								stream_ass.add(s);
							}
					}
				return 0;
			}

		public void addTrainee(Trainee t)
			{
				boolean flag=false;
				for(Trainee t1:trainee_ass)
					{
						if(t1.getId()==t.getId())
							{
								System.out.println("Duplicate trainee id");
								flag=true;
								break;
							}
					}
				if(!flag)
					{
						trainee_ass.add(t);
					}


			}

		public void addInstructor(Instructor i)
			{
				boolean flag=false;
				for(Instructor i1:instructors_ass)
					{
						if(i1.getId()==i.getId())
							{
								System.out.println("Duplicate Instructor id");
								flag=true;
								break;
							}
					}
				if(!flag)
					{
						instructors_ass.add(i);
					}
			}
		@Override
		public void assignTechLead(String batchId,int id) throws RecordNotFoundException, InvalidAssignmentException
			{
				int count=0;
				for(Batch b:batch_ass)
					{
						if(b.getTechLead().getId()==id)
							{
								count++;
							}
					}
				if(count<2)
					{
						boolean flag=false;
						for(Batch b:batch_ass)
							{

								if((b.getBatchId().equals(batchId))&&((b.getTechLead()==null)))
									{flag=true;
										boolean flag1=false;
										for(Instructor i:instructors_ass)
											{
												if(i.getId()==id)
													{flag=true;
														TechnicalInstructor t=(TechnicalInstructor)i;
														if(b.getStream().getStreamCode().equals(t.getStreamCode()))
															{

																b.setTechLead(t);
															}
													}
											}
										if(!flag1)
											{
												throw new RecordNotFoundException();
											}

									}
							}
						if(!flag)
							{
								throw new RecordNotFoundException();
							}

					}
				else throw new InvalidAssignmentException();
			}


		@Override
		public void assignBizLead(String batchId,int id) throws Exception
			{
				int count=0;
				for(Batch b:batch_ass)
					{
						if(b.getBizLead().getId()==id)
							{
								count++;
							}
					}
				if(count<3)
					{
						boolean flag=false;
						for(Batch b:batch_ass)
							{

								if((b.getBatchId().equals(batchId))&&((b.getBizLead()==null)))
									{flag=true;
										boolean flag1=false;
										for(Instructor i:instructors_ass)
											{
												if(i.getId()==id)
													{flag=true;
														SoftSkillsInstructor s  =new SoftSkillsInstructor(id,"Prateek1");
														b.setBizLead(s);
													}
											}
										if(!flag1)
											{
												throw new RecordNotFoundException();
											}

									}
							}
						if(!flag)
							{
								throw new RecordNotFoundException();
							}


					}
				else throw new InvalidAssignmentException();
			}

		public void assignBatch(int traineeId,String batchId)throws Exception
			{boolean flag=false;
				for(Batch b:batch_ass)
					{
						if(b.getBatchId().equals(batchId))
							{flag=true;
								boolean flag1=false;
								if(b.getCurrentCapacity()<36)
									{
										for(Trainee t:trainee_ass)
											{
												if(t.getId()==traineeId)
													{
														flag1=true;
														if(t.getBatchId()==null)
															{
																t.setBatchId(b);
															}
														else
															{
																throw new InvalidAssignmentException();
															}
													}
											}
										if(!flag1)
											{
												throw new RecordNotFoundException();
											}
									}
								else
									{
										System.out.println("Batch is full");
										throw new InvalidAssignmentException();
									}

							}
					}
				if(!flag)
					{
						throw new RecordNotFoundException();
					}
			}

		public Instructor findInstructor(String batchId,String type)throws Exception
			{
				if(type.equals("tech")||type.equals("biz"))
					{
						for(Batch b:batch_ass)
							{
								if(b.getBatchId().equals(batchId))
									{
										if(type.equals("biz"))
											{
												return b.getBizLead();
											}
										else
											{
												return b.getTechLead();
											}

									}
								else
									{
										throw new RecordNotFoundException();
									}
							}
					}
				return null;
			}

		public int countTrainees(String code)
			{
				int count=0;
				for(Stream s:stream_ass)
					{
						if(s.getStreamCode().equals(code))
							{
								for(Trainee t:trainee_ass)
									{
										if(t.getBatchId().getStream().getStreamCode().equals(code))
											{
												count++;
											}
									}
							}
						else
							{
								return -1;
							}
					}
				return count;
			}

		public Batch findHighestBatch()
			{
				Collections.sort(batch_ass,new Comparator<Batch>(){

							@Override
							public int compare(Batch p1,Batch p2)
								{
									return p2.getCurrentCapacity()-p1.getCurrentCapacity();
								}
						});
				return batch_ass.get(0);
			}

		/*public ArrayList<String> getModules(){
		 return null;
		 }*/


	}
