package patterns.creational.prototype;

public class PlasticTree extends Tree {

    private final String color;

    public PlasticTree(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree("Red");
        plasticTreeClone.setHeight(30);
        return plasticTreeClone;
    }

}
