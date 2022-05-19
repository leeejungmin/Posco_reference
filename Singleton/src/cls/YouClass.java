package cls;

import single.SingletonClass;

public class YouClass {

	private int count;
	
	public YouClass() {
	}
	
	public void func() {
		SingletonClass sc = SingletonClass.getInstance();
		count = sc.num;
	}
	/*
	public void setCount(int count) {
		this.count = count;
	}
	*/

	@Override
	public String toString() {
		return "YouClass [count=" + count + "]";
	}
	
	
}
