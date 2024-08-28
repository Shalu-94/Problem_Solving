package problems_solving;
import java.util.*;
public class ex2 {
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
				if(num % i == 0) {
					return false;
				}
			}
		return true;
	}
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
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]!=first && arr[i]>second) {
				second=arr[i];
			}
		}
		System.out.println("\nSecond Largest Number:" +second);
		
		//check prime or not
		if(isPrime(second)) {
			System.out.println(second +" PRIME NUMBER");
		}
		else {
			System.out.println( second +" NOT A PRIME NUMBER");
		}
	}
	
}
