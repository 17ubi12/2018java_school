package d0529;
import java.util.*;
class yy{
	Scanner sc= new Scanner(System.in);
	String ss[]= {"---","---","---","---","---","---","---","---","---","---"};
	String as[]= {"---","---","---","---","---","---","---","---","---","---"};
	String bs[]= {"---","---","---","---","---","---","---","---","---","---"};
	String name;
	int number;
	int remove;
	String remove_name;
	public void start() {
		while(true){
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int cho= sc.nextInt();
			switch(cho){
				case 1:
					this.reserve(cho);
					break;
				case 2:
					this.show();
					break;
				case 3:
					System.out.print("�¼� S:1, A:2, B:3>>");
					this.remove= sc.nextInt();
					this.remove_sit(remove);
					break;
				case 4:
					System.exit(0);
			}
		}
	}
	private void reserve(int cho) {//����
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int sit= sc.nextInt();
		switch(sit){
			case 1:
				System.out.print("S>> ");
				this.insert(this.ss);
				break;
			case 2:
				System.out.print("A>> ");
				this.insert(this.as);
				break;
			case 3:
				System.out.print("B>> ");
				this.insert(this.bs);
				break;
		}
	}
	private void insert(String[] s) {//���� sub
		for(int i=0;i<s.length;i++){System.out.print(s[i] +" ");}
		System.out.println("");
		System.out.print("�̸�>>");
		name= sc.next();
		System.out.print("��ȣ>>");
		number= sc.nextInt();
		if(number>=0&&number<=10)
			if(s[number-1]!="---")
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			else
				s[number-1]= name;
		else
			System.out.println("���� �¼���ȣ�Դϴ�.");
	}	
	private void show() {//��ȸ
		System.out.print("S>> ");
		for(int i=0;i<ss.length;i++){System.out.print(ss[i] +" ");}
		System.out.println("");
		System.out.print("A>> ");
		for(int i=0;i<as.length;i++){System.out.print(as[i] +" ");}
		System.out.println("");
		System.out.print("B>> ");
		for(int i=0;i<bs.length;i++){System.out.print(bs[i] +" ");}
		System.out.println("");
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	private void remove_sit(int i) {//���
		switch(i){
		case 1:
			System.out.print("S>> ");
			remove_insert(ss);
			break;
		case 2:
			System.out.print("A>> ");
			remove_insert(as);
			break;
		case 3:
			System.out.print("B>> ");
			remove_insert(bs);
			break;
		}	
	}
	private void remove_insert(String[] s) {//��� sub
		for(int k=0;k<s.length;k++){System.out.print(s[k] +" ");}
		System.out.println("");
		System.out.print("�̸�>>");
		remove_name= sc.next();
		for(int k=0;k<s.length;k++){if(s[k].equals(remove_name)) s[k]="---";}
	}
}
public class c1 {
	public static void main(String[] args) {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		yy a= new yy();
		a.start();
	}
}