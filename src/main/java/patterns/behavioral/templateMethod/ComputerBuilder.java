package patterns.behavioral.templateMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder<K, V> {

    public Map<K, V> computerParts;
    public List<String> motherboardSetupStatus;

    public Computer<K, V> buildComputer() {
        computerParts = new HashMap<>();
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return new Computer<>(computerParts);
    }

    public Map<K, V> getComputerParts() {
        return computerParts;
    }

    public abstract void addMotherboard();
    public abstract void setupMotherboard();
    public abstract void addProcessor();



}
