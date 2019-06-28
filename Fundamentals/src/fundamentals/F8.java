package fundamentals;

public class F8 {
	public static void main(String[]args)
	{
		char s='0';
		if((s>='A'&&s<='Z')||(s>='a'&&s<='z'))
		{
			System.out.print("Alphabhet");
		}
		else if(s>='0'&&s<='9')
		{
			System.out.print("Digit");
		}
		else
		{
			System.out.print("Special character");
		}
	}

}
