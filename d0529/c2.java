package d0529;

abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
class Gsg extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum= 0;
		for (int i=0;i<a.length;i++)
			sum += a[i];
		return sum/a.length;
	}
}

// interface
interface PhoneInterface{
	int BUTTONS= 20;
	void sendCall();
	void receiveCall();
}
interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface {
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("��ȭ �ɱ�");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �ޱ�");
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS ������");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("SMS �ޱ�");
	}
	
	@Override
	public void play() {
		System.out.println("���� ���");
	}
	@Override
	public void stop() {
		System.out.println("��� ����");
	}

	public void schedule() {
		System.out.println("���� ����");
	}
	
}
public class c2{

	public static void main(String[] args) {
//		Gsg a= new Gsg();
//		int b[]= {1,2,3};
//		System.out.println(a.add(3, 2));
//		System.out.println(a.subtract(3, 2));
//		System.out.println(a.average(b));
		SmartPhone p= new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3,5));
		p.schedule();
	}

}
