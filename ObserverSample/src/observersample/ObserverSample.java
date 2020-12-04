/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observersample;

import observersample.editor.EditorOfEvents;
import observersample.listeners.*;
import observersample.publisher.EventManager;
/**
 *
 * @author Администратор
 */
public class ObserverSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorOfEvents editor = new EditorOfEvents();
        editor.events.subscribe("meatProducts", new SMSNotificationListener("+37353876"));
        editor.events.subscribe("meatProducts", new SMSNotificationListener("+37353879"));
        editor.events.subscribe("breadDelivery", new SMSNotificationListener("+37393876"));
        editor.meatProducts();
        editor.breadDelivery();
    }
    
}
