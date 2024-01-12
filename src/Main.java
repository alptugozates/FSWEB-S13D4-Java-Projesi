import enums.Weapon;
import model.Player;
import model.Point;

public class Main {
    public static void main(String[] args) {
        // Test
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());


        Player player = new Player("John", 100, Weapon.AXE);

        player.loseHealth(30);
        System.out.println("After damage: " + player.healthRemaining());

        player.restoreHealth(20);
        System.out.println("After restoring health: " + player.healthRemaining());


        player.loseHealth(100);
        System.out.println("After knockout: " + player.healthRemaining());
    }
}