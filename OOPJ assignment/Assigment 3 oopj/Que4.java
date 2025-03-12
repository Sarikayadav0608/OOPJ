public class Que4{
	public static void main(String[] args){
		int arr[] = {1,7,4,2,9,8,6,3};
		CountEvenOdd(arr);
	}
	
	public static void CountEvenOdd(int[] arr){
		int ecount=0, ocount=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				ecount++;
			} else {
				ocount++;
			}
		}	
		System.out.println("Even Count: " + ecount +  ", Odd Count: " + ocount);		
		
	}
}