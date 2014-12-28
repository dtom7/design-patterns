package com.example.builder.domain;

public class Person {
	
	private final String name;
	private final int age;
	private final String gender;
	private final String address;
	private final String phone;
	private final String email;
	
	private Person(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.gender = builder.gender;
		this.address = builder.address;
		this.phone = builder.phone;
		this.email = builder.email;
	}
	
	@Override
	public String toString() {
		return this.name + " - " + this.age + " - " + this.gender + " - " + this.address + " - " + this.phone + " - " + this.email;
	}
	
	public static class Builder {
		
		private final String name;
		private final int age;
		private String gender = "U";
		private String address = "";
		private String phone = "";
		private String email = "";
		
		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}	
		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		public Person build() {
			return new Person(this);
		}
	}

}
