package d0530;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap{
	String name[];
	String val[];
	int num=0;
	boolean a=true;
	public Dictionary(int i) {
		this.name= new String[i];
		this.val= new String[i];
	}
	String get(String key) {
		for(int i=0;i<this.length();i++){
			if(this.name[i].equals(key))				
				return this.val[i];
		}
		return null;
	}
	void put(String key, String value) {
		for(int i=0;i<this.length();i++){
			if(name[i]!=null&&name[i].equals(key)){
				this.name[i]=key;
				this.val[i]=value;
				a=false;
			}
		}
		if(a){
			this.name[this.num]=key;
			this.val[this.num]=value;
			this.num++;
		}
		a=true;
	}
	String delete(String key) {
		for(int i=0;i<this.length();i++){
			if(this.name[i]!=null&&this.name[i].equals(key))
				this.val[i]=null;
		}
		return null;
	}
	int length() {
		return num;
	}
}
public class m10 {
	public static void main(String[] args) {
		Dictionary dic= new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+ dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����"));
	}
}