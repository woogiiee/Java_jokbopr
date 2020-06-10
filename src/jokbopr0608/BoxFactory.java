package jokbopr0608;
class Box<T>{
//	private T ob;
//	
//	public void set(T o) {
//		ob = o;
//	}
//	public T get() {
//		return ob;
//	}
//}
//public class BoxFactory {
//	public static <T> Box<T> makeBox(T o){
//		Box<T> box = new Box<T>();
//		box.set(o);
//		return box;
//	}
//}
private T ob;

public void set(T o) {
	ob= o;
}
public T get() {
	return ob;
}



}

public class BoxFactory{
	public static <T> Box<T> makeBox(T o){
		Box<T> box= new Box<T>();
		box.set(o);
		return box;
	}
}