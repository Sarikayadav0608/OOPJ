public class Que7{
	public static void main(String[] args){
		int arr1[] = {15,4,5,7,18,3,1};
		print(arr1);
		rotateright(arr1, 5);
		System.out.println();
		print(arr1);
	}
	
	public static void rotateright(int[] arr, int r){
		r=r%arr.length;
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, r-1);
		reverse(arr, r, arr.length-1);
	}
	
	
	public static void reverse(int[] arr, int i, int j){
		while(i<j){
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			j--;
		}
	}
	
	public static void print(int[] arr){
		for(int n: arr)
			System.out.print(n + " ");
	}
}