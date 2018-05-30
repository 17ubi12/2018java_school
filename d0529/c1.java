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
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int cho= sc.nextInt();
			switch(cho){
				case 1:
					this.reserve(cho);
					break;
				case 2:
					this.show();
					break;
				case 3:
					System.out.print("좌석 S:1, A:2, B:3>>");
					this.remove= sc.nextInt();
					this.remove_sit(remove);
					break;
				case 4:
					System.exit(0);
			}
		}
	}
	private void reserve(int cho) {//예약
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
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
	private void insert(String[] s) {//예약 sub
		for(int i=0;i<s.length;i++){System.out.print(s[i] +" ");}
		System.out.println("");
		System.out.print("이름>>");
		name= sc.next();
		System.out.print("번호>>");
		number= sc.nextInt();
		if(number>=0&&number<=10)
			if(s[number-1]!="---")
				System.out.println("이미 예약된 자리입니다.");
			else
				s[number-1]= name;
		else
			System.out.println("없는 좌석번호입니다.");
	}	
	private void show() {//조회
		System.out.print("S>> ");
		for(int i=0;i<ss.length;i++){System.out.print(ss[i] +" ");}
		System.out.println("");
		System.out.print("A>> ");
		for(int i=0;i<as.length;i++){System.out.print(as[i] +" ");}
		System.out.println("");
		System.out.print("B>> ");
		for(int i=0;i<bs.length;i++){System.out.print(bs[i] +" ");}
		System.out.println("");
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	private void remove_sit(int i) {//취소
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
	private void remove_insert(String[] s) {//취소 sub
		for(int k=0;k<s.length;k++){System.out.print(s[k] +" ");}
		System.out.println("");
		System.out.print("이름>>");
		remove_name= sc.next();
		for(int k=0;k<s.length;k++){if(s[k].equals(remove_name)) s[k]="---";}
	}
}
public class c1 {
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		yy a= new yy();
		a.start();
	}
}