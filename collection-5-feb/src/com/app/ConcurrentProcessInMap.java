package com.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentProcessInMap {

	public static void main(String[] args) {

		/*
		 * HashMap mh = new HashMap<>(); mh.put("Pune", 020); mh.put("Mumbai", 202);
		 * 
		 * Set s = mh.keySet(); Iterator itr = s.iterator(); while (itr.hasNext()) {
		 * mh.put("Nashik", 012); Object object = (Object) itr.next();
		 * System.out.println(object);
		 * 
		 * }
		 */

		ConcurrentHashMap mh = new ConcurrentHashMap<>();
		mh.put("Pune", 020);
		mh.put("Mumbai", 202);

		Set s = mh.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			mh.put("Nashik", 012);
			Object object = (Object) itr.next();
			System.out.println(object);

		}

	}

}
