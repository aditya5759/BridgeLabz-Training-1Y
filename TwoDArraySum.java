import java.util.Scanner;
class TwoDArraySum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		int[] [] arr=new int [3] [3];
		System.out.println("Enter 3x3 elements of an array :");
		int sum=0;
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				arr[i] [j]= sc.nextInt();
			}
		}
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3;j++)
			{
				sum+=arr[i] [j];
		}
		}
		System.out.println("Sum of 2d array elements is "+sum);
	}
}