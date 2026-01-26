public class Bulbasaur extends Pokemon{
    // the keyword extends means you are allowed to access the
    //public class

    public Bulbasaur(){
        setName("Bulbasaur");
        setHp(70);
        setPokemonType("Grass");
        setSpeed(30);

        setMove(0, MoveLibrary.VINE_WHIP);
        setMove(1, MoveLibrary.RAZOR_LEAF);
        setMove(2, MoveLibrary.LEECH_SEED);
        setMove(3, MoveLibrary.TACKLE);
    }
}

