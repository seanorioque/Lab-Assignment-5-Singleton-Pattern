import java.util.LinkedList;
import java.util.Queue;

public class PagIbig {
    private static PagIbig instance;
    private int queueNumber = 0;

    Queue<Integer> queue = new LinkedList<>();

    private PagIbig() {}

    public static synchronized PagIbig getInstance() {
        if (instance == null)
            instance = new PagIbig();
        return instance;
    }

    // Increments and returns the next queue number
    public synchronized int getQueueNumber() {
        queueNumber++;
        queue.add(queueNumber);
        return queueNumber;
    }
    public synchronized int callingQueueNumber() {
        return queue.poll();
    }

    // Resets queue number to a specific value
    public synchronized void resetQueueNumber(int newNumber) {
        queue.clear();
        queue.add(newNumber);
        this.queueNumber = newNumber;
        System.out.println("Queue Number reset to: " + queueNumber);
    }




}
