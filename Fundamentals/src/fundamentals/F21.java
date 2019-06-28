package fundamentals;

public class F21 {
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int r,sum=0,temp;
		temp=a;
		while(a>0)
		{
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.print(sum+ " is a palindrome ");
		}
		else
		{
			System.out.print(sum+" is not a palindrome ");
		}
	}
}
