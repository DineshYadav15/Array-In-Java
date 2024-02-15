// Java Program to Print Odd and Even Numbers from an array
/*class oddeven
{
	
	public static void main(String args[])
	{
		int arr[]={1,2,5,3,6,7,8,9,12};
		System.out.println("Odd Number");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Even Number");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
*/
import java.util.Scanner;
class oddeven
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
	    System.out.println("enter limit");
		int num=s1.nextInt();
		 System.out.println("enter the number");
		 int number[]=new int[num];
		 for(int i=0;i<num;i++)
		 {
			 number[i]=s1.nextInt();
		 }
		 System.out.println("Odd Number");
		 for(int i=0;i<num;i++)
		{
			if(number[i]%2!=0)
			{
				System.out.println(number[i]);
			}
		}
		System.out.println("Even Number");
		for(int i=0;i<num;i++)
		{
			if(number[i]%2==0)
			{
				System.out.println(number[i]);
			}
		}
	}
}
		 
		
	
	

		