package patterns.behavioral.templateMethod;

import java.util.ArrayList;

public class StandardComputerBuilder extends ComputerBuilder<String, String> {


    public StandardComputerBuilder() {
        motherboardSetupStatus = new ArrayList<>();
    }

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "Standard Motherboard");
    }

    @Override
    public void setupMotherboard() {
        motherboardSetupStatus.add("Screwing the standard motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
        motherboardSetupStatus.forEach(System.out::println);
    }

    @Override
    public void addProcessor() {
        computerParts.put("Processor", "Standard Processor");
    }
}
