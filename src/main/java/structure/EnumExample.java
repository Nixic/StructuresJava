package structure;

public class EnumExample {
    enum CoffeeSize {
        SMALL(50),
        MEDIUM(100),
        BIG(150) {
            @Override
            public String getCoffeeClass() {
                return "B";
            }
        };

        final int milliliters;
        String coffeeClass = "A";

        CoffeeSize(int milliliters) {
            this.milliliters = milliliters;
        }

        public String getCoffeeClass() {
            return coffeeClass;
        }
    }

    public static void main(String[] args) {
        CoffeeSize smallCoffeeSize = CoffeeSize.SMALL;
        CoffeeSize bigCoffeeSize = CoffeeSize.BIG;
        System.out.println(smallCoffeeSize);
        System.out.println(smallCoffeeSize + "coffee class is: " + smallCoffeeSize.getCoffeeClass());
        System.out.println(bigCoffeeSize);
        System.out.println(bigCoffeeSize + "coffee class is: " + bigCoffeeSize.getCoffeeClass());
    }


}
