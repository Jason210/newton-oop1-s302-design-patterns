package singleton;

public class SingletonDemo
{
    private static SingletonDemo instance = new SingletonDemo();

    private SingletonDemo()
    {
    }

    public static SingletonDemo getInstance()
    {
        return instance;
    }

    public void showMessage()
    {
        System.out.println("Hello World!");
    }
}
