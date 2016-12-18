package cn.xkw;

public class InnerTest {
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}
class Outer
{
	int num = 3;
	class Inner
	{
		int num = 4;
		void show()
		{
			int num = 5;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}
	void method()
	{
		new Inner().show();
	}
}
//Êä³ö½á¹û£º
//5
//4
//3

