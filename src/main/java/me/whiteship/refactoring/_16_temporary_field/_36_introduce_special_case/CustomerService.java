package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

public class CustomerService {

    public String customerName(Site site) {
//        Customer customer = site.getCustomer();
//
//        String customerName;
////        if (customer.getName().equals("unknown")) {
//        if (customer.isUnknown()) {
//            customerName = "occupant";
//        } else {
//            customerName = customer.getName();
//        }
//
//        return customerName;

        return site.getCustomer().getName();
    }

    public BillingPlan billingPlan(Site site) {
//        Customer customer = site.getCustomer();
////        return customer.getName().equals("unknown") ? new BasicBillingPlan() : customer.getBillingPlan();
//        return customer.isUnknown() ? new BasicBillingPlan() : customer.getBillingPlan();
        return site.getCustomer().getBillingPlan();
    }

    public int weeksDelinquent(Site site) {
//        Customer customer = site.getCustomer();
////        return customer.getName().equals("unknown") ? 0 : customer.getPaymentHistory().getWeeksDelinquentInLastYear();
//        return customer.isUnknown() ? 0 : customer.getPaymentHistory().getWeeksDelinquentInLastYear();
        return site.getCustomer().getPaymentHistory().getWeeksDelinquentInLastYear();
    }

//    private boolean isUnknown(Customer customer) {
//        return customer.getName().equals("unknown");
//    }
}
