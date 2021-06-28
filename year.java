import java.util.*;
class year 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int y=s.nextInt();
		if(y%400==0 || (y%4==0&&y%100!=0))
		System.out.println("this is a leap year");
		else
		{
         System.out.println("this is a non leap year");
		}
	}
}
