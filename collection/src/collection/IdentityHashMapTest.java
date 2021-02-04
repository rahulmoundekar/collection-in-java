package collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapTest {

	public static void main(String[] args) {

		HashMap hm = new HashMap<>();
		hm.put(1, "abc");
		hm.put("a", 101);

		System.out.println(hm);

		Set s = hm.keySet(); // return only keys
		for (Object key : s) {
			System.out.println(key);
			Object obj1 = hm.get(key);
			System.out.println(obj1);
		}
		System.out.println("+++++++++++++++");
		
		Set s1=hm.entrySet(); //return key value -Map.Entry:key,value
		for (Object object : s1) {
			Map.Entry me=(Map.Entry)object;
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		System.out.println("+++++++++equality check in HashMap+++++++++++");
		
		HashMap hm1=new HashMap<>();
		hm1.put("abc", 12);
		hm1.put(new String("abc"), 34);
		
		System.out.println(hm1);
		
		
		System.out.println("+++++++++equality check in identityHashMap+++++++++++");
		
		IdentityHashMap ihm1=new IdentityHashMap<>();
		ihm1.put("abc", 12);
		ihm1.put(new String("abc"), 34);
		
		System.out.println(ihm1);
		
		
		

	}

}
