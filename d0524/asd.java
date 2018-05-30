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

		/* 생성자 2개 */
		asd pizza= new asd(10, "자바피자");
		double area= pizza.getArea();
		System.out.println(pizza.name+ "의 면적은"+ area);
		
		asd donut= new asd();
		donut.name= "도넛피자";
		area= donut.getArea();
		System.out.println(donut.name+ "의 면적은"+ area);
		
	}
}
/* 4번문제 */
//System.out.println("소문자 알파벳 하나를 입력하시요>>");
//String a=sc.next();
//char f= a.charAt(0);
//for(char i=f;i>='a';i--){
//	for(char j=i;j>='a';j--){
//		System.out.print(j);
//	}
//	System.out.println("");
//}
/* 5번문제 */
//int []i= new int[10];
//System.out.println("양의 정수 10개를 입력하시요>>");
//for(int q=0;q<=9;q++){
//	i[q]=sc.nextInt();
//}
//System.out.print("3의 배수는 ");
//for(int j=0;j<=9;j++){
//	if(i[j]%3==0){
//		System.out.print(i[j]+" ");
//	}
//}
/* 7번문제 */
//double []i= new double[10];
//double f=0;
//System.out.print("랜덤한 정수둘 : ");
//for(int j=0;j<=9;j++){
//	i[j]=Math.random()*10+1;
//	f+=(int) i[j];
//	System.out.print((int)i[j]+" ");
//}
//System.out.println("");
//System.out.println("평균은 "+ f/10);그바ㅇ
/* 16번문제 */
//System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
//boolean w=true;
//while(w){
//	System.out.print("가위 바위 보!>>");
//	String p= sc.next();
//	
//	String str[] = {"가위", "바위", "보"};
//	int n= (int)(Math.random()*3);// 0,1,2
//	switch (p) {
//	case "가위":
//		if(str[n]=="가위"){
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
//		}else if(str[n]=="바위"){
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 사용자가 졌습니다.");
//		}else{
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 사용자가 아겼습니다.");
//		}
//		break;
//	case "바위":
//		if(str[n]=="가위"){
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
//		}else if(str[n]=="바위"){
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
//		}else{
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 사용자가 졌습니다.");
//		}		
//		break;
//	case "보":
//		if(str[n]=="가위"){
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 사용자가 졌습니다.");
//		}else if(str[n]=="바위"){
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
//		}else{
//			System.out.println("사용자 = "+p+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
//		}
//		break;
//	case "그만":
//		System.out.println("게임을 종료합니다...");
//		w=false;
//		break;
//	default:
//		System.out.println("정상적인거를 내줘요.");
//		break;
//	}
//}
/* class */
//aaa pizza= new aaa();
//pizza.radius=10;
//pizza.name="피자";
//double pizza_area=pizza.getArea();
//System.out.println(pizza_area);
//
//aaa donut=new aaa();
//donut.radius=3;
//donut.name="도넛";
//double donut_area=donut.getArea();
//System.out.println(donut_area);