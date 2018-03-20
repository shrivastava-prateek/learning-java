package methodreferences;
public class Person {
	private String name;
	private Integer age;
	public Person() {}
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static int sortByAge(Person person1, Person person2){
		return person1.age.compareTo(person2.age);
	}
	public static int sortByName(Person person1, Person person2){
		return person1.name.compareTo(person2.name);
	}
	public int compareByAge (Person person1, Person person2){
		return person1.age.compareTo(person2.age);
	}
	public int compareByName(Person person1, Person person2){
		return person1.name.compareTo(person2.name);
	}
}














