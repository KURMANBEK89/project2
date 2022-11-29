package com.company.wheatProducts;

import com.company.Product;

import java.time.LocalDate;

public abstract class WheatProducts extends Product {

    public WheatProducts(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
