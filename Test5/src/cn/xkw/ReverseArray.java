package cn.xkw;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
		System.out.print("翻转前：");
		bianLiArray(arr);
		reverseArray(arr);
		System.out.print("翻转后：");
		bianLiArray(arr);
		reverseArray1(arr);
		System.out.print("翻转后：");
		bianLiArray(arr);
	}

	/**
	 * 主要思想：利用数组角标进行操作
	 * @param arr
	 */
	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length/2; i++){
			swap(arr,i,arr.length-1-i);
		}
	}
	public static void reverseArray1(int[] arr)
	{
		for(int start=0,end=arr.length-1; start<end; start++,end--)
		{
			swap(arr,start,end);
		}
	}

	private static void bianLiArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
