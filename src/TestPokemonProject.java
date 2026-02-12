import java.util.ArrayList;

public class TestPokemonProject {
    public static void main(String[] args) {

        Bulbasaur stan = new Bulbasaur();
        Charmander cartman = new Charmander();
        Squirtle squirt = new Squirtle();

        ArrayList<Pokemon> pokemen = new ArrayList<>();
        pokemen.add(stan);
        pokemen.add(cartman);
        pokemen.add(squirt);

        System.out.println(stan.compareTo(cartman));

        PokemonBattleArena.battle(pokemen);


    }
}



