package jokbopr0608;

public class DDBox<U,D> {
	private U left;
	private D right;
	public void set(U u, D d) {
		left=u;
		right = d;
	}
	public String toString() {return left+"&"+right;}
	
	
}
