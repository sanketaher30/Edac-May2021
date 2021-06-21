public class MinValue
{
	public static void main(String args[])
	{
		int arr[] = new int [] {11,22,10,50,44};
		int min = arr[0];
			for (int i=0; i<arr.length;i++)
			{
				if(arr[i]< min)
					min = arr[i];
			}
			System.out.println("MinValue in the Array: " + min);
	}
}