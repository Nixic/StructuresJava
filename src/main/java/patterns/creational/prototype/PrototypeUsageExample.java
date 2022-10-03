package patterns.creational.prototype;

public class PrototypeUsageExample {

    public static void main(String[] args) {

        int height = 20;
        int height2 = 25;

        PlasticTree plasticTree = new PlasticTree("Green");
        plasticTree.setHeight(height);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setHeight(height2);

        if (height == plasticTree.getHeight()) {
            System.out.println("height ok: " + plasticTree.getHeight());
            System.out.println("plasticTree color: " + plasticTree.getColor());
        }

        if (height2 == anotherPlasticTree.getHeight()) {
            System.out.println("Height of clone ok: " + anotherPlasticTree.getHeight());
            System.out.println("Clone's color from copy method: " + anotherPlasticTree.getColor());
        }

    }

}
