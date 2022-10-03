package patterns.creational.abstractFactory.animal;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "wof wof";
    }
}
