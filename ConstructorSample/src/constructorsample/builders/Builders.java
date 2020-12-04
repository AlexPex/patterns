/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorsample.builders;

import constructorsample.fridge.FridgeType;
import constructorsample.fridge.TradeMark;
/**
 *
 * @author Администратор
 */
public interface Builders {
    void setFridgeType(FridgeType type);
    void setColor(String color);
    void setTradeMark(TradeMark trademark);
    void setHeight(float height);
    void setWidth(float width);
}
