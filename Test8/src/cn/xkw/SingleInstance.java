package cn.xkw;

public class SingleInstance {
	private static SingleInstance s = new SingleInstance();
	private  SingleInstance() {}
	public static SingleInstance getInstance(){
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInstance s1 = new SingleInstance();
		SingleInstance s2 = new SingleInstance();
		System.out.println(s1==s2);
		SingleInstance s3 = SingleInstance.getInstance();
		SingleInstance s4 = SingleInstance.getInstance();
		System.out.println(s3==s4);
	}

}
