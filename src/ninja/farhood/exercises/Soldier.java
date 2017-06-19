package ninja.farhood.exercises;

public class Soldier {
    private int health;

    public Soldier(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void fight(Soldier enemy) {
        this.health -= 10;
        enemy.health -= 20;
    }
}
