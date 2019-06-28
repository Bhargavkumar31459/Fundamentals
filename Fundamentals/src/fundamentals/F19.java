package fundamentals;

public class F19 {
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		if(args.length==0)
		{
			System.out.print("Please enter the integer number");
		}
		else
		{
			for(int i=1;i<=a;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("*");
				}
			System.out.print("\n");
			}
		}
	}
}
