public class Main {
    public static void main(String[] args) {
        System.out.println("------ MIN HEAP DEMO ------");
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        heap.insert(50);
        heap.insert(20);
        heap.insert(30);
        heap.insert(10);
        heap.insert(40);

        System.out.println("Heap size: " + heap.size());
        System.out.println("Min element: " + heap.peek());

        System.out.println("Extracted min: " + heap.extractMin());
        System.out.println("Min after extraction: " + heap.peek());

        System.out.println("Is heap empty? " + heap.isEmpty());

        System.out.println("Remaining heap:");
        heap.printHeap();
    }

}
