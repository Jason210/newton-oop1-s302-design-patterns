package observer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Publisher
{
    ArrayList<Subscriber> subscribers;

    public Publisher()
    {
        subscribers = new ArrayList();
    }

    public void addSubscriber(Subscriber s)
    {
        subscribers.add(s);
    }

    public void removeSubscriber(Subscriber s)
    {
        subscribers.add(s);
    }

    public void notifySubscribers(String event)
    {
        for (Subscriber s : subscribers)
        {
            s.update(event);
        }
    }

    public void viewSubscribers()
    {
        for (Subscriber s : subscribers)
        {
            ConcreteSubscriber cs = (ConcreteSubscriber) s;
            System.out.println(cs.name + " " + cs.mailbox);
        }
    }

    public void getKeyboardInfo()
    {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine())
        {
            String line = input.nextLine();
            notifySubscribers(line);
            viewSubscribers();
        }
    }
}
