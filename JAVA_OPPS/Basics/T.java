import java.util.*;
import java.lang.*;
public class T
{
	public static void main(String srgs[])
	{
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 Numbers:");
	int a= sc.nextInt();
	System.out.println("you have entered number A :" +a);
	int b= sc.nextInt();
	System.out.println("you have entered number B :" +b);
	
	System.out.println(a+ " x" + b + " = " + a* b);
	*/
	
	/*Scanner in = new Scanner(System.in);
	System.out.println( " Enter 2 Integers :");
	int a= in.nextInt();
	int b= in.nextInt();
	
	System.out.println(a + " + " + b + " = " + (a + b));
	System.out.println(a + " - " + b + " = " + (a - b));
	System.out.println(a + " x " + b + " = " + (a * b));
	System.out.println(a + " / " + b + " = " + (a / b));
	System.out.println(a + " mod " + b + " = " + (a % b));
	*/
	int i;
	int j;
		for(i=1;i<=10;i++)
			{
				String s1 = args[0];
				int a = Integer.parseInt(s1);
				j=a*i;
				System.out.println(a+"x"+i+"="+j);
			}
	
		}
}