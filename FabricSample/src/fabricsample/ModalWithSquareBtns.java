/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricsample;

import fabricsample.buttons.Buttons;
import fabricsample.buttons.SquareButtons;
/**
 *
 * @author Администратор
 */
public class ModalWithSquareBtns extends Modal  {
    @Override
    public Buttons createButton(){
        return (Buttons) new SquareButtons();
    }
}
