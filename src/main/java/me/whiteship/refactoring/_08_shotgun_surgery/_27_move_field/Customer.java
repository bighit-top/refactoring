package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private String name;

//    private double discountRate;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
//        this.discountRate = discountRate;
//        this.contract = new CustomerContract(dateToday());
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    public double getDiscountRate() {
//        return discountRate;
        return contract.getDiscountRate();
    }

    public void setDiscountRate(double discountRate) {
//        this.discountRate = discountRate;
        contract.setDiscountRate(discountRate);
    }

    public void becomePreferred() {
//        this.discountRate += 0.03;
        this.setDiscountRate(this.getDiscountRate() + 0.03);
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
//        return value.subtract(value.multiply(BigDecimal.valueOf(this.discountRate))).doubleValue();
        return value.subtract(value.multiply(BigDecimal.valueOf(this.getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
