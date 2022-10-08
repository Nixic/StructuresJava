package collections.iteration;

/**
 * Range "from...to" using generation of Integers values with Iterable interface
 */
public class RangeWithIterable {

    public static void main(String[] args) {
        for (Integer i : Range.fromTo(0, 100)) {
            System.out.println(i);
        }
    }

    public static class Range implements Iterable<Integer> {

        int start;
        int end;

        public static Range fromTo(int from, int to) {
            return new Range(from, to);
        }

        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator iterator() {
            return new Iterator(start);
        }

        class Iterator implements java.util.Iterator<Integer> {

            int current;

            public Iterator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }

}
