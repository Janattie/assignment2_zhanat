public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(100);
        list.set(2, 99);

        System.out.println("List size: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println("List size after removals: " + list.size());

        System.out.println("Does 20 exist? " + list.exists(20));
        System.out.println("Index of 20: " + list.indexOf(20));

        list.sort();
        System.out.println("Sorted list:");
        for (int value : list) {
            System.out.println(value);
        }
    }
}
