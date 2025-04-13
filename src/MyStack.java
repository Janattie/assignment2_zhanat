public class MyStack<T extends Comparable<T>> {
    private MyList<T> list;

    public MyStack() {
        this.list = new MyArrayList<>(); // или new MyLinkedList<>()
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        T top = list.getLast();
        list.removeLast();
        return top;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public void printStack() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
