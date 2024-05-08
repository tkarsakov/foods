package model;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Food implements Discountable{

    protected Integer amount;
    protected BigDecimal price;
    protected Boolean isVegetarian;

    public Food(Integer amount, BigDecimal price) {
        this.amount = Objects.requireNonNull(amount, "Amount can't be null.");
        this.price = Objects.requireNonNull(price, "Price can't be null.");
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public BigDecimal getBigDecimalAmount(){
        return BigDecimal.valueOf(amount);
    }
}
