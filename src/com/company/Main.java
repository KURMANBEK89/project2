package com.company;

import com.company.dairyProducts.Kefir;
import com.company.dairyProducts.Milk;
import com.company.dairyProducts.Yogurt;
import com.company.meatProducts.Fish;
import com.company.meatProducts.Meat;
import com.company.meatProducts.Sausages;
import com.company.wheatProducts.Bread;
import com.company.wheatProducts.Flour;
import com.company.wheatProducts.Pasta;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Product> newArrivles = new ArrayList<>();
        List<Product> market = new ArrayList<>();
        List<Product> sale = new ArrayList<>();
        newArrivles.add(new Milk(1, "Moloko", "Milka", LocalDate.of(2022, 12, 28)));
        newArrivles.add(new Kefir(2, "Kefir", "Milka", LocalDate.of(2022, 12, 31)));
        newArrivles.add(new Yogurt(3, "Yogurt", "Molochnic", LocalDate.of(2022, 12, 27)));
        newArrivles.add(new Fish(4, "Ryba", "Toiboss", LocalDate.of(2023, 01, 20)));
        newArrivles.add(new Meat(5, "Myaso", "Alkoni", LocalDate.of(2023, 01, 17)));
        newArrivles.add(new Sausages(6, "Yogurt", "Toiboss", LocalDate.of(2023, 1, 07)));
        newArrivles.add(new Bread(7, "Hleb", "Yashar", LocalDate.of(2022, 12, 30)));
        newArrivles.add(new Flour(8, "Muka", "Nur", LocalDate.of(2022, 12, 16)));
        newArrivles.add(new Pasta(9, "Makaron", "Nur", LocalDate.of(2022, 12, 9)));

        for (Product p : newArrivles) {
            if (p.getCompany().equals("Milka") && p.getDate().plusDays(30).isAfter(LocalDate.now())) {
                market.add(p);
            } else if (p.getCompany().equals("Toiboss") && p.getDate().plusDays(30).isAfter(LocalDate.now())) {
                market.add(p);
            } else if (p.getCompany().equals("Nur") && p.getDate().plusDays(30).isAfter(LocalDate.now())) {
                market.add(p);
            } else {
                System.out.println("Отказ");
            }
        }
        System.out.println(market);

        Iterator<Product> iter = market.iterator();
        while (iter.hasNext()) {
            if (iter.next().getDate().isBefore(LocalDate.now())) {
                System.out.println("Prosrochenniy");
                iter.remove();
            } else if ((LocalDate.now()).plusDays(7).isAfter(iter.next().getDate())) {
                System.out.println("7 days do prosrochki");
                sale.add(iter.next());
            } else if ((iter.next().getDate().isAfter(LocalDate.now()))) {
                System.out.println("ne prosrochenniy");
            }
        }

        System.out.println("Vvedite login i parol:");
        Map<String, Integer> map = new HashMap<>();
        map.put("Admin", 4455);
        for (Map.Entry<String, Integer> hashmap : map.entrySet()) {
            for (int i = 0; ; i++) {
                Scanner scanner = new Scanner(System.in);
                String login = scanner.nextLine();
                int password = scanner.nextInt();
                if (login.equals(hashmap.getKey()) && password == hashmap.getValue()) {
                    System.out.println(market);
                    break;
                } else {
                    System.out.println("Try again");
                }
            }
        }
    }
}