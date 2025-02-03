package tasks.proxy;

import tasks.TestObject;

public class TestObjectProxy extends TestObject {
    @Override
    public void register() {
        System.out.println("# TestObjectProxy: Before register");

        super.register();

        System.out.println("# TestObjectProxy: After register");
    }

    @Override
    public void process() {
        System.out.println("# TestObjectProxy: Before process");

        super.process();

        System.out.println("# TestObjectProxy: After process");
    }

    @Override
    public void remove() {
        System.out.println("# TestObjectProxy: Before remove");

        super.remove();

        System.out.println("# TestObjectProxy: After remove");
    }
}
