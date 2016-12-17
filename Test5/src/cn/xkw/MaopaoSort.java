package cn.xkw;

public class MaopaoSort {

	/**
	 * @param args
	 * 功能：用冒泡排序实现数组，打印输出数组前后变化；从小到大，从大到小都输出
	 */
	public static void main(String[] args) { // TODO Auto-generated method stub
		//1.先定义一个数组
		int [] arr = new int []{3, 7, 5, 4, 0, 8, 9, 6, 2, 1};
		//2.遍历输出数组输出
		System.out.print("排序之前数组顺序：");
		arr_bianli(arr);
		//3.从小到大输出
		System.out.print("从小到大数组顺序：");
		maopaoSortStartMin(arr);
		//4.从大到小输出
		arr_bianli(arr);
		System.out.print("从大到小数组顺序：");
		maopaoSortStartMax(arr);
		arr_bianli(arr);	
	}

	/**
	 * @param arr
	 * 遍历数组
	 */
	private static void arr_bianli(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * 从大到小冒泡排序
	 * @param arr
	 */
	/**
	 * 冒泡排序思想：从头或者从尾开始比较两个数大小，始终是相邻的两个数比较，如果大或小，则交换
	 * 注意：两个数相比较，所以只需比较N-1次即可。
	 * @param arr
	 */
	private static void maopaoSortStartMax(int [] arr) {
		// TODO Auto-generated method stub
		for(int x =0; x<arr.length-1; x++){
			for(int y = 0; y<arr.length-1-x; y++){
				if(arr[y]<arr[y+1]){
					swap(arr,y ,y+1);
				}
			}
		}
	}
	private static void maopaoSortStartMax1(int [] arr) {
		// TODO Auto-generated method stub
		for(int x =arr.length-1; x>0; x--){
			for(int y = 0; y<x; y++){
				if(arr[y]<arr[y+1]){
					swap(arr,y ,y+1);
				}
			}
		}
	}

	/**
	 * 从小到大冒泡排序
	 */
	private static void maopaoSortStartMin(int [] arr) { // TODO Auto-generated method stub
		//1.两个for循环
		for(int x =0; x<arr.length-1; x++){
			for(int y = 0; y<arr.length-1-x; y++){
				if(arr[y]>arr[y+1]){
					swap(arr,y ,y+1);
				}
			}
		}
	}
	private static void swap(int []arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
