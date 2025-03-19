package lab7;

public class TowerOfHanoiDemo {
    public static void main(String[] args)
    {
        // You can modify the number of disks below,
        // as well as the pause time between moves (milliseconds).
        TowerOfHanoi game = new TowerOfHanoi(3, 1000);
        game.run();
    }
}
