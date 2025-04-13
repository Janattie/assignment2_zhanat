public class Main {
    public static void main(String[] args) {
        System.out.println("------ STACK DEMO ------");
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
