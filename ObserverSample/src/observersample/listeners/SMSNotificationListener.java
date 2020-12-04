/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observersample.listeners;

/**
 *
 * @author Администратор
 */
public class SMSNotificationListener implements EventListener {
    private String phone;

    public SMSNotificationListener(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("SMS notification to phone:" + phone);
        System.out.println("Event name: " + eventType);
        System.out.println("Message: '" + message + "'");
    }
}
