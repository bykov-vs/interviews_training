import tasks.proxy.TestObjectDynamicProxy;
import tasks.proxy.TestObjectProxy;

public class Main {
    public static void main(String[] args) {
        TestObjectProxy testObjectProxy = new TestObjectProxy();
        TestObjectDynamicProxy testObjectDynamicProxy = new TestObjectDynamicProxy();

        testObjectProxy.register();

        System.out.println("=================");

        testObjectDynamicProxy.register();

        System.exit(0);
    }
}
