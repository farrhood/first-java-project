package ninja.farhood.exercises;

public class Queen {

    private int hunger;
    private int power;
    private String name;

    public Queen(String name, int hunger, int power) {
        this.name = name;
        this.hunger = hunger;
        this.power = power;
    }

    public boolean layEgg() {
        System.out.println("ninja.farhood.exercises.Queen " +" name is laying eggs.");
        hunger -= 10;
        if(hunger == power) {
            System.out.println(name + " is hungry");
            return false;
        } else {
            System.out.println(name + " has " + (hunger - power) + " left over.");
            return true;

        }
    }

    public int getHungry() {   // property
        return hunger;
    }

    public int getPower() {
        return power;
    }

    public String getname() {
        return name;
    }

}