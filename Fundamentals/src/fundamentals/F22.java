package fundamentals;

public class F22 {
	public static void main(String[]args)
	{
		int i=0,a=0;
		while(a!=5)
		{
			i++;
			if(i%2==0&&i%3==0&&i%5==0)
			{
				System.out.println(i);
				a++;
			}
		}
	}

}
