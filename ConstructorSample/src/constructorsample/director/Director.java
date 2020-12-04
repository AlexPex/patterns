/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorsample.director;

import constructorsample.fridge.FridgeType;
import constructorsample.fridge.TradeMark;
import constructorsample.builders.Builders;
/**
 *
 * @author Администратор
 */
public class Director {
    public void ConstructFridgeClassA_plus(Builders builder){
        builder.setFridgeType(FridgeType.Bottom_Freezer);
        builder.setColor("black");
        builder.setHeight(1920);
        builder.setWidth(595);
        builder.setTradeMark(TradeMark.Samsung);
    }
    
    public void ConstructFridgeSidebySide(Builders builder){
        builder.setFridgeType(FridgeType.Side_by_Side);
        builder.setColor("golden");
        builder.setHeight(1744);
        builder.setWidth(912);
        builder.setTradeMark(TradeMark.LG);
    }
}
