package patterns.creational.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserWithLombok {

    private final int id;

    private final String name;


}
