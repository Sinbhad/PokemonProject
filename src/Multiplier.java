public class Multiplier {
    String attackType, defenderPokemonType;
    double multiple;
    public Multiplier(String attackElement, String defenderPokemonElement){
        attackType = attackElement;
        defenderPokemonType = defenderPokemonElement;
        multiple = MultiplierLibrary.getMultiplier(attackElement, defenderPokemonElement);
    }

    public double getMultiple(){
        return multiple;
    }
}