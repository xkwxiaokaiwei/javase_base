package cn.xkw;

public class SelectSort2 {
	public static void main(String[] args){
		//1.�ȶ���һ������
		int [] arr = new int []{3, 7, 5, 4, 0, 8, 9, 6, 2, 1};
		//2.��������������
		System.out.print("����֮ǰ����˳��");
		arrBianli(arr);
		//3.��С�������
		System.out.print("��С��������˳��");
		selectSortStartMin(arr);;
		arrBianli(arr);
		//4.�Ӵ�С���
		System.out.print("�Ӵ�С����˳��");
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
	 * ����˼·��ʵ��ѡ�����򣺽��Ƚϵ�����ֵ�ͽǱ��¼�������ͺ���ıȽϣ���������С�����¼�������ֵ��
	 * �Ǳ꣬Ȼ��ͨ���Ǳ꽻����ֵ
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
