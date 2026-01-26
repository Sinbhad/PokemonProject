public class Charmander extends Pokemon{
    public Charmander(){
        setName("Charmander");
        setHp(60);
        setPokemonType("Fire");
        setSpeed(40);

        setMove(0, MoveLibrary.EMBER);
        setMove(1, MoveLibrary.FLAMETHROWER);
        setMove(2, MoveLibrary.SCRATCH);
        setMove(3, MoveLibrary.REST);
    }
}