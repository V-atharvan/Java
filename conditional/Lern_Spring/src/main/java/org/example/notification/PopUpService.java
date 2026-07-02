package org.example.notification;

public class PopUpService implements NotificationService {

    @Override
    public void sendEmail() {
        System.out.println("popup send !!!");
    }
}
