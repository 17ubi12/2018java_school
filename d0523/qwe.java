package d0523;
import java.util.*;
public class qwe {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		/* 3번 */
//		System.out.print("금액을 입력하시오>>");
//		int money=a.nextInt();
//		int o= money/50000;
//		System.out.println("오만원권 "+o+"매");
//		int m= money%50000/10000;
//		System.out.println("만원권 "+m+"매");
//		int c= money%50000%10000/1000;
//		System.out.println("천원권 "+c+"매");
//		int b= money%50000%10000%1000/100;
//		System.out.println("백원권 "+b+"개");
//		int os= money%50000%10000%1000%100/50;
//		System.out.println("오십원권 "+os+"개");
//		int s= money%50000%10000%1000%100%50/10;
//		System.out.println("십원권 "+s+"개");
//		int il= money%50000%10000%1000%100%50%10;
//		System.out.println("일원권 "+il+"개");
		/* 4번 */
//		System.out.print("정수 3개 입력>>");
//		int n1= a.nextInt();
//		int n2= a.nextInt();
//		int n3= a.nextInt();
//		if((n1>=n2&&n1<=n3)||(n1>=n3&&n1<=n2)){
//			System.out.println("중간 값은 "+n1);
//		}else if((n2>=n1&&n2<=n3)||(n2>=n3&&n2<=n1)){
//			System.out.println("중간 값은 "+n2);
//		}else{
//			System.out.println("중간 값은 "+n3);
//		}
		/* 11번 */
//		System.out.print("달을 입력하세요(1~12)>>");
//		int d= a.nextInt();
//		if(d>=3&&d<=5){
//			System.out.println("봄");
//		}else if(d>=6&&d<=8){
//			System.out.println("여름");
//		}else if(d>=9&&d<=11){
//			System.out.println("가을");
//		}else if(d==12||d==1||d==2){
//			System.out.println("겨울");
//		}
		/* 12번 */
		System.out.println("연산>>");
		int n1=a.nextInt();
		String y=a.next();
		int n2=a.nextInt();
		String r=n1+""+y+""+n2;
		switch (y) {
		case "+":
			System.out.println(r+"의 계산 결과는 "+(n1+n2));
			break;
		case "=":
			System.out.println(r+"의 계산 결과는 "+(n1==n2));
			break;
		case "*":
			System.out.println(r+"의 계산 결과는 "+(n1*n2));
			break;
		case "/":
			if(n2==0){
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			System.out.println(r+"의 계산 결과는 "+(n1/n2));
			break;
		default:
			System.out.println("??");
			break;
		}
		a.close();
	}

}
