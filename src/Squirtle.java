public class Squirtle extends Pokemon{
    public Squirtle(){
        setName("Squirtle");
        setHp(50);
        setPokemonType("Water");
        setSpeed(35);

        setMove(0, MoveLibrary.BUBBLE);
        setMove(1, MoveLibrary.WATER_GUN);
        setMove(2, MoveLibrary.TACKLE);
        setMove(3, MoveLibrary.REST);
    }
}
