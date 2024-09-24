package Array_Questions.Basic_Array;

public class ReverseArray {
	//main logic
	public static int[] reverse(int a[]) {
		int i=0;
		int j=a.length-1;
		while(i<=j) {
			int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			i++;
			j--;
		}
		return a;	
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int res[]=reverse(a);
		for(int k=0;k<=res.length-1;k++) {
		System.out.print(res[k]+ " ");
		}

	}

}
