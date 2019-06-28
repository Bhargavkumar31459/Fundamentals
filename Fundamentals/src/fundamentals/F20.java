package fundamentals;

public class F20 {
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int r,sum=0;
		while(a>0)
		{
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		System.out.print(sum);
}
}
