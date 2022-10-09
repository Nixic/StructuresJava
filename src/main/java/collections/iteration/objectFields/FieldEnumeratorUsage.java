package collections.iteration.objectFields;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Field;

public class FieldEnumeratorUsage {

    public static void main(String[] args) {
        Contact contact = new Contact(1, "Mike", "+79058677585");
        for (Field field : new FieldEnumerator(contact)) {
            try {
                System.out.println(new CustomField(field, field.get(contact).toString()));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Data
    @AllArgsConstructor
    static class Contact {
        static String myStatic;
        private int id;
        private String name;
        private String phoneNumber;
    }

}
