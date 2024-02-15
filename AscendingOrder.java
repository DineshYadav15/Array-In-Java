//array assending order;
/*import java.util.*;
class AscendingOrder
{
	public static void main(String[] args)
	{Scanner s1=new Scanner(System.in);
	System.out.println("Enter the limit number");
	int num =s1.nextInt();
	int number[]=new int[num];
	System.out.println("Enter the number");
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
	System.out.println("Short the array");
	for(int i=0;i<num;i++)
	{
		System.out.println(number[i]);
	}
	}
}
*/
import java.util.Arrays;   
public class AscendingOrder 
{   
public static void main(String[] args)   
{   
 
int num[]={90, 23, 5, 10};  
//invoking sort() method of the Arrays class  
Arrays.sort(num);   
System.out.println("Elements of array sorted in ascending order: ");  

for (int i = 0; i < num.length; i++)   
{       
System.out.println(num[i]);   
}   
}  
}  
	
	