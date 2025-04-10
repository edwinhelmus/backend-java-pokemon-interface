import java.util.ArrayList;
import java.util.Arrays;

public class WaterPokemon extends Pokemon {


    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = "water";
        this.attacks = new ArrayList<>(Arrays.asList("surf","hydroPump","rainDance","hydroCanon"));
    }

    void surf(Pokemon name, Pokemon enemy){};
    void hydroPump(Pokemon name, Pokemon enemy){};
    void rainDance(Pokemon name, Pokemon enemy){};
    void hydroCanon(Pokemon name, Pokemon enemy){};

}
