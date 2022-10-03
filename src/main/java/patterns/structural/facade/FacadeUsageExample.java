package patterns.structural.facade;

public class FacadeUsageExample {

    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();
    }

}
