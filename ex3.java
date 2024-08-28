package problems_solving;
import java.util.*;
import java.lang.*;
public class ex3 {
	public static void isVowel(char c) {
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
		System.out.println("VOWEL");
	}
	else {
		System.out.println("NOT VOWEL");
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		int str_len=str.length();
		int mid=(str_len)/2;
		System.out.println("Mid Character of string is : "+str.charAt(mid));
		isVowel(str.charAt(mid));
	}

}
