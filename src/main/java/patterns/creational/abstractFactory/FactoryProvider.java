package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.animal.AnimalFactory;
import patterns.creational.abstractFactory.paint.PaintFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new PaintFactory();
        }

        return null;
    }

}
