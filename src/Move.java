public class Move {
    private String name, moveElement;
    private double damagePoints, healPoints;

    public Move(String name, double damagePoints, double healPoints, String moveElement) {
        this.name = name;
        this.damagePoints = damagePoints;
        this.healPoints = healPoints;
        this.moveElement = moveElement;
    }

    public String getName() {
        return name;
    }

    public String getMoveElement() {
        return moveElement;
    }

    public double getDamagePoints() {
        return damagePoints;
    }

    public double getHealPoints() {
        return healPoints;
    }
}