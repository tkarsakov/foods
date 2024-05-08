import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat(5, BigDecimal.valueOf(100));
        Apple apple1 = new Apple(10, BigDecimal.valueOf(50), Colour.RED.toString());
        Apple apple2 = new Apple(8, BigDecimal.valueOf(60), Colour.GREEN.toString());
        ShoppingCart cart = new ShoppingCart(new Food[]{meat, apple1, apple2});

        System.out.println("Price of goods: " + cart.getPriceOfGoods());
        System.out.println("Price of goods with discounts applied: " + cart.getPriceOfGoodsWithDiscount());
        System.out.println("Price of vegeterian goods: " + cart.getPriceOfVegeterianGoods());
    }
}
