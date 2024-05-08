package service;

import model.Food;

import java.math.BigDecimal;
import java.util.Objects;

public class ShoppingCart {

    private final Food[] foodList;

    public ShoppingCart(Food[] foodList) {
        this.foodList = Objects.requireNonNull(foodList, "Food list can't be null.");
    }

    public BigDecimal getPriceOfGoods() {
        BigDecimal result = new BigDecimal(0);
        for (Food foodItem : foodList) {
            result = result.add(foodItem.getPrice().multiply(foodItem.getBigDecimalAmount()));
        }
        return result;
    }

    public BigDecimal getPriceOfGoodsWithDiscount() {
        BigDecimal result = new BigDecimal(0);
        BigDecimal priceWithDiscount;
        for (Food foodItem : foodList) {
            if (foodItem.getDiscount().equals(BigDecimal.valueOf(0))) {
                priceWithDiscount = foodItem.getPrice();
            } else {
                priceWithDiscount = foodItem.getPrice().multiply(getDiscountMultiplier(foodItem));
            }
            result = result.add(priceWithDiscount.multiply(foodItem.getBigDecimalAmount()));
        }
        return result;
    }

    public BigDecimal getPriceOfVegeterianGoods() {
        BigDecimal result = new BigDecimal(0);
        for (Food foodItem : foodList) {
            if (foodItem.isVegetarian()) {
                result = result.add(foodItem.getPrice().multiply(foodItem.getBigDecimalAmount()));
            }
        }
        return result;
    }

    private BigDecimal getDiscountMultiplier(Food foodItem) {
        return BigDecimal.ONE.subtract(foodItem.getDiscount().divide(BigDecimal.valueOf(100)));
    }
}
