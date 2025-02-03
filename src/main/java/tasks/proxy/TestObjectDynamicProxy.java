package tasks.proxy;

import tasks.TestInterface;
import tasks.TestObject;

public class TestObjectDynamicProxy implements TestInterface {
    private final TestObject testObject;

    public TestObjectDynamicProxy(TestObject testObject) {
        this.testObject = testObject;
    }

    @Override
    public void register() {
        System.out.println("# TestObjectDynamicProxy: Before register");

        testObject.register();

        System.out.println("# TestObjectDynamicProxy: After register");
    }

    @Override
    public void process() {
        System.out.println("# TestObjectDynamicProxy: Before process");

        testObject.process();

        System.out.println("# TestObjectDynamicProxy: After process");
    }

    @Override
    public void remove() {
        System.out.println("# TestObjectDynamicProxy: Before remove");

        testObject.remove();

        System.out.println("# TestObjectDynamicProxy: After remove");
    }
}
