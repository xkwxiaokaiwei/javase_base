package cn.xkw;

public class PrintXing {

	/**
	 * 
		      *
			 * *
			* * *
		   * * * * 
		  * * * * *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for(int x=1; x<=num; x++){
			for(int y=0; y<num-x; y++){
				System.out.print(" ");
			}
			for(int z=1; z<=x; z++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
