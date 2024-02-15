class PrimeArray
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,9,6,11,13,15,23};
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			boolean isPrime=true;
			if(num<=0)
			{
				isPrime=false;
			}
			else
			{
				for(int j=2;j<=num/2;j++)
				{
					if(num%j==0)
					{
						isPrime=false;
						break;
					}
				}
			}
			if(isPrime)
			{
				System.out.println(num);
			}
		}
	}
	
}

