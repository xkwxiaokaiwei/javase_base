package cn.xkw;
class Fu
{
	int num ;
	Fu()
	{
		num =10;
		System.out.println("A fu run "+num);
	}
	Fu(int x)
	{
		System.out.println("B fu run "+x);
	}
}
class Zi extends Fu
{
	int num;
	Zi()
	{
		//super();//���õľ��Ǹ����еĿղ����Ĺ��캯����
		
		System.out.println("C zi run "+num);
	}
	Zi(int x)
	{
		this();
		//super();
		//super(x);
		System.out.println("D zi run "+x);
	}
}

public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zi();
		new Zi(6);
	}

}
