package ninja.farhood.exercises;

public class Game {
    public static void main(String[] args) {

        Soldier s = new Soldier(100);
        Soldier t = new Soldier(100);


        System.out.println(s.getHealth());

        s.fight(t);

        System.out.println(s.getHealth());
        System.out.println(t.getHealth());

        System.out.println(s.getHealth());

    }
}
