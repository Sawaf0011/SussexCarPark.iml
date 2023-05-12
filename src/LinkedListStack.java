import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack <T> implements Stack<T>{
    private LinkedList<T> stack;
    private int size;

    public LinkedListStack() {
        stack = new LinkedList<>();
        size = 0;
    }

    @Override
    public T peek() {
        return stack.peekFirst();
    }

    @Override
    public T pop() {
        T t = stack.removeFirst();
        size--;
        return t;
    }

    @Override
    public void push(T t) {
        stack.addFirst(t);
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printAll() {
        // Setting the ListIterator
        ListIterator listIter = stack.listIterator();
        // Iterating through the created list from the position
        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
    }
}
