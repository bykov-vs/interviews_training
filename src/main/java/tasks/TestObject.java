package tasks;

public class TestObject implements TestInterface{
    public void register() {
        System.out.println("# TestObject: Register");
    }

    public void process() {
        System.out.println("# TestObject: Process...");
    }

    public void remove() {
        System.out.println("# TestObject: Remove");
    }
}
