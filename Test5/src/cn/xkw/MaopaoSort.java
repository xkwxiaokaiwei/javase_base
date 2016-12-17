package cn.xkw;

public class MaopaoSort {

	/**
	 * @param args
	 * ���ܣ���ð������ʵ�����飬��ӡ�������ǰ��仯����С���󣬴Ӵ�С�����
	 */
	public static void main(String[] args) { // TODO Auto-generated method stub
		//1.�ȶ���һ������
		int [] arr = new int []{3, 7, 5, 4, 0, 8, 9, 6, 2, 1};
		//2.��������������
		System.out.print("����֮ǰ����˳��");
		arr_bianli(arr);
		//3.��С�������
		System.out.print("��С��������˳��");
		maopaoSortStartMin(arr);
		//4.�Ӵ�С���
		arr_bianli(arr);
		System.out.print("�Ӵ�С����˳��");
		maopaoSortStartMax(arr);
		arr_bianli(arr);	
	}

	/**
	 * @param arr
	 * ��������
	 */
	private static void arr_bianli(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	/**
	 * �Ӵ�Сð������
	 * @param arr
	 */
	/**
	 * ð������˼�룺��ͷ���ߴ�β��ʼ�Ƚ���������С��ʼ�������ڵ��������Ƚϣ�������С���򽻻�
	 * ע�⣺��������Ƚϣ�����ֻ��Ƚ�N-1�μ��ɡ�
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
	 * ��С����ð������
	 */
	private static void maopaoSortStartMin(int [] arr) { // TODO Auto-generated method stub
		//1.����forѭ��
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
