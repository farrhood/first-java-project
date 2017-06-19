package ninja.farhood.exercises;

public class Worker {
    private int capacity;
    private int carriage;
    private String name;

    public Worker() {
        this("John Doe", 100, 0);
    }

    public Worker(String name, int capacity) {
        this(name, capacity, 0);
    }

    public Worker(String name, int capacity, int carriage) {
        this.capacity = capacity;
        this.carriage = carriage;
        this.name = name;
    }

    public boolean gatherNectar(int howMuch) {
        System.out.println("ninja.farhood.exercises.Worker " + name + " is gathering some nectar");
        carriage += howMuch;
        if(carriage == capacity) {
            System.out.println(name + " is full");
            return false;
        } else {
            System.out.println(name + " has " + (capacity - carriage) + " left over.");
            return true;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCarriage() {
        return carriage;
    }

    public String getName() {
        return name;
    }
}