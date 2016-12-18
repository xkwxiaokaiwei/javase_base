package cn.xkw;

//定义USB接口
interface USB{
	public void open();
	public void close();
}

public class InterfaceInstancePC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse mouse = new Mouse();
		useUSB(mouse);
	}
public static void	useUSB(USB usb){
		if(usb!=null){
			usb.open();
			usb.close();
		}
	}
}

class Mouse implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("鼠标开启");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("鼠标关闭");
	}
	
}