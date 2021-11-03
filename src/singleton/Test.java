package singleton;

public class Test
{
    public static void main(String[] args)
    {
        SingletonDemo object = SingletonDemo.getInstance();
        object.showMessage();
    }
}
