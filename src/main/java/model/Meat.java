package model;

import java.math.BigDecimal;

public class Meat extends Food implements Discountable{

    public Meat(Integer amount, BigDecimal price) {
        super(amount, price);
        this.isVegetarian = false;
    }

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.valueOf(0);
    }
}
