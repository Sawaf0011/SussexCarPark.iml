public interface Queue {
    /**
     * Adds an object to the back of the queue
     * @param data
     */
    public void enqueue(String data);

    /**
     * Removes an object from the front of the queue
     * @return
     */
    public String dequeue();

    /**
     * Returns the item at the front of the queue without removing it
     * @return
     */
    public String front();
    /**
     * Returns the number of items in the queue
     * @return
     */
    public int size();

    /**
     * Returns true if the queue is empty
     * @return
     */
    public boolean isEmpty();

    /**
     * Prints the contents of the queue
     */
    public void printAll();



}
