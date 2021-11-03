package observer1;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println("Enter Text: ");
        Publisher shop = new Publisher();
       

        shop.addSubscriber(new Subscriber()
        {
            public void update(String e)
            {
                System.out.println("Received response: " + e);
            }
        });
        
        shop.addSubscriber(new Subscriber()
        {
            public void update(String e)
            {
                System.out.println("Received response: " + e);
            }
        });

        shop.getKeyboardInfo();
    }
}
