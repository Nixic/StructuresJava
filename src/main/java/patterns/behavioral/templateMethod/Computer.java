package patterns.behavioral.templateMethod;

import java.util.Map;

public class Computer<K, V> {

    public Map<K, V> computerParts;

    public Computer(Map<K, V> computerParts) {
        this.computerParts = computerParts;
    }

    public Map<K, V> getComputerParts() {
        return computerParts;
    }
}
