import java.util.*;
class alp1 
{
	public static void main(String[] args) 
	{
		char a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the alphabet");
        a=s.next().charAt(0);
		switch(a)
		{
			case 'a':
		System.out.println(a+ "is a vowell");
			break;
        case 'e':
	  	System.out.println(a+ "is a vowell");
            break;
        case 'i':
		System.out.println(a+ "is a vowell");
		 break;
        case 'o':
		System.out.println(a+ "is a vowell");
          break; 
       case 'u':
		System.out.println(a+ "is a vowell"); 
           break;
		   default:
           System.out.println("the alphabet is consonant");
		}
	}
}
