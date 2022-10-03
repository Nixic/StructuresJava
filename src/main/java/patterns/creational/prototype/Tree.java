package patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Tree {

    private int height;
    private double thickness;

    public abstract Tree copy();


}
