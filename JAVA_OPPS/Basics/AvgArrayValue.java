public class AvgArrayValue
{
	public static void main(String args[])
	{
		int numbers [] = new int[] {11,22,10,50,44};
		int sum = 0;
		for(int i=0; i< numbers.length ; i++)
		sum = sum + numbers[i];
		double average = sum / numbers.length;
		System.out.println("Average value in the array is : " + average);
	}
}