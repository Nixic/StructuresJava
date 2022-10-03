package patterns.behavioral.templateMethod;

public class TemplateMethodUsageExample {

    public static void main(String[] args) {
        new StandardComputerBuilder().buildComputer().getComputerParts()
                .forEach((k, v) -> System.out.println("Part: " + k + ", Value: " + v));

        System.out.println("\r");

        new HighEndComputerBuilder().buildComputer().getComputerParts()
                .forEach((k, v) -> System.out.println("Part: " + k + ",  Value: " + v));
    }

}
