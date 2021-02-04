# collection-in-java
Collection framework

List

Set

Collections
Comparable
comparator

----------------------
Map :
Key value pair
	-key unique-
	-value duplicate
	-null key allow only once
	-null values allow multiple
	-dynamic growable
	-load factor -.75%
	-default- 16
	-index not preseved
	-unorder
--------------------------
HashMap :1.2 
	-searching -faster
	-stored & retrived faster
		-hashtable
			-Array 
			
		-performance wise faster than list, set	
	-CC*2		
			
			
	HashMap hm=new HashMap();
		hm.put(1,"abc");   10001 -- 7
		hm.put(5,"pqr");   10001 -- 7
		
		hash(){
			indexFor(hashcode(),size)---hashValue--bucket location
		}
		
		
		get(5);
			hashcode--hashvalue--7
		-equality check by using equals method--content	
			
		hm.put("abc",1);
		hm.put(new String("abc"),2);
		
		-----abc----
		
			
-------------------------------------------------

LinkedHashMap : 1.4
	-index maintain
		
SortedMap(I) :1.2
	-comparator/comparable--natural sorting
NavigableMap(I): 1.6
	-reverse order
	-staticstics
TreeMap :1.2
	-sorting
	-null not allow-1.7
	-null allow only once- upto 1.6
	-same type of data
	-key based sorting

----------------------------------
concurrentMap(I) :1.5
	concurrentHashMap
----------------------------------	
IdentityHashMap :1.2
	-equality check by using == operator : hashcode/ref
	
WeakHashMap:1.2
	-weak == object==null;
	-explicitly garbage collection

-------------------------------
