public class Pokemon{
    private int hp, speed;
    private String name, pokemonType;
    private Move[] moves = new Move[4];

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public String getName(){
        return name;
    }

    public void setName(String userInputName){
        name = userInputName;
    }

    public void setPokemonType(String pokemonElement){
        pokemonType = pokemonElement;
    }

    public String getPokemonType(){
        return pokemonType;
    }

    public Move[] getMoves() {
        return moves;
    }

    public void setMove(int index, Move move) {
        this.moves[index] = move;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }
}
