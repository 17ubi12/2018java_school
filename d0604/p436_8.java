package d0604;
import java.util.*;
public class p436_8 {
	public static void main(String[] args) {
		HashMap<String, Integer> po= new HashMap<String, Integer>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true){
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name= sc.next();
			int age= sc.nextInt();
			if(name.equals("�׸�"))
				break;
			if(po.get(name)!=null)
				po.put(name, po.get(name)+age);
			else
				po.put(name, age);
			Set<String> keys= po.keySet();
			Iterator<String> it= keys.iterator();
			while(it.hasNext()){
				String key= it.next();
				int value= po.get(key);
				System.out.print("("+ key +","+ value +")");
			}
			System.out.println("");
		}
	}
}
