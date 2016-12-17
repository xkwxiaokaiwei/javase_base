package cn.xkw;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.先定义一个数组
				int [] arr = new int []{3, 7, 5, 4, 0, 8, 9, 6, 2, 1};
				//2.遍历输出数组输出
				System.out.print("排序之前数组顺序：");
				arr_bianli(arr);
				//3.从小到大输出
				System.out.print("从小到大数组顺序：");
				selectSortStartMin(arr);;
				arr_bianli(arr);
				//4.从大到小输出
				System.out.print("从大到小数组顺序：");
				selectSortStartMax(arr);
				arr_bianli(arr);	
	}

	/**
	 * @param arr
	 * 思想：想让第一个数和之后的每个数都比较，如果第一个数小于之后的数，则把这两个数交换，一轮下来，
	 * 使得第一个数为最大数，一次类推
	 * 注意：最后一轮不需要再比，必然为最小数
	 */
	private static void selectSortStartMax(int[] arr) {
		// TODO Auto-generated method stub
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++){
				if(arr[x]<arr[y]){
					swap(arr,x ,y);
				}
			}
		}
	}

	private static void selectSortStartMin(int[] arr) {
		// TODO Auto-generated method stub
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++){
				if(arr[x]>arr[y]){
					swap(arr,x ,y);
				}
			}
		}
	}

	/**
	 * 遍历数组输出
	 * @param arr
	 */
	private static void arr_bianli(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	private static void swap(int []arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}


}
