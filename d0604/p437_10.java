package d0604;
import java.util.*;
abstract class Shape{
	String name;
	public String show(){
		return this.name;
	}
}
class Line extends Shape{
	public Line() {
		this.name="Line";
	}
}
class Rect extends Shape{
	public Rect() {
		this.name="Rect";
	}
}
class Circle extends Shape{
	public Circle() {
		this.name="Circle";
	}
}
public class p437_10 {
	static void show(Vector<Shape> a){
		Iterator<Shape> it= a.iterator();
		while(it.hasNext()){
			Shape i=it.next();
			System.out.println(i.show());
		}
	}
	public static void main(String[] args) {
		Vector<Shape> v= new Vector<Shape>();
		Scanner sc=new Scanner(System.in);
		
		boolean y=true;
		int b;
		System.out.println("�׷��� ������ beaut�� �����մϴ�.");
		while(y){
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int a=sc.nextInt();
			switch (a) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				b= sc.nextInt();
				Shape c = null;
				switch(b){
					case 1:
						c=new Line();
						break;
					case 2:
						c=new Rect();
						break;
					case 3:
						c=new Circle();
						break;
				}
				v.add(c);
				break;
			case 2:
				System.out.print("������ ������ ��ġ>>");
				b= sc.nextInt();
				if(v.size()<b)
					System.out.println("������ �� �����ϴ�.");
				else
					v.remove(b-1);
				break;
			case 3:
				show(v);
				break;
			case 4:
				y=false;
				System.out.println("beauty�� �����մϴ�.");
				break;
			default:
				break;
			}
		}
	}

}
