import java.util.ArrayList;

public class TestPokemonProject {
    public static void main(String[] args) {

        Bulbasaur stan = new Bulbasaur();
        Charmander byron = new Charmander();
        Squirtle squirt = new Squirtle();

        ArrayList<Pokemon> pokemen = new ArrayList<>();
        pokemen.add(stan);
        pokemen.add(byron);
        pokemen.add(squirt);

        PokemonBattleArena.battle(pokemen);
    }
 }