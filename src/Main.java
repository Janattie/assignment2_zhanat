public class Main {
    public static void main(String[] args) {
        System.out.println("------ QUEUE DEMO ------");
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println("Queue size: " + queue.size());
        System.out.println("First element: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("First after dequeue: " + queue.peek());

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Remaining queue:");
        queue.printQueue();
    }

}
