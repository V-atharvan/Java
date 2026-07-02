package org.example;

import org.example.notification.EmailSer;
import org.example.notification.NotificationService;
import org.example.notification.PopUpService;
import org.example.notification.SmsService;

public class OrderService {

    EmailSer es = new EmailSer();
    NotificationService notifypop = new PopUpService();
    NotificationService notifysms = new SmsService();
    NotificationService notifyemail = new EmailSer();



    public void placeorder () {
        System.out.println("Order placed !!!");
        es.sendEmail();
    }
}
