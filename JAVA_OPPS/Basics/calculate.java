//Q7
import java.util.*;
class calculate
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int m1=sc.nextlnt();
	int m2=sc.nextlnt();
	int m3=sc.nextlnt();
	int m4=sc.nextlnt();
	int m5=sc.nextlnt();
	
	total=m1+m2+m3+m4+m5;
		
	System.out.println("Total" +total);
	float percentage=(total/5)*100;
	System.out.println("Percentage:" +percentage);
	}
}