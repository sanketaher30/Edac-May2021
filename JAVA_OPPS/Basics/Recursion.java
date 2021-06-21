class Recursion
{
	static int i=0;
	static void show()
	{
	i++;
	if(i<=3)
	{
	System.out.println("Hi Guys!!!");
	show();
	}
}
public static void main(String []args)
{
System.out.println("Hi.....");
show();
}
}