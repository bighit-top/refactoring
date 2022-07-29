package me.whiteship.refactoring._09_feature_envy;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
//        var electicityBill = electricityUsage.getAmount() * electricityUsage.getPricePerUnit();
//        double gasBill = gasUsage.getAmount() * gasUsage.getPricePerUnit();
//        return electicityBill + gasBill;
        return electricityUsage.getElectricityBill() + gasUsage.getGasBill(this);
    }

}
