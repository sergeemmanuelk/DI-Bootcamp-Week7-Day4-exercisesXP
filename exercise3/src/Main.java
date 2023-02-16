import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int randInt1 = rand.nextInt();
        int randInt2 = rand.nextInt(100);
        boolean randBool = rand.nextBoolean();
        double randDouble = rand.nextDouble();

        System.out.println("Random integer (unbounded): " + randInt1);
        System.out.println("Random integer (bounded): " + randInt2);
        System.out.println("Random boolean: " + randBool);
        System.out.println("Random double: " + randDouble);
    }
}