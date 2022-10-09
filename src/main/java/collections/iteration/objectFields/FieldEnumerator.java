package collections.iteration.objectFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class FieldEnumerator implements Iterable<Field> {

    private final Object object;
    private final List<Field> fields = new ArrayList<>();


    public FieldEnumerator(Object object) {
        this.object = object;
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                fields.add(field);
                field.setAccessible(true);
            } else {
                System.out.printf("Static field with name: '%s' detected and will be ignored.%n", field.getName());
            }
        }
    }

    @Override
    public Iterator<Field> iterator() {
        return new FieldIterator();
    }

    @Override
    public Spliterator<Field> spliterator() {
        return null;
    }

    public class FieldIterator implements Iterator<Field> {

        private int position = 0;

        public FieldIterator() {
        }

        @Override
        public boolean hasNext() {
            return position < fields.size();
        }

        @Override
        public Field next() {
            return fields.get(position++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove - unsupported operation.");
        }

    }

    @Override
    public String toString() {
        return "FieldEnumerator{" +
                "object=" + object +
                ", fields=" + fields +
                '}';
    }
}
