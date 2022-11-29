package com.company;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Product {
    private int id;
    private String name;
    private String company;
    private LocalDate date;

    public Product(int id, String name, String company, LocalDate date) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(company, product.company) && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, date);
    }
}
