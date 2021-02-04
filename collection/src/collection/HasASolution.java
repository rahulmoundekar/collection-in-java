package collection;

public class HasASolution {

	public static void main(String[] args) {

		Country country = new Country();
		country.setCountryName("India");

		States states = new States();
		states.setStateName("Maharashtra");
		states.setCountry(country);
		
		
		System.out.println(states.getCountry().getCountryName());
		System.out.println("\t"+states.getStateName());
		

	}

}
