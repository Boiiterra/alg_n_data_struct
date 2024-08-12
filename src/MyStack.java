import java.util.Vector;

public class MyStack<T> {
    private final Vector<T> stack = new Vector<T>();
    int length = 0;

    public void add(T data) {
        stack.addElement(data);
        length++;
    }

    public T pop() {
        if (length == 0)
            throw new IndexOutOfBoundsException("It is impossible to pop nothing.");

        T removed = stack.remove(length - 1);
        length--;
        return removed;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Stack data:\n");

        if (length == 0)
            string.append("<No data>");
        else
            for (int i = 0; i < length; i++)
                string.append(i != 0 ? " -- ": " -> ").append(stack.get(length - 1 - i).toString()).append(i + 1 != length ? "\n": "");

        return string.toString();
    }
}
