public class CircularArrayQueue implements  Queue{

    private String[] arrayQueue;
    //How many items in the queue
    private int size;
    //Maximum items that could be stored
    private int maxSize;
    private int front;
    private int rear;

    /**
     * Constructor initialises CircularArrayQueue fields
     * @param maxSize
     */
    public CircularArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        size = 0;
        arrayQueue = new String[maxSize];
        front = 0;
        rear = 0;
    }

    /**
     * Adds an object to the back of the queue
     *
     * @param data
     */
    @Override
    public void enqueue(String data) {
        if (size < maxSize) {
            arrayQueue[rear] = data;
            rear = (rear + 1) % maxSize;
            size++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    /**
     * Removes an object from the front of the queue
     * @return
     */
    @Override
    public String dequeue() {
        String item = null;
        if (size != 0) {
            item = arrayQueue[front];
            front = (front + 1) % maxSize;
            size--;
        }
        return item;
    }

    /**
     * Returns the item at the front of the queue without removing it
     * @return
     */
    @Override
    public String front() {
        String item = null;
        if (size != 0) {
            item = arrayQueue[front];
        }
        return item;
    }

    /**
     * Returns the number of items in the queue
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if the queue is empty
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Prints the contents of the queue
     */
    @Override
    public void printAll() {
        if (size > 0) {
            int i = front;
            do {
                System.out.print(arrayQueue[i] + " ");
                i = ++i % maxSize;
            } while (i != rear);
            System.out.println();
        } else {
            System.out.println("Queue empty");
        }
    }

}
