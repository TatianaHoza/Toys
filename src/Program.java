import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Program extends GeneralQueue {
    public static void get(Toy[] toys) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("toys.txt"))){
            for (int i = 0; i < 10; i++) {
                Toy toy = (Toy) toys.wait();
                writer.println(toy);
            }

            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

}

