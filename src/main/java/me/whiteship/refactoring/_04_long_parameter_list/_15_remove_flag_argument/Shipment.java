package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument;

import java.time.LocalDate;

public class Shipment {

//    public LocalDate deliveryDate(Order order, boolean isRush) {
//        if (isRush) {
////            int deliveryTime = switch (order.getDeliveryState()) {
////                case "WA", "CA", "OR" -> 1;
////                case "TX", "NY", "FL" -> 2;
////                default -> 3;
////            };
////            return order.getPlacedOn().plusDays(deliveryTime);
//            return rushDeliveryDate(order);
//        } else {
////            int deliveryTime = switch (order.getDeliveryState()) {
////                case "WA", "CA" -> 2;
////                case "OR", "TX", "NY" -> 3;
////                default -> 4;
////            };
////            return order.getPlacedOn().plusDays(deliveryTime);
//            return regularDeliveryDate(order);
//        }
//    }

//    private LocalDate regularDeliveryDate(Order order) {
    public LocalDate regularDeliveryDate(Order order) {
        int deliveryTime = switch (order.getDeliveryState()) {
            case "WA", "CA" -> 2;
            case "OR", "TX", "NY" -> 3;
            default -> 4;
        };
        return order.getPlacedOn().plusDays(deliveryTime);
    }

//    private LocalDate rushDeliveryDate(Order order) {
    public LocalDate rushDeliveryDate(Order order) {
        int deliveryTime = switch (order.getDeliveryState()) {
            case "WA", "CA", "OR" -> 1;
            case "TX", "NY", "FL" -> 2;
            default -> 3;
        };
        return order.getPlacedOn().plusDays(deliveryTime);
    }
}
