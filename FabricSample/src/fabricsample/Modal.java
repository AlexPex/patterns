/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricsample;
import fabricsample.buttons.Buttons;

/**
 *
 * @author Администратор
 */
public abstract class Modal {
    public void renderModal(){
        Buttons okButton = createButton();
        okButton.render("Ok");
    }
    public abstract Buttons createButton();
}
