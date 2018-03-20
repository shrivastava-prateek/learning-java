package methodreferences;

import java.util.ArrayList;
import java.util.List;

public class AnimalConstructorReference {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Cat"));
		animals.add(new Animal("Dog"));
		animals.add(new Animal("Tiger"));
		animals.add(new Animal("Lion"));
		
		AnimalFactory factory = Animal::new;
		Animal animal = factory.getAnimal(animals);
		
		List<Animal> retrievedAnimals = animal.getAnimals();
		for (Animal animal2 : retrievedAnimals) {
			System.out.println(animal2.getName());
		}
	}
}
