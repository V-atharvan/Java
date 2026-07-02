package org.example.notification;

public class EmailSer implements NotificationService {

    @Override
    public void sendEmail() {
        System.out.println("Email send !!!");
    }
}
