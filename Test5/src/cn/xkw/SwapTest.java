package cn.xkw;

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1,b =2;
		int[] arr = {a,b};
		System.out.println("����ǰ��a="+a +";b="+b);
		swap(arr,a,b);
		System.out.println("������a="+arr[0] +";b="+arr[1]);

	}

	/**
	 * ��java��ʵ������������C��C++�в�ͬ��java��û��ָ�룬���Կ��Դ�����������
	 * ��������ĽǱ�ʵ�ֽ���
	 * @param arr
	 * @param a
	 * @param b
	 */
	private static void swap(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	
	}

}
