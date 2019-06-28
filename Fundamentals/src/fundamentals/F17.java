package fundamentals;

public class F17 {
	public static void main(String[]args)
	{
		int n=Integer.parseInt(args[0]);
		int a=Integer.toString(n).length();
		boolean isPrime=true;
		int temp;
		if(a==0)
			{
				System.out.print(" Please enter the integer number");
			}
			else if(n==1 || n==0)
			{
				System.out.print(n+ "is neither prime nor composite");
			}
			else
			{
				for(int i=2;i<=n/2;i++)
				{
					 temp=n%i;
				   if(temp==0)
				   {
				      isPrime=false;
				      break;
				   }
				}
				if(isPrime)
				   System.out.println(n + " is a Prime Number");
				else
				   System.out.println(n + " is not a Prime Number");
			}
		}
	}

