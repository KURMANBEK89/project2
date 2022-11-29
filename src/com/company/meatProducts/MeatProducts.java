package com.company.meatProducts;

import com.company.Product;

import java.time.LocalDate;

public abstract class MeatProducts extends Product {

    public MeatProducts(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
