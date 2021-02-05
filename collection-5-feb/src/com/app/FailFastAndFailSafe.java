package com.app;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailFastAndFailSafe {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add(44);
		list.add(2334);
		list.add(234);
		list.add("dsafds");

		ListIterator itr = list.listIterator();
		while (itr.hasNext()) {
			itr.add(100);
			Object object = itr.next();
			System.out.println(object);
		}
		
		System.out.println(list);

	}

}
