package cn.xkw;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
		System.out.print("��תǰ��");
		bianLiArray(arr);
		reverseArray(arr);
		System.out.print("��ת��");
		bianLiArray(arr);
		reverseArray1(arr);
		System.out.print("��ת��");
		bianLiArray(arr);
	}

	/**
	 * ��Ҫ˼�룺��������Ǳ���в���
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
