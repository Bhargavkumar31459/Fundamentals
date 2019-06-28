package fundamentals;

public class F4 {
	public static void main(String[]args)
	{
		int a;
		a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.print("Positive");
		}
		else if(a==0)
		{
			System.out.print("Zero");
		}
		else
		{
			System.out.print("Negative");
		}
	}

}
