package cn.xkw;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.�ȶ���һ������
				int [] arr = new int []{3, 7, 5, 4, 0, 8, 9, 6, 2, 1};
				//2.��������������
				System.out.print("����֮ǰ����˳��");
				arr_bianli(arr);
				//3.��С�������
				System.out.print("��С��������˳��");
				selectSortStartMin(arr);;
				arr_bianli(arr);
				//4.�Ӵ�С���
				System.out.print("�Ӵ�С����˳��");
				selectSortStartMax(arr);
				arr_bianli(arr);	
	}

	/**
	 * @param arr
	 * ˼�룺���õ�һ������֮���ÿ�������Ƚϣ������һ����С��֮������������������������һ��������
	 * ʹ�õ�һ����Ϊ�������һ������
	 * ע�⣺���һ�ֲ���Ҫ�ٱȣ���ȻΪ��С��
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
	 * �����������
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
