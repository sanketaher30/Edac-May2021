	// Q.1
public class MaxValue
{
	public static void main(String args[])
	{
		int arr[]= new int [] {11,22,10,50,44};
		int max = arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("MaxValue in the array: " +max);
	}
}
		