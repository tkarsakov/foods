package model;

import java.math.BigDecimal;
import java.util.Objects;

import static model.constants.Discount.SIXTY;

public class Apple extends Food implements Discountable{

    private String color;

    public Apple(Integer amount, BigDecimal price, String color) {
        super(amount, price);
        this.color = Objects.requireNonNull(color, "Color can't be null!");
        this.isVegetarian = true;
    }

    @Override
    public BigDecimal getDiscount() {
        if (this.color.equalsIgnoreCase("red")) return SIXTY.getBigDecimal(); else return BigDecimal.valueOf(0);
    }
}
