package org.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order implements Sellable{

    private List<Drug> basket_;      //корзина
    private float totalPrice_;
    private static int orderNo_;

    public Order(){
        basket_ = new ArrayList<Drug>();
        orderNo_++;
    }

    public void addToOrder(Drug obj){
        basket_.add(obj);
    }

    public void printOrder(){
        int i = 1;
        Iterator<Drug> it = basket_.iterator();
        System.out.format("=================Заказ #%d===============\n", orderNo_);
        while(it.hasNext()){
            System.out.format("%s", it.next().toString());
        }
        System.out.println();
        System.out.format("Итоговая стоимость заказа: %.2fBYN\n", countPrice());
        System.out.println("=================================================");

    }

    @Override
    public float countPrice() {
        float total = 0;
        for (Drug drug : basket_) {
            total += drug.price_;
        }
        return total;
    }

}
