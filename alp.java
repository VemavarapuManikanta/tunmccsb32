import java.util.*;
class alp
{
	public static void main(String[] args) 
	{
		char a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the alphabet");
		a=s.next().charAt(0);
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
		{
		System.out.println("vowell");
		}
		else
		{
          System.out.println("consonant");
		}
	}
}
