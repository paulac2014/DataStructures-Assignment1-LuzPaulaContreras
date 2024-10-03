package indiana;

import java.util.Stack;

public class ScrollStack {
    private Stack<String> stack;

    public ScrollStack() {
        this.stack = new Stack<>();
    }

    public void push(String scrollTitle) {
        stack.push(scrollTitle);
    }

    public String pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop();
    }

    public String peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public boolean contains(String scrollTitle) {
        return stack.contains(scrollTitle);
    }
}
