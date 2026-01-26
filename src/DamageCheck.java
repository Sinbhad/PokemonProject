public class DamageCheck {

    public static double calculateDamage(Move move, Pokemon defender) {
        double baseDamage = move.getDamagePoints();
        String attackType = move.getMoveElement();
        String defenseType = defender.getPokemonType();

        double multiplier = MultiplierLibrary.getMultiplier(attackType, defenseType);

        return baseDamage * multiplier;
    }
}