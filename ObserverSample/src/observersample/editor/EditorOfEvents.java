/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observersample.editor;

import observersample.publisher.EventManager;

/**
 *
 * @author Администратор
 */
public class EditorOfEvents {

    public EventManager events;
    private String message;

    public EditorOfEvents() {
        this.events = new EventManager("meatProducts", "milkProduscts", "breadDelivery");
    }

    public void meatProducts() {
        message = "Meat products arrived";
        events.notify("meatProducts", message);
    }

    public void milkProduscts() {
        message = "Milk products arrived";
        events.notify("milkProduscts", message);
    }
    public void breadDelivery() {
        message = "Bread arrived";
        events.notify("breadDelivery", message);    
    }
}
