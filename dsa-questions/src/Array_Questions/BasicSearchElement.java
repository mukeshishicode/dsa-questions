package Array_Questions;

import java.util.Scanner;
//linear search 
public class BasicSearchElement {

	public static int linearSearch(int a[],int item) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==item) {
			 return i;
		}

	}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Matching Number=");
		Scanner sc=new Scanner(System.in);
		int item=sc.nextInt();
		int a[]= {1,2,3,4,5,6,7};
		int res=linearSearch(a,item);
		//print index of matched item
		System.out.println("matched Item index="+res);
	}	

}
