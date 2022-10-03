package patterns.structural.flyweight;

public enum Color {
    BLACK("Black"),
    WHITE("White");

    final String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
