package indiana;

public class ExplorerQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new String[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String explorerName) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = explorerName;
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String explorer = queue[front];
        front = (front + 1) % capacity;
        size--;
        return explorer;
    }

    public String nextExplorer() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }
}
