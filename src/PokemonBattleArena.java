import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class PokemonBattleArena {
    public static void battle(ArrayList<Pokemon> contestants) {
        for (int index = 0; index < contestants.size(); index++) {
            System.out.println(index + 1 + ": " + contestants.get(index).getName());
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Welcome trainer, select your Pokemon from the list and press enter (Number): ");
        int choice = keyboard.nextInt();
        Pokemon userSelectedFighter = contestants.get(choice - 1);

        Random opponentNumber = new Random();
        int opponentIndex = opponentNumber.nextInt(contestants.size());
        while(opponentIndex == choice - 1) opponentIndex = opponentNumber.nextInt(contestants.size());
        Pokemon opponent = contestants.get(opponentIndex);

        System.out.println("\n\n\nA wild " + opponent.getName() + " has appeared!");
        System.out.println();

        while(userSelectedFighter.getHp() > 0 && opponent.getHp() > 0){
            if(userSelectedFighter.getSpeed() > opponent.getSpeed()){
                printMoves(keyboard, userSelectedFighter, opponent);

                if(opponent.getHp() > 0){
                    int randomMoveIndex = new Random().nextInt(opponent.getMoves().length);
                    Move enemyMove = opponent.getMoves()[randomMoveIndex];
                    attack(opponent, userSelectedFighter, enemyMove);
                    System.out.println();
                }

            }else{
                int randomMoveIndex = new Random().nextInt(opponent.getMoves().length);
                Move enemyMove = opponent.getMoves()[randomMoveIndex];
                System.out.print("The wild ");
                attack(opponent, userSelectedFighter, enemyMove);
                System.out.println();

                if(userSelectedFighter.getHp() > 0){
                    printMoves(keyboard, userSelectedFighter, opponent);
                }
            }
        }

        if(userSelectedFighter.getHp() > 0){
            System.out.println("\n" + userSelectedFighter.getName() + " won the battle!");
        } else {
            System.out.println("\n" + userSelectedFighter.getName() + " has fainted. You lost.");
        }
    }

    private static void printMoves(Scanner keyboard, Pokemon userSelectedFighter, Pokemon opponent) {
        for (int index = 0; index < userSelectedFighter.getMoves().length; index++)
            System.out.println((index + 1) + ": " + userSelectedFighter.getMoves()[index].getName());
        System.out.print("Choose an attack and press enter (Number): ");
        int moveChoice = keyboard.nextInt();
        System.out.println("\n");
        Move selectedMove = userSelectedFighter.getMoves()[moveChoice - 1];
        attack(userSelectedFighter, opponent, selectedMove);
    }

    public static void attack(Pokemon attacker, Pokemon defender, Move move){
        double multiplier = MultiplierLibrary.getMultiplier(move.getMoveElement(), defender.getPokemonType());
        System.out.println(attacker.getName() + " used " + move.getName() + "!");

        if (multiplier > 1.0) {
            System.out.println("It's super effective!");
        } else if (multiplier < 1.0 && multiplier > 0) {
            System.out.println("It's not very effective...");
        } else if (multiplier == 0.0) {
            System.out.println("It had no effect!");
        }

        double damage = DamageCheck.calculateDamage(move, defender);
        int newHp = defender.getHp() - (int) damage;

        if(newHp < 0) newHp = 0;
        defender.setHp(newHp);

        System.out.println("Dealt " + (int)damage + " damage.");

        if(move.getHealPoints() > 0){
            int healAmount = (int) move.getHealPoints();
            int newAttackerHp = attacker.getHp() + healAmount;
            attacker.setHp(newAttackerHp);
            System.out.println(attacker.getName() + " healed " + healAmount + " hp and has " + newAttackerHp + " remaining!");
        }
        System.out.println(defender.getName() + " has " + defender.getHp() + " hp remaining!\n\n");
    }
}