
package pl.bartek.pizza;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        CIASTO, GRUBOSC, WEGE, SER, MIESO
    }
}
