package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {
        Queue myQ = new Queue(5);
        myQ.enqueue(10);
        myQ.enqueue(1);
        myQ.printQueue();

        myQ.dequeue();

        myQ.printQueue();
    }
}
