package dairyProducts;

import java.time.LocalDate;

public class Milk extends DairyProducts{
    public Milk(int id, String name, String company, LocalDate date) {
        super(id, name, company, date);
    }
}
