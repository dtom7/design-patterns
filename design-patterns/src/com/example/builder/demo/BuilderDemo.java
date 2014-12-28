package com.example.builder.demo;

import com.example.builder.domain.Person;

public class BuilderDemo {
	public static void main(String[] args) {
		Person person = new Person.Builder("ben", 10)
		        .gender("M")
				.address("123 Main St")
				.email("ben@example.com")
				.phone("911")
				.build();
		System.out.println("Person: " + person);
	}
}
