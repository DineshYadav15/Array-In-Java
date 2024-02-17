import java.util.*;
class AddOddEvenANarray
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the limit number");
		int n =s1.nextInt();
		int number[]=new int[n];
		System.out.println("Enter the  number");
		for(int i=0;i<n;i++)
		{
		number[i]=s1.nextInt();
		}
		int Odd=0;
		int Even=0;
		
		for(int num:number)
		{
			if(num%2==0)
			{
				Even=Even+num;
			}
			else
			{
				Odd=Odd+num;
			}
		}
		System.out.println("Add of Even number is : " + Even);
		System.out.println("Add of Odd number is : " + Odd);
	}
}
		