package collections.iteration.objectFields;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Field;

@Data
@AllArgsConstructor
public class CustomField {

    private Field field;
    private String name;
    private String value;

    public CustomField(Field field, String value) {
        this.field = field;
        this.name = field.getName();
        this.value = value;
    }

    @Override
    public String toString() {
        return "Field{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
