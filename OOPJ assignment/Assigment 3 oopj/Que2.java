public class Que2{
	public static void main(String[] args){
		int arr[] = {2,4,6,8,10,12,14,16,18,20};
		int low = 0, high = arr.length-1;
		
		System.out.println("Before: ");
		for(int n : arr){
			System.out.print(n + " ");
		}
		
		while(low<high){
			arr[high] = arr[high] + arr[low];
			arr[low] = arr[high] - arr[low];
			arr[high] = arr[high] - arr[low];
			low++;
			high--;
		}
		
		System.out.println("\nAfter: ");
		for(int n : arr){
			System.out.print(n + " ");
		}
	}
}