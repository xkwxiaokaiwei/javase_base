package cn.xkw;

public class HalfSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9,};
		int num = 10;
		int index = halfSearch(arr, num);
		if(index==-1){
			System.out.println("�����ҵ���ֵ����������");
		}else{
			System.out.println("�����ڵ���ֵnum="+num+"������Ϊarr["+index+"]��");
		}
	}

	private static int halfSearch(int[] arr, int num) {
		// TODO Auto-generated method stub
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (min + max)/2;
		while(mid!=num){
			if(num>mid){
				min = mid+1;
			}else{
				max = mid-1;
			}
			
			if(min>max)
				return -1;
			
			mid = (min+max)/2;
		}
		return mid;
	}

}
