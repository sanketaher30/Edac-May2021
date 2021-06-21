class Recursion2
{
	ststic int fact(int n)
	{
		//base condition
		if(n<=1)
			return 1;
		//recursion 
		else
			retune n*fact(n-1);
	}
public static void main(String []args)
{
System.out.println(fact(5));
}
}