package com.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTestconcurrentProccess {

	public static void main(String[] args) {

		Set s = new HashSet<>();
		s.add("dsf");
		s.add(23);
		s.add("h");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			s.add(234);
			Object o = itr.next();
			System.out.println(o);

		}

	}

}
