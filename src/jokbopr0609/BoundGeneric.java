package jokbopr0609;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class BoundGeneric {
	public static <T> boolean compBox(Box<? extends T> box, T con) {
		T bc = box.get();
//		box.set(con);
		return bc.equals(con);
	}

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);
		Box<String> box2 = new Box<>();
		box2.set("Poly");

		if (compBox(box1, 25))
			System.out.println("���ھȿ� 25����");
		if (compBox(box2, "Moly"))
			System.out.println("���ھȿ� Moly ����");

		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}
