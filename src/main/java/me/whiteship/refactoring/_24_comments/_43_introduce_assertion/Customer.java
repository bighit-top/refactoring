package me.whiteship.refactoring._24_comments._43_introduce_assertion;

public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        //간단한 assert 코드
//        assert discountRate != null && discountRate >  0;

        //테스트 검증 가능한 코드
        if (discountRate != null && discountRate > 0) {
            throw new IllegalArgumentException(discountRate + " can't be minus.");
        }
        this.discountRate = discountRate;
    }
}
