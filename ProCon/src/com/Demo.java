package com;

public class Demo extends Thread {
	
	static int num;
	static int flag=0;
	
	public Demo(String name) {
		super(name);
		num=0;
	}

@Override
public synchronized void run(){
	if(getName().equals("PRODUCER")){
		System.out.println(getName()+" : ");setNum(++num);flag=1;
		if(flag==1){
			notify();
		}
	}
	else{
		if(flag==0){
			try {
				wait(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" : " + getNum());
	}
}
	
	public  int getNum() {
		return num;
	}

	public  void setNum(int n) {
		num = n;
	}
	public static void main(String[] args) 
	{
		Demo pro=new Demo("PRODUCER");
		Demo con=new Demo("CONSUMER");
		pro.setPriority(MAX_PRIORITY);
		con.setPriority(MIN_PRIORITY);
		pro.start();
		con.start();
		
       
	}

}
