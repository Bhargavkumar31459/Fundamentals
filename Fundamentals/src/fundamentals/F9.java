package fundamentals;

public class F9 {
	public static void main(String[]args)
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.equals("Female")&&age>=1&&age<=58)
			System.out.print("8.2%");
		else if(gender.equals("Female")&&age>=59&&age<=100)
			System.out.print("9.2%");
		else if(gender.equals("Male")&&age>=1&&age<=58)
			System.out.print("8.4%");
		else if(gender.equals("Male")&&age>=59&&age<=100)
			System.out.print("10.5%");	
	}

}
