package jokbopr0611;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45,  "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		//key�� ��� �ִ� �÷��� �ν��Ͻ� ����
		Set<Integer> ks = map.keySet();
		
		//��ü key���(for~each ���)
		for(Integer n : ks)
			System.out.print(n.toString()+'\t');
		System.out.println();
		//��ü value ���(for~each���)
		for(Integer n :ks)
			System.out.print(map.get(n).toString()+'\t');
		System.out.println();
		
		//��ü value ���(�ݺ��� ���)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next())+'\t');
		System.out.println();
	}
}

