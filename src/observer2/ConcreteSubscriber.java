package observer2;

public class ConcreteSubscriber implements Subscriber
{
    String name;
    String mailbox;

    public ConcreteSubscriber(String name)
    {
        this.name = name;
        mailbox = "";
    }
    
    @Override
    public void update(String event)
    {
        mailbox = event;
    }   
}
