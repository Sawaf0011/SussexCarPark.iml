public interface Stack<T> {
    public T peek();
    public T pop();
    public void push(T t);
    public boolean isEmpty();
    public int size();
    public void printAll();
}
