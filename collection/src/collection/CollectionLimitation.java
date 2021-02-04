package collection;

import java.util.ArrayList;

public class CollectionLimitation {

	public static void main(String[] args) {

		ArrayList pune = new ArrayList();
		pune.add("Karvenagar");

		ArrayList mh = new ArrayList<>();
		mh.add(pune);

		ArrayList india = new ArrayList<>();
		india.add(mh);

		for (Object object : india) {
			ArrayList states = (ArrayList) object;
			for (Object object2 : states) {
				ArrayList cities = (ArrayList) object2;
				for (Object object3 : cities) {
					String locations = (String) object3;
					System.out.println(locations);
				}
			}

		}

	}

}
