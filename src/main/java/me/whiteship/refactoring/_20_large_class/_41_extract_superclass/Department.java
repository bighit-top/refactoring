package me.whiteship.refactoring._20_large_class._41_extract_superclass;

import java.util.List;

//public class Department {
public class Department extends Party {

//    private String name;

    private List<Employee> staff;

    public Department(String name) {
        super(name);
    }

//    public String getName() {
//        return name;
//    }


    public List<Employee> getStaff() {
        return staff;
    }

//    public double totalMonthlyCost() {
    @Override
    public double monthlyCost() {
        return this.staff.stream().mapToDouble(e -> e.monthlyCost()).sum();
    }

//    public double totalAnnualCost() {
//    public double annualCost() {
//        return this.monthlyCost() * 12;
//    }

    public int headCount() {
        return this.staff.size();
    }
}
