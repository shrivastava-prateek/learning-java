

Code:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CareWell
{
    ArrayList <Patient> pList=new ArrayList<Patient>();
    ArrayList <Department> dList=new ArrayList<Department>();
    ArrayList<Appointment> a=new ArrayList<Appointment>();
   
    public void addPatient(Patient p)
    {
        pList.add(p);
       
    }
   
    public void addDept(Department d)
    {
        dList.add(d);
       
    }
   
    public void addDoc(Doctor d)
    {
        for(Department dept:dList)
        {
            if(dept.getDepName()==d.getDepName())
               
                dept.addDoctor(d);
        }
       
    }
   
    public void addAppoint(Appointment ap)
    {
        int flag=0;
        for(Appointment aa:a)
        {
            if(aa.getDc().equals(ap.getDc()))
            {       
                if(aa.getDt()==ap.getDt())
                {
                    System.out.println("Doctor not free!!");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)   
        {
            System.out.println("The appointment is done!");
            System.out.println("Appointment details are:"+"\nName: "+ap.getPt().getName()+" Doctor's Name: "+ap.getDc().getDocName()+" Date:  "+ap.getDt());
            a.add(ap);
        }   
           
    }
    public void addAppoint(Patient p,int dt)
    {
        int flag=0;
        for(Appointment aa:a)
        {
            if(aa.getDt()==dt)
            {
                for(Department d:dList)
                {
                    for(Doctor dc:d.getDocList())
                    {   
                        if (!(dc.getDocName().equals(aa.getDc())))
                        {
                            Appointment ap=new Appointment(p,dc,dt);
                            a.add(ap);
                            System.out.println("The appointment is done!");
                            System.out.println("Appointment details are:"+"\nName: "+ap.getPt().getName()+" Doctor's Name: "+ap.getDc().getDocName()+" Date:  "+ap.getDt());
                            flag=1;
                            break;
                        }
                    }       
                }
            }   
        }
       
        if(flag==0)
        {   
            for(Appointment aa:a)
            {
                if(aa.getDt()!=dt)
                {
                    Doctor dc=aa.getDc();
                    Appointment ap=new Appointment(p,dc,dt);
                    a.add(ap);
                    System.out.println("The appointment is done!");
                    System.out.println("Appointment details are:"+"\nName: "+ap.getPt().getName()+" Doctor's Name: "+ap.getDc().getDocName()+" Date:  "+ap.getDt());
                   
                }   
            }   
        }   
    }
    public static void main(String[] args) throws IOException
    {
       
    int da=0,i,j=0,k=0,flag=0;
    String name="",name1="";
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
    CareWell cw=new CareWell();
   
    cw.addDept(new ENT("ENT"));
    cw.addDept(new Cardiology("Cardiology"));
   
    cw.addDoc(new Doctor("x","ENT"));
    cw.addDoc(new Doctor("y","ENT"));
    cw.addDoc(new Doctor("z","Cardiology"));
   
    System.out.println("\t\t\tWELCOME TO CARE WELL!!");
   
    for(Department d:cw.dList)
    {
        for(Doctor dc:d.getDocList())
        {   
            System.out.println("\nDoctor's name: "+dc.getDocName()+" Department's Name: "+dc.getDepName());
                   
        }
    }
   
    do
    {
        System.out.println("\n\t\t\tEnter the choice:");
        System.out.println("1.Add patient\n2.Take appointment with specific doctor\n3.Take appointment with available doctor\n4.Exit");
       
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:    System.out.println("Enter the name:");
                    name=br.readLine();
                    j++;
                    cw.addPatient(new Patient(j,name));
                    System.out.println("\nOp ID: "+j);
                    break;
                   
            case 2:    System.out.println("Enter the Patient's name:");
                    name1=br.readLine();
                    System.out.println("Enter the Doctor's name:");
                    name=br.readLine();
                    System.out.println("Enter date:");
                    da=Integer.parseInt(br.readLine());
                    Patient p=new Patient();
                    flag=0;
                    for(i=0;i<cw.pList.size();i++)
                    {   
                        if(cw.pList.get(i).getName().equals(name1))
                        {   
                            p=cw.pList.get(i);
                           
                        }
                    }
                    for(Department d:cw.dList)
                    {
                        for(Doctor dc:d.getDocList())
                        {   
                            if (dc.getDocName().equals(name))
                            {
                                cw.addAppoint(new Appointment(p,dc,da));
                                flag=1;
                                break;
                            }
                        }
                    }
                    if(flag==0)
                        System.out.println("Doctor does not exists!!");
                    break;
                   
            case 3:    System.out.println("Enter the Patient's name:");
                    name1=br.readLine();
                    System.out.println("Enter date:");
                    da=Integer.parseInt(br.readLine());
                    Patient pc=new Patient();
                   
                    for(i=0;i<cw.pList.size();i++)
                    {   
                        if(cw.pList.get(i).getName().equals(name1))
                        {   
                            pc=cw.pList.get(i);
                       
                        }
                    }
                    cw.addAppoint(pc,da);
                    break;               
            case 4:System.out.println("Thank You!!");
                    System.exit(0);
                   
            default:System.out.println("Invalid option!!");
   
        }
    }
    while(k==0);

    }
}







