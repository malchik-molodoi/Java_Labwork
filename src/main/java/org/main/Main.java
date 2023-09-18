package org.main;
import org.classes.*;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.addToOrder(new Cream("Теймуровая", "Россия", 2.35f, 0.2f, 50));
        order.addToOrder(new Cream("Универсальная", "Россия", 5.69f, 0.2f, 150));
        order.addToOrder(new Pill("Афобазол", "Германия", 4.50f, 0.2f, 15));
        order.addToOrder(new Cream("Звездочка", "Вьетнам", 3.16f, 0.2f, 10));
        order.addToOrder(new Pill("Ибуклин", "Беларусь", 4.50f, 0.2f, 15));
        order.addToOrder(new Cream("Нежные ручки", "Беларусь", 4.50f, 0.2f, 85));
        order.addToOrder(new Pill("Кетаноф", "Россия", 3.30f, 0.2f, 5));
        order.addToOrder(new Spray("Люголь", "Германия", 3.39f, 0.2f, 200));
        order.addToOrder(new Pill("Валсартан", "Беларусь", 2.29f, 0.2f, 20));
        order.addToOrder(new Spray("Септоллете", "Россия", 5.30f, 0.2f, 150));


        order.printOrder();
    }
}