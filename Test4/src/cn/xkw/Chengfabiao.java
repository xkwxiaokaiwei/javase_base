package cn.xkw;

public class Chengfabiao {
	public static void main(String[] args){
		int num = 10;
		chengfabiao(num);
	}

	/**
	 * 
	 * 	1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
	 * @param num
	 */
	private static void chengfabiao(int num) {
		// TODO Auto-generated method stub
		for(int x=1; x<=num; x++){
			for(int y=1; y<=x; y++){
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}
