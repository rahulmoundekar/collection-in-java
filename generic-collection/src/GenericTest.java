import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenericTest {

	public static void genericMap() {

		List<String> pune = new ArrayList<String>();
		pune.add("karvengar");
		pune.add("Warje");

		HashMap<String, List<String>> mh = new HashMap<>();
		mh.put("Pune", pune);

		HashMap<String, HashMap<String, List<String>>> india = new HashMap<>();
		india.put("Maharashtra", mh);

		HashMap<String, HashMap<String, HashMap<String, List<String>>>> world = new HashMap<>();
		world.put("India", india);

		Set<String> setOfCountries = world.keySet();
		for (String countryKey : setOfCountries) {
			System.out.println(countryKey);
			HashMap<String, HashMap<String, List<String>>> countries = world.get(countryKey);
			Set<String> setOfStates = countries.keySet();
			for (String statesKey : setOfStates) {
				System.out.println("\t" + statesKey);
				HashMap<String, List<String>> states = countries.get(statesKey);
				Set<String> setOfcities = states.keySet();
				for (String citiesKey : setOfcities) {
					System.out.println("\t\t" + citiesKey);
					List<String> locations = states.get(citiesKey);
					for (String area : locations) {
						System.out.println("\t\t\t" + area);
					}
				}

			}
		}

	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("pqr");

		for (String s : list) {
			System.out.println(s);
		}

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("++++++++++++++++");
		genericMap();
	}

}
