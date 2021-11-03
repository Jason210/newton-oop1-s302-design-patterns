package observer1;

import java.util.ArrayList;
import java.util.Scanner;

class Publisher
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
        for (Subscriber subscriber : subscribers)
        {
            System.out.println(subscriber.toString());
        }
    }

    public void getKeyboardInfo()
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            notifySubscribers(line);
            viewSubscribers();
        }
    }
}
