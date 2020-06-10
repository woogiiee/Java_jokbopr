package jokbopr0604;

class Business implements Cloneable {
	private String company;
	private String work;

	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}

	public void showBusinessInfo() {
		System.out.println("ȸ��: " + company);
		System.out.println("����: " + work);
	}
}

class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;

	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}

	public void showPersonalInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		bz.showBusinessInfo();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		PersonalInfo cpy = (PersonalInfo) super.clone();
		cpy.name = new String(name);
		return cpy;
	}
}

public class Personclo {
	public static void main(String[] args) {
		PersonalInfo org = new PersonalInfo("����",20,"ȸ��","����");
		PersonalInfo cpy;
		
		try {
			cpy = (PersonalInfo)org.clone();
			org.showPersonalInfo();
			cpy.showPersonalInfo();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
			
		}
	}
}
