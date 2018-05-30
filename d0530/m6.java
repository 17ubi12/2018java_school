package d0530;
class ColorPoint{
	String color="BLACK";
	int x=0,y=0;
	public ColorPoint(int i, int j) {
		this.x=i;
		this.y=j;
	}
	public ColorPoint() {
		this.x=0;
		this.y=0;
		this.color="BLACK";
	}
	public String toString(){
		return this.color +"����("+ this.x +","+ this.y +")�� ���Դϴ�.";
	}
	public void setXY(int i, int j) {
		this.x=i;
		this.y=j;
	}
	public void setColor(String i) {
		this.color=i;
	}
}
public class m6 {
	public static void main(String[] args) {
		ColorPoint zeroPoint= new ColorPoint();
		System.out.println(zeroPoint.toString() +"�Դϴ�.");
		ColorPoint cp= new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() +"�Դϴ�.");
	}
}
