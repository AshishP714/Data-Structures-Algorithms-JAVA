import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int x) {

        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }

    void pop() {

        if (stack.peek().equals(minStack.peek()))
            minStack.pop();

        stack.pop();
    }

    int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(2);
        ms.push(8);

        System.out.println(ms.getMin());

        ms.pop();

        System.out.println(ms.getMin());
    }
}