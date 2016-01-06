import java.util.Arrays;
public class CollectionTest
{
	public static void main(String[] args){
		int[] a= {1,2,9,8,7,6,5,4,3};
		Arrays.parallelSort(a);
		System.out.println(a);
	}
}
