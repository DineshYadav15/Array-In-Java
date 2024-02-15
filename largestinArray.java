//largest number of array;
import java.util.*;
class largestinArray
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the limit number");
		int num =s1.nextInt();
		int number[]=new int[num];
		System.out.println("Entetr the number");
		for(int i=0;i<num;i++)
		{
			number[i]=s1.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(number[i]>number[j])
				{
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		System.out.println("short the array");
		for(int i=0;i<num;i++)
		{
			System.out.println(number[i]);
		}
		System.out.println("Largest number");
		int largest=number[num-1];
		System.out.println(largest);
	}
}
		
		
		