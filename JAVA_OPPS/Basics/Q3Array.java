class Q3Array
{   //Que4
	public static void main(String []args){
		
	int [] ar = {1,2,3,4,5};
	for(int k=0; k<ar.length; k++){
		
	int temp = ar[ar.length-1];
	for(int i=ar.length-1; i>0; i--){
		ar[i]= ar[i-1];
	}
	ar[0] = temp;
	for(int i=0; i<ar.length; i++){
		System.out.print(ar[i]+" ");
	}
	 System.out.println();
	}
 }
}
//done