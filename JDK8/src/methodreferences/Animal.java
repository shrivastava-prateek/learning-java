package methodreferences;

import java.util.List;

public class Animal {
	private List<Animal> animals;
	private String name;
	public Animal(List<Animal> animals) {
		this.animals = animals;
	}
	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	
}
