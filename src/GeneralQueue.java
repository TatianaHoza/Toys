import java.util.Comparator;
import java.util.PriorityQueue;

public class GeneralQueue extends Collection {
    public static void main(PriorityQueue queue) {
        PriorityQueue generalQueue = new PriorityQueue(Comparator.comparingDouble(Toy::getFrequency));
           generalQueue.addAll(queue);



    }

}
