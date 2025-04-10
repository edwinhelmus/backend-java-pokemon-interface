import java.util.ArrayList;
import java.util.Arrays;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = "fire";
        this.attacks = new ArrayList<>(Arrays.asList("fireLash","flameThrower","pyroBall","inferno"));
    }

    void fireLash(Pokemon name, Pokemon enemy){};
    void flameThrower(Pokemon name, Pokemon enemy){};
    void pyroBall(Pokemon name, Pokemon enemy){};
    void inferno(Pokemon name, Pokemon enemy){};

}
