import java.util.ArrayList;
import java.util.Arrays;

public class GrassPokemon extends Pokemon {


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = "grass";
        this.attacks = new ArrayList<>(Arrays.asList("solarBeam","leafStorm","leechSeed","leaveBlade"));
    }

    public void solarBeam(Pokemon name, Pokemon enemy){};
    public void leafStorm(Pokemon name, Pokemon enemy){};
    public void leechSeed(Pokemon name, Pokemon enemy){};
    public void leaveBlade(Pokemon name, Pokemon enemy){};

}
