public class MoveLibrary {
    //Grass
    public static final Move VINE_WHIP = new Move("Vine Whip", 20, 0, "Grass");
    public static final Move RAZOR_LEAF = new Move("Razor Leaf", 25, 0, "Grass");
    public static final Move LEECH_SEED = new Move("Leech Seed", 10, 20, "Grass");

    //Fire
    public static final Move EMBER = new Move("Ember", 20, 0, "Fire");
    public static final Move FLAMETHROWER = new Move("Flamethrower", 40, 0, "Fire");

    //Water
    public static final Move BUBBLE = new Move("Bubble", 15, 0, "Water");
    public static final Move WATER_GUN = new Move("Water Gun", 20, 0, "Water");

    //Normal
    public static final Move TACKLE = new Move("Tackle", 10, 0, "Normal");
    public static final Move SCRATCH = new Move("Scratch", 10, 0, "Normal");

    //Special / Healing / Status
    public static final Move REST = new Move("Rest", 0, 50, "Normal");
}
