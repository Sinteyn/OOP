package org.example.sem1;

import org.example.sem1.model.HotDrink;
import org.example.sem1.model.HotDrinkVendingMachine;
import org.example.sem1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> list1 = new ArrayList<>();

        list1.add(new HotDrink("Эспрессо", 50.0, 100, 85));
        list1.add(new HotDrink("Капучино", 100.0, 200, 55));
        list1.add(new HotDrink("Капучино", 150.0, 400, 55));
        list1.add(new HotDrink("Горячий шоколад", 95.0, 250, 75));

        HotDrinkVendingMachine hotDrinkVendingMachine1 = new HotDrinkVendingMachine(list1);

        List<Product> list2 = new ArrayList<>();

        list2.add(new HotDrink("Чай черный", 30.0, 250, 90));
        list2.add(new HotDrink("Чай зеленый", 40.0, 250, 70));
        list2.add(new HotDrink("Матча чай", 150.0, 300, 75));
        list2.add(new HotDrink("Каркаде", 40.0, 200, 45));

        HotDrinkVendingMachine hotDrinkVendingMachine2 = new HotDrinkVendingMachine(list2);

        System.out.println(hotDrinkVendingMachine1.getProduct("Капучино", 200, 55));
        System.out.println(hotDrinkVendingMachine2.getProduct("Каркаде", 200, 45));
    }
}
