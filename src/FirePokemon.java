public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = "fire";
    }

    void fireLash(Pokemon name, Pokemon enemy){};
    void flameThrower(Pokemon name, Pokemon enemy){};
    void pyroBall(Pokemon name, Pokemon enemy){};
    void inferno(Pokemon name, Pokemon enemy){};

    @Override
    public String getType() {
        return type;
    }
}
