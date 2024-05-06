package model.constants;

import java.math.BigDecimal;

public enum Discount {

    SIXTY(BigDecimal.valueOf(60));

    private final BigDecimal discount;

    Discount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getBigDecimal() {
        return this.discount;
    }
}
