package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MapSolution {

	public static void main(String[] args) {
		/*
		 * // country states -cities -locations
		 */

		List pune = new ArrayList();
		pune.add("Karvenagar");

		List mumbai = new ArrayList();
		mumbai.add("thane");

		HashMap mh = new HashMap<>();
		mh.put("Pune", pune);
		mh.put("Mumbai", mumbai);

		List patna = new ArrayList();
		patna.add("Aavalahalli");
		patna.add("Bariatu");

		HashMap bihar = new HashMap<>();
		bihar.put("Patna", patna);

		HashMap india = new HashMap();
		india.put("Maharashtra", mh);
		india.put("Bihar", bihar);

		HashMap world = new HashMap<>();
		world.put("India", india);

		Set setOfCountries = world.keySet();
		for (Object object : setOfCountries) {
			String countriesKey = (String) object;
			System.out.println(countriesKey);
			HashMap states = (HashMap) world.get(countriesKey);
			Set setOfstates = states.keySet();
			for (Object object2 : setOfstates) {
				String statesKey = (String) object2;
				System.out.println("\t" + statesKey);
				HashMap cities = (HashMap) states.get(statesKey);
				Set setOfcities = cities.keySet();
				for (Object object3 : setOfcities) {
					String citiesKey = (String) object3;
					System.out.println("\t\t" + citiesKey);
					List listOfLocations = (List) cities.get(citiesKey);
					for (Object object4 : listOfLocations) {
						String locations = (String) object4;
						System.out.println("\t\t\t"+locations);
					}
				}
			}

		}

	}

}
