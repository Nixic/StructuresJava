package patterns.behavioral.templateMethod;

import java.util.ArrayList;
import java.util.Map;

public class HighEndComputerBuilder extends ComputerBuilder<String, String> {


    public HighEndComputerBuilder() {
        motherboardSetupStatus = new ArrayList<>();
    }

    @Override
    public Map<String, String> getComputerParts() {
        return super.getComputerParts();
    }

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "High-end Motherboard");
    }

    @Override
    public void setupMotherboard() {
        motherboardSetupStatus.add("Screwing the high-end motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
        motherboardSetupStatus.forEach(System.out::println);
    }

    @Override
    public void addProcessor() {
        computerParts.put("Processor", "High-end Processor");
    }
}