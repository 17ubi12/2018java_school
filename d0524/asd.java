package d0524;
import java.util.*;
public class asd {
	
	int radius;
	String name;
	
	public asd() {
		radius= 1; name= "";
	}
	public asd(int r, String n) {
		radius= r; name= n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		/* ������ 2�� */
		asd pizza= new asd(10, "�ڹ�����");
		double area= pizza.getArea();
		System.out.println(pizza.name+ "�� ������"+ area);
		
		asd donut= new asd();
		donut.name= "��������";
		area= donut.getArea();
		System.out.println(donut.name+ "�� ������"+ area);
		
	}
}
/* 4������ */
//System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
//String a=sc.next();
//char f= a.charAt(0);
//for(char i=f;i>='a';i--){
//	for(char j=i;j>='a';j--){
//		System.out.print(j);
//	}
//	System.out.println("");
//}
/* 5������ */
//int []i= new int[10];
//System.out.println("���� ���� 10���� �Է��Ͻÿ�>>");
//for(int q=0;q<=9;q++){
//	i[q]=sc.nextInt();
//}
//System.out.print("3�� ����� ");
//for(int j=0;j<=9;j++){
//	if(i[j]%3==0){
//		System.out.print(i[j]+" ");
//	}
//}
/* 7������ */
//double []i= new double[10];
//double f=0;
//System.out.print("������ ������ : ");
//for(int j=0;j<=9;j++){
//	i[j]=Math.random()*10+1;
//	f+=(int) i[j];
//	System.out.print((int)i[j]+" ");
//}
//System.out.println("");
//System.out.println("����� "+ f/10);�׹٤�
/* 16������ */
//System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
//boolean w=true;
//while(w){
//	System.out.print("���� ���� ��!>>");
//	String p= sc.next();
//	
//	String str[] = {"����", "����", "��"};
//	int n= (int)(Math.random()*3);// 0,1,2
//	switch (p) {
//	case "����":
//		if(str[n]=="����"){
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", �����ϴ�.");
//		}else if(str[n]=="����"){
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", ����ڰ� �����ϴ�.");
//		}else{
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", ����ڰ� �ư���ϴ�.");
//		}
//		break;
//	case "����":
//		if(str[n]=="����"){
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
//		}else if(str[n]=="����"){
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", �����ϴ�.");
//		}else{
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", ����ڰ� �����ϴ�.");
//		}		
//		break;
//	case "��":
//		if(str[n]=="����"){
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", ����ڰ� �����ϴ�.");
//		}else if(str[n]=="����"){
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
//		}else{
//			System.out.println("����� = "+p+" , ��ǻ�� = "+str[n]+", �����ϴ�.");
//		}
//		break;
//	case "�׸�":
//		System.out.println("������ �����մϴ�...");
//		w=false;
//		break;
//	default:
//		System.out.println("�������ΰŸ� �����.");
//		break;
//	}
//}
/* class */
//aaa pizza= new aaa();
//pizza.radius=10;
//pizza.name="����";
//double pizza_area=pizza.getArea();
//System.out.println(pizza_area);
//
//aaa donut=new aaa();
//donut.radius=3;
//donut.name="����";
//double donut_area=donut.getArea();
//System.out.println(donut_area);