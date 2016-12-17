package cn.xkw;

public class ArrayMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,7,8,9,2,4,6};
		System.out.print("数组初始值：");
		arrBianli(arr);
		int max = arrMax(arr) ;
		System.out.println("数组最大值："+max);
		int min = arrMin(arr) ;
		System.out.println("数组最小值："+min);
	}

	private static int arrMin(int[] arr) {
		// TODO Auto-generated method stub
		int temp = arr[0];
		// TODO Auto-generated method stub
		for(int i=1; i<arr.length; i++){
			if(arr[i]<temp){
				temp = arr[i];
			}
		}
		return temp;
	}

	private static void arrBianli(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	private static int arrMax(int[] arr) {
		int temp = arr[0];
		// TODO Auto-generated method stub
		for(int i=1; i<arr.length; i++){
			if(arr[i]>temp){
				temp = arr[i];
			}
		}
		return temp;
	}

}
