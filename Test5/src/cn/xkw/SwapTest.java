package cn.xkw;

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1,b =2;
		int[] arr = {a,b};
		System.out.println("交换前：a="+a +";b="+b);
		swap(arr,a,b);
		System.out.println("交换后：a="+arr[0] +";b="+arr[1]);

	}

	/**
	 * 在java中实现两数交换和C，C++中不同，java中没有指针，所以可以传递三个参数
	 * 利用数组的角标实现交换
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
