package observer2;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println("Enter Text: ");
        Publisher shop = new Publisher();
        shop.addSubscriber(new ConcreteSubscriber("Armstrong"));
        shop.addSubscriber(new ConcreteSubscriber("Miller"));
        shop.addSubscriber(new ConcreteSubscriber("Mitchell"));
        shop.addSubscriber(new ConcreteSubscriber("Webb"));
        
        shop.viewSubscribers();
        
        shop.getKeyboardInfo();
    }
}
