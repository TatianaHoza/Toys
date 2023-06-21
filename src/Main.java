
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Toy[] toys = new Toy[3];
        toys[0] = new Toy(1, "Bee", 0.25);
        toys[1] = new Toy(2, "Car", 0.25);
        toys[2] = new Toy(3, "Doll", 0.5);

        for (Toy toy : toys) {
            Program.displayInfo(toy);
        }



    }
}