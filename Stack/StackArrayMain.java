class StackArray {
    int arr[];
    int top;

    StackArray(int size) {
        arr = new int[size];
        top = -1;
    }

    int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    void push(int value) {
        if(isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

}

public class StackArrayMain {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.pop() + " popped from stack");

        System.out.println("Top element is: " + stack.peek());
    }
}