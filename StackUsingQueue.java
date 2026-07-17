import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.offer(x);

        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}