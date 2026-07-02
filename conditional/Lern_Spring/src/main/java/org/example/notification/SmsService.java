package org.example.notification;

public class SmsService implements NotificationService {

    @Override
    public void sendEmail() {
        System.out.println("sms send !!!");
    }


}
