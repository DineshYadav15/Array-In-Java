import java.util.*;
class SearchElement
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("limit the numbers");
		int num=s1.nextInt();
		int numbers[]=new int[num];
		System.out.println("enter the numbers");
		for(int i=0;i<num;i++)
		{
			numbers[i]=s1.nextInt();
		}
		System.out.println("enter the search the element");
		int x=s1.nextInt();
		int temp=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==x)
			{
				System.out.println("x index position are = " + i);
				temp++;
			}
		}
		if(temp==0)
		{
				System.out.println("out of bound");
		}
			
		
	}
}