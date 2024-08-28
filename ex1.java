package problems_solving;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		System.out.print(arr[i] +" ");
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int avg=(sum/n);
		int even=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even=arr[i];
				break;
			}
		}
		if(avg>even) {
			System.out.println("\n YES");
		}
		else {
			System.out.println("\n NO");
		}
		
		
	}
	

}
