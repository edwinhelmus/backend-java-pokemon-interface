public class ElectricPokemon extends Pokemon {


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        this.type = "electric";
    }

    void thunderPunch(Pokemon name, Pokemon enemy){};
    void electroBall(Pokemon name, Pokemon enemy){};
    void voltTackle(Pokemon name, Pokemon enemy){};
    void thunder(Pokemon name, Pokemon enemy){};

}
