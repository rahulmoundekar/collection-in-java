package collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {
		
		Country country=new Country();
		country.setCountryName("India");

	/*	HashMap hashMap=new HashMap<>();
		hashMap.put(country, "Maharashtra");
		
		country=null;
		System.gc();
		
		System.out.println(hashMap);*/
		
		
		
		WeakHashMap hashMap=new WeakHashMap<>();
		hashMap.put(country, "Maharashtra");
		
		country=null;
		System.gc();
		
		System.out.println(hashMap);
		
	
	}

}
