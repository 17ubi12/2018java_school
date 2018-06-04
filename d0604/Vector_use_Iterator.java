package d0604;
import java.util.*;
public class Vector_use_Iterator {

	public static void main(String[] args) {
		//정수 제너릭 벡터
		Vector<Integer> v= new Vector<Integer>();
		v.add(5);//++
		v.add(4);//++
		v.add(-1);//++
		v.add(2, 100);//++
		
		//Iterator를 이용한 모든 정수 출력
		Iterator<Integer> it= v.iterator();
		while(it.hasNext()){
			int n= it.next();
			System.out.println(n);
		}
		
		//Iterator를 이용한 모든 정수 더하기
		int sum= 0;
		it= v.iterator();
		while(it.hasNext()){
			int n= it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: "+ sum);
	}

}
