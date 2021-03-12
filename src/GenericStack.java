import java.util.ArrayList;

public class GenericStack <T>{
    private ArrayList<T> items = new ArrayList<T>();
    private int top;

    public GenericStack() {
        this.top = 0;
    }
    public void push(T item) {
        items.add(top, item);
        top++;
    }

    public T pop() throws GenericStackException {
        T temp;
        if (items.size() <= 0){
            throw new GenericStackException("Underflow Error");
        }
        temp = items.get(top - 1);
        items.remove(top - 1);
        top--;
        System.out.println("\nУдален: " + temp);
        return temp;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
        } else {
            System.out.println("\nВывод всех: ");
            for (int i = 0; i < top; i++) {
                System.out.println(items.get(i));
            }
        }
    }
}