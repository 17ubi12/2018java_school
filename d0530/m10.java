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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+ dic.get("이재문"));
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
	}
}