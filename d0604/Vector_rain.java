package d0604;
import java.util.*;
public class Vector_rain {
//4��
	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>();
		Iterator<Integer> it= v.iterator();
		
		Scanner sc=new Scanner(System.in);
		int n;
		while(true){
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			n=sc.nextInt();
			if(n==0)
				break;
			v.add(n);
			int sum= 0;
			it= v.iterator();
			
			while(it.hasNext()){
				int i=it.next();
				System.out.print(i+" ");
				sum += i;
			}
			System.out.println("");
			System.out.println("���� ��� "+ sum/v.size());
		}

	}

}
