package com;

public class Person {
	private String name;
	private Integer age;
	private String city;

	public Person(){

	}
	public Person(String name, Integer age,String city){
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public int compareByName(Person person1, Person person2){
		return person1.name.compareTo(person2.name);
	}

	public int compareByAge(Person person1, Person person2){
		return person1.age.compareTo(person2.age);
	}

	public static int compareByCity(Person person1,Person person2){
		return person1.city.compareTo(person2.city);
	}

}