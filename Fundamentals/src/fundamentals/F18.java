package fundamentals;

public class F18 {
	public static void main(String[]args)
	{
		int n=Integer.parseInt(args[0]);
		int a=Integer.toString(n).length();
		int r,sum=0;
		for(int i=1;i<=a;i++)
		{
			 r=n%10;
			 sum=sum+r;
			 n=n/10;
		}
		System.out.print(sum);
	}

}
