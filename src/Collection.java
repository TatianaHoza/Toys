import java.util.Comparator;
import java.util.PriorityQueue;

public class Collection {
    public static void main(Toy [] toys) {
        PriorityQueue queue = new PriorityQueue(Comparator.comparingDouble(Toy::getFrequency));
        for (Toy toy:toys){
            queue.add(toy);

            System.out.println(queue);
        }
    }
}
