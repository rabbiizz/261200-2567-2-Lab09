import DIP.*;
import LSP.*;
import OCP.*;

public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(10,10);
        System.out.println(R1.calculateArea());
        Circle R2 = new Circle(5);
        System.out.println(R2.calculateArea());
        Ellipse R3 = new Ellipse(300,200);
        System.out.println(R3.calculateArea());

        Eagle max = new Eagle();
        Penguin mark = new Penguin();
        Sparrow morgan = new Sparrow();
        Ostrich mumoo = new Ostrich();


        mark.move();
        morgan.move();
        mumoo.move();
        max.move();

        morgan.fly();
        max.fly();

        Order order = new Order();
        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        OrderProcessor orderProcessor2 = new OrderProcessor(new SMSNotifier());

        orderProcessor.processOrder(order);
        orderProcessor2.processOrder(order);

    }
}