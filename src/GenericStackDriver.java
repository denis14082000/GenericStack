public class GenericStackDriver {
    public static void main(String[] args) {
        GenericStack<String> gs = new GenericStack<String>();
        try {
            gs.push("First");
            gs.push("Second");
            gs.push("Last");
            gs.show();
            gs.pop();
            gs.show();
            gs.push("5");
            gs.push("4");
            gs.push("3");
            gs.show();
            gs.pop();
            gs.show();
        } catch (GenericStackException e) {
            System.out.println(e);
        }
    }
}
