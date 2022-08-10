package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class OrderProcessor {

//    private EmailService emailService;

    private NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyShipping(Shipping shipping) {
//        EmailMessage emailMessage = new EmailMessage();
//        emailMessage.setTitle(shipping.getOrder() + " is shipped");
//        emailMessage.setTo(shipping.getEmail());
//        emailMessage.setFrom("no-reply@whiteship.com");
//        emailService.sendEmail(emailMessage);
        Notification notification = Notification.newNotification(shipping.getOrder() + " is shipped")
                        .receiver(shipping.getEmail())
                        .sender("no-reply@whiteship.com");
        notificationService.sendNotification(notification);
    }

////    private void sendNotification(Shipping shipping) {
//    private void sendNotification(Notification notification) {
//        notificationService.sendNotification(notification);
////        EmailMessage emailMessage = new EmailMessage();
////        emailMessage.setTitle(shipping.getOrder() + " is shipped");
////        emailMessage.setTo(shipping.getEmail());
////        emailMessage.setFrom("no-reply@whiteship.com");
////        emailService.sendEmail(emailMessage);
//    }

}
