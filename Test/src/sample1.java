
public class sample1{
static int d=6;
    public static void main(String[] args){
		loop1://loop testing break
		for(int i=0;i<3;i++){
			loop2:
			for(int j=0;j<3;j++){
				System.out.print(j);
				if(j==1){
					break loop1;
				}
			}
			System.out.println();
		}
/*int a=1;
int c = a++ - a;
System.out.println(c+d);
ABC();
    }
static void ABC()
{System.out.println("boom only with object");*/
}
}
