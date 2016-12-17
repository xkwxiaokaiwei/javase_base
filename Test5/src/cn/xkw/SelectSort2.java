package cn.xkw;

public class SelectSort2 {
	public static void main(String[] args){
		//1.先定义一个数组
		int [] arr = new int []{3, 7, 5, 4, 0, 8, 9, 6, 2, 1};
		//2.遍历输出数组输出
		System.out.print("排序之前数组顺序：");
		arrBianli(arr);
		//3.从小到大输出
		System.out.print("从小到大数组顺序：");
		selectSortStartMin(arr);;
		arrBianli(arr);
		//4.从大到小输出
		System.out.print("从大到小数组顺序：");
		selectSortStartMax(arr);
		arrBianli(arr);	
	}

	private static void selectSortStartMax(int[] arr) {
		// TODO Auto-generated method stub
		for(int x=0; x<arr.length-1; x++){
			int num = arr[x];
			int index = x;
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]>num){
					num = arr[y];
					index = y;
				}
			}
			if(index!=x){
				swap(arr, x, index);
			}
		}
	}

	/**
	 * @param arr
	 * 换种思路来实现选择排序：将比较的数的值和角标记录下来，和后面的比较，如果后面的小，则记录后面的数值和
	 * 角标，然后通过角标交换数值
	 */
	private static void selectSortStartMin(int[] arr) {
		// TODO Auto-generated method stub
		for(int x=0; x<arr.length-1; x++){
			int num = arr[x];
			int index = x;
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]<num){
					num = arr[y];
					index = y;
				}
			}
			if(index!=x){
				swap(arr, x, index);
			}
		}
	}

	private static void swap(int[] arr, int x, int y) {
		// TODO Auto-generated method stub
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	private static void arrBianli(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
