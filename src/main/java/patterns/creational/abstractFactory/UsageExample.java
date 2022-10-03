package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.animal.Animal;
import patterns.creational.abstractFactory.paint.Paint;

public class UsageExample {

    public static void main(String[] args) {

        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");

        String paintType = "Dry"; // change it on Liquid or Dry
        String inscription = "Hello!";

        Paint somePaint = (Paint) colorFactory.create(paintType);
        System.out.println(somePaint.getPaint());
        System.out.println(somePaint.print(inscription));


        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");

        String animalType = "Dog"; // change it on Duck or Dog
        Animal duck = (Animal) animalFactory.create(animalType);
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound());


    }

}
