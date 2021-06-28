import java.util.*;
class  big
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
        int d=s.nextInt();
		
		int x,y,big;
		x=(a>b)?a:b;
		y=(c>d)?c:d;
		big=(x>y)?x:y;
		System.out.println("the bigest number is:"+big);

	}
}
