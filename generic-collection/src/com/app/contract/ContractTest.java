package com.app.contract;

public class ContractTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc");
		Employee e2 = new Employee(1, "abc");

		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		

	}

}
