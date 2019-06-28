package fundamentals;

public class F12 {
	public static void main(String[]args)
	{
		if(args.length==0)
		{
			System.out.print(" Please enter the month in number");
		}
		else
		{
			int a=Integer.parseInt(args[0]);
			switch(a)
			{
			case 1:
				System.out.print("Jan");
				break;
			case 2:
				System.out.print("Feb");
				break;
			case 3:
				System.out.print("March");
				break;
			case 4:
				System.out.print("Apl");
				break;
			case 5:
				System.out.print("May");
				break;
			case 6:
				System.out.print("June");
				break;
			case 7:
				System.out.print("July");
				break;
			case 8:
				System.out.print("Aug");
				break;
			case 9:
				System.out.print("sept");
				break;
			case 10:
				System.out.print("oct");
				break;
			case 11:
				System.out.print("Nov");
				break;
			case 12:
				System.out.print("Dec");
				break;
			default:
				System.out.print("Invalid month");
				break;
			}
					
		}
	}

}
