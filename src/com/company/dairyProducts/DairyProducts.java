package com.company.dairyProducts;

import com.company.Product;

import java.time.LocalDate;

public abstract class DairyProducts  extends Product {

    public DairyProducts(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
