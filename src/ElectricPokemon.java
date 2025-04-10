import java.util.ArrayList;
import java.util.Arrays;

public class ElectricPokemon extends Pokemon {


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = "electric";
        this.attacks = new ArrayList<>(Arrays.asList("thunderPunch","electricBall","voltTackle","thunder"));
    }

    void thunderPunch(Pokemon name, Pokemon enemy){};
    void electricBall(Pokemon name, Pokemon enemy){};
    void voltTackle(Pokemon name, Pokemon enemy){};
    void thunder(Pokemon name, Pokemon enemy){};

    @Override
    public ArrayList<String> getAttacks() {
        return attacks;
    }

}
