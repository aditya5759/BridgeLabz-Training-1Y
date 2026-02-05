import java.util.Scanner;
class SumofArray{
	public static void main (String[]args){
		int[] arr=new int[5];
		int s=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter 5 elements of the array");
		for(int i=0; i<5; i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=0; i<5; i++)
		{
			s+=arr[i];
		}
		System.out.println("Sum of all the elements of the array is "+s);
	}
}