package d0523;
import java.util.*;
public class qwe {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		/* 3�� */
//		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
//		int money=a.nextInt();
//		int o= money/50000;
//		System.out.println("�������� "+o+"��");
//		int m= money%50000/10000;
//		System.out.println("������ "+m+"��");
//		int c= money%50000%10000/1000;
//		System.out.println("õ���� "+c+"��");
//		int b= money%50000%10000%1000/100;
//		System.out.println("����� "+b+"��");
//		int os= money%50000%10000%1000%100/50;
//		System.out.println("���ʿ��� "+os+"��");
//		int s= money%50000%10000%1000%100%50/10;
//		System.out.println("�ʿ��� "+s+"��");
//		int il= money%50000%10000%1000%100%50%10;
//		System.out.println("�Ͽ��� "+il+"��");
		/* 4�� */
//		System.out.print("���� 3�� �Է�>>");
//		int n1= a.nextInt();
//		int n2= a.nextInt();
//		int n3= a.nextInt();
//		if((n1>=n2&&n1<=n3)||(n1>=n3&&n1<=n2)){
//			System.out.println("�߰� ���� "+n1);
//		}else if((n2>=n1&&n2<=n3)||(n2>=n3&&n2<=n1)){
//			System.out.println("�߰� ���� "+n2);
//		}else{
//			System.out.println("�߰� ���� "+n3);
//		}
		/* 11�� */
//		System.out.print("���� �Է��ϼ���(1~12)>>");
//		int d= a.nextInt();
//		if(d>=3&&d<=5){
//			System.out.println("��");
//		}else if(d>=6&&d<=8){
//			System.out.println("����");
//		}else if(d>=9&&d<=11){
//			System.out.println("����");
//		}else if(d==12||d==1||d==2){
//			System.out.println("�ܿ�");
//		}
		/* 12�� */
		System.out.println("����>>");
		int n1=a.nextInt();
		String y=a.next();
		int n2=a.nextInt();
		String r=n1+""+y+""+n2;
		switch (y) {
		case "+":
			System.out.println(r+"�� ��� ����� "+(n1+n2));
			break;
		case "=":
			System.out.println(r+"�� ��� ����� "+(n1==n2));
			break;
		case "*":
			System.out.println(r+"�� ��� ����� "+(n1*n2));
			break;
		case "/":
			if(n2==0){
				System.out.println("0���� ���� �� �����ϴ�.");
				break;
			}
			System.out.println(r+"�� ��� ����� "+(n1/n2));
			break;
		default:
			System.out.println("??");
			break;
		}
		a.close();
	}

}
